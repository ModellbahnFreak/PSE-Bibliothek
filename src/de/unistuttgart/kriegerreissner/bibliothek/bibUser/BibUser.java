package de.unistuttgart.kriegerreissner.bibliothek.bibUser;

import de.unistuttgart.kriegerreissner.bibliothek.media.Media;

import java.util.Set;

/**
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public abstract class BibUser {

	/*@
	 @ public instance invariant id != null;
	 @ public instance invariant !id.isEmpty();
	 @ public instance invariant displayName != null;
	 @ public instance invariant !displayName.isEmpty();
	 @ public instance invariant username != null;
	 @ public instance invariant !username.isEmpty();
	 */

	private final String id;
	private final String displayName;
	private final int lendingDays;
	private final String username;

	/*@
	 @ requires username != null;
	 @ requires !username.isEmpty();
	 @ requires displayName != null;
	 @ requires !displayName.isEmpty();
	 @ requires id != null;
	 @ requires !id.isEmpty();
	 @*/
	/**
	 * <p>Initializes a new User with the given date</p>
	 * <p>Sets the id, username and displayName of the user to the given values. The username and the id will never change after being initialized. other properties of a user can be changed.</p>
	 * @param username The username of the new user which identifies his account
	 * @param displayName The name of the user to be displayed for others
	 * @param id The unique user id. This won't be checked.
	 */
	BibUser(final String username, final String displayName, final String id) {
		assert username != null;
		assert !username.isEmpty();
		assert displayName != null;
		assert !displayName.isEmpty();
		assert id != null;
		assert !id.isEmpty();

		this.username = username;
		this.displayName = displayName;
		this.id = id;
		this.lendingDays = 0;
	}

	/*@
	 @ requires media != null;
	 @*/
	/**
	 * <p>Adds the given media to the collection of medias currently lent by the user</p>
	 * <p>This will also start the timer for how long the book may still be lent and set the media to be lent by this user.</p>
	 * @param media The {@link Media} object to be lent.
	 */
	public abstract void lendMedia (Media media);

	/*@
	 @ requires media != null;
	 @*/
	/**
	 * <p>Returns the given media</p>
	 * <p>Removes the media from the list of lent media and tells the media it's no longer lent.</p>
	 * @param media The media to be returned to the library
	 */
	public abstract void returnMedia (Media media);

	/*@
	 @ requires true;
	 @ ensures \result != null;
	 @ ensures \result (is unmodifiable);
	 @*/
	/**
	 * <p>Returns an unmodifiable set of currently lent books</p>
	 * <p>The set will be unmodifiable so interacting with it won't affect the lent books.</p>
	 * @return Unmodifiable set of the currently lent books of this user (expired and valid)
	 */
	public abstract Set<Media> getLentMedia();

	/*@
	 @ requires media != null;
	 @*/
	/**
	 * <p>Returns how many days the user has left to return this specific media</p>
	 * @param media The media to get the time for.
	 * @return The number of days until the user must return the media. Can be negative, if the media is overdue.
	 */
	public abstract int getDaysLeft(Media media);

	/*@
	 @ requires true;
	 @ ensures \result >= 0;
	 @*/
	/**
	 * <p>Returns how much the user still must pay.</p>
	 * <p>This is the sum of how much he must pay for the usage plus the penalties for not returning media on time.</p>
	 * @return The amount he has to pay in the currency of your choice.
	 */
	public abstract int getOpenPayments();

	/*@
	 @ requires amount >= 0;
	 @*/
	/**
	 * <p>Pays the given amount</p>
	 * <p>If the user has to pay money (see {@link BibUser#getOpenPayments()} it can be payed with this method.</p>
	 * @param amount The amount of money (the currency of your choice) the user has payed.
	 */
	public abstract void pay(int amount);

	/*@
	 @ requires true;
	 @ ensures \result != null;
	 @*/
	/**
	 * <p>Returns the ID of the user. This won't change and will always be the same and unique</p>
	 * @return The library id of this user
	 */
	public abstract String getBibUserId();

    /**
     * <p>Returns the display name of the user</p>
     * <p>The display name of the user is the name displayed in the gui and shown to others. It's not neccesariry
     * unique and might change during the lifetime of the user as the user can change it himself, however it will
     * never be empty or null.</p>
     */
    public String getDisplayName() {
        return this.displayName;
    }
}
