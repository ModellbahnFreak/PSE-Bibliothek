package de.unistuttgart.kriegerreissner.bibliothek.bibUser;

import de.unistuttgart.kriegerreissner.bibliothek.media.Media;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public class BibUser {

	/*@
	 @ public instance invariant id != null;
	 @ public instance invariant !id.isEmpty();
	 @ public instance invariant displayName != null;
	 @ public instance invariant !displayName.isEmpty();
	 @ public instance invariant username != null;
	 @ public instance invariant !username.isEmpty();
	 @ public instance invariant lentBooks != null;
	 @ public instance invariant group != null;
	 */

    private final String id;
    private final String displayName;
    private final String username;
    private final Set<Media> lentBooks;
    private BibUserGroup group;


    /*@
	 @ requires username != null;
	 @ requires !username.isEmpty();
	 @ requires displayName != null;
	 @ requires !displayName.isEmpty();
	 @ requires id != null;
	 @ requires !id.isEmpty();
	 @ requires group != null;
	 @*/
    /**
     * <p>Initializes a new User with the given date</p>
     * <p>Sets the id, username and displayName of the user to the given values. The username and the id will never change after being initialized. other properties of a user can be changed.</p>
     *
     * @param username    The username of the new user which identifies his account
     * @param displayName The name of the user to be displayed for others
     * @param id          The unique user id. This won't be checked.
     * @param group       The bib user group.
     */
    BibUser(final String username, final String displayName, final String id, final BibUserGroup group) {
        assert username != null;
        assert !username.isEmpty();
        assert displayName != null;
        assert !displayName.isEmpty();
        assert id != null;
        assert !id.isEmpty();
        assert group != null;

        this.username = username;
        this.displayName = displayName;
        this.id = id;
        this.lentBooks = new HashSet<>();
        this.group = group;
    }



    /**
     * <p>Adds the given media to the collection of medias currently lent by the user</p>
     * <p>This will also start the timer for how long the book may still be lent and set the media to be lent by this user.</p>
     *
     * @param media The {@link Media} object to be lent.
     */
    public void lendMedia(final Media media) {
        throw new UnsupportedOperationException("Not implemented");
    }

	/*@
	 @ requires media != null;
	 @*/
    /**
     * <p>Returns the given media</p>
     * <p>Removes the media from the list of lent media and tells the media it's no longer lent.</p>
     *
     * @param media The media to be returned to the library
     */
    public void returnMedia(final Media media) {
        throw new UnsupportedOperationException("Not implemented");
    }

	/*@
	 @ requires media != null;
	 @ assignable media;
	 @*/
    /**
     * <p>Returns an unmodifiable set of currently lent books</p>
     * <p>The set will be unmodifiable so interacting with it won't affect the lent books.</p>
     *
     * @return Unmodifiable set of the currently lent books of this user (expired and valid)
     */
    public Set<Media> getLentMedia() {
        throw new UnsupportedOperationException("Not implemented");
    }

	/*@
	 @ requires true;
	 @ ensures \result != null;
	 @ ensures \result (is unmodifiable);
	 @ pure;
	 @*/
    /**
     * <p>Returns how many days the user has left to return this specific media</p>
     *
     * @param media The media to get the time for.
     * @return The number of days until the user must return the media. Can be negative, if the media is overdue.
     */
    public int getDaysLeft(final Media media) {
        throw new UnsupportedOperationException("Not implemented");
    }

	/*@
	 @ requires media != null;
	 @*/
    /**
     * <p>Returns how much the user still must pay.</p>
     * <p>This is the sum of how much he must pay for the usage plus the penalties for not returning media on time.</p>
     *
     * @return The amount he has to pay in the currency of your choice.
     */
    public int getOpenPayments() {
        throw new UnsupportedOperationException("Not implemented");
    }

	/*@
	 @ requires true;
	 @ ensures \result >= 0;
	 @ assignable amount
	 @*/
    /**
     * <p>Pays the given amount</p>
     * <p>If the user has to pay money (see {@link BibUser#getOpenPayments()} it can be payed with this method.</p>
     *
     * @param amount The amount of money (the currency of your choice) the user has payed.
     */
    public void pay(final int amount) {
        throw new UnsupportedOperationException("Not implemented");
    }

	/*@
	 @ requires amount >= 0;
	 @ pure;
	 @*/
    /**
     * <p>Returns the ID of the user. This won't change and will always be the same and unique</p>
     *
     * @return The library id of this user
     */
    public String getBibUserId() {
        throw new UnsupportedOperationException("Not implemented");
    }

	/*@
	 @ requires true;
	 @ ensures \result != null;
	 @ pure;
	 @*/
    /**
     * <p>Returns the display name of the user</p>
     * <p>The display name of the user is the name displayed in the gui and shown to others. It's not neccesariry
     * unique and might change during the lifetime of the user as the user can change it himself, however it will
     * never be empty or null.</p>
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /*@
     @ requires true;
     @ ensures \result != null;
     @ ensures !\result.isEmpty();
     @ pure;
     @*/
    /**
     * <p>Return the unique id of the library user.</p>
     * <p>The id is set once when the user is initialized and remains the same during the whole lifetime of this
     * user object. It must be unique within all users of a library.</p>
     *
     * @return The unique id of this user
     */
    public String getId() {
        return this.id;
    }

    /*@
     @ requires true;
     @ ensures \result != null;
     @ pure;
     */
    /**
     * <p>returns the group the user is currently in.</p>
     * <p>The group defines what the user can do in the library. E.g. how long he is allowed to lend media for.</p>
     *
     * @return The {@link BibUserGroup} value of the group the user belongs to.
     */
    public BibUserGroup getGroup() {
        return this.group;
    }

    /*@
     @ requires group != nul;
     @ ensures this.group == group;
     @ assignable group;
     @*/
    /**
     * <p>Up- or downgrades the users group.</p>
     * <p>The group defines what the user can do in the library. E.g. how long he is allowed to lend media for. Up-
     * or downgrading the users group changes his permissions which will also apply to already lent media. So if the
     * time he is allowed to lend media, decreases and a media is expired according to the new time, a fee will apply.
     * On the other hand if the time increases and a media was expired before, it won't be afterwards.
     * </p>
     *
     * @param group The new group which the user should be assigned to.
     */
    public void setGroup(final BibUserGroup group) {
        if (group == null) {
            throw new IllegalArgumentException("group must not be null");
        }
        this.group = group;
    }

    /*@
     @ requires true;
     @ ensures \result != null;
     @ ensures !\result.isEmpty();
     @ pure;
     */
    /**
     * <p>Returns a String representation of the user and some information about him</p>
     * <p>The string will be of the pattern "User [displayName] ([username]); currently lent [booksLent] media.
     * Remaining money to pay [moneyToPay]" which contains information about the users display- and username, how
     * many media he has currently lent and how much fees are open for the user to pay.</p>
     *
     * @return A string containing information about this user object
     */
    @Override
    public String toString() {
        return "User " + this.displayName + " (" + this.username + "); currently lent " + this.lentBooks.size() + " media." +
                " Remaining money to pay " + this.getOpenPayments();
    }
}
