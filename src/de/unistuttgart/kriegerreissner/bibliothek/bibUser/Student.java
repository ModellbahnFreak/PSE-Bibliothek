package de.unistuttgart.kriegerreissner.bibliothek.bibUser;

import de.unistuttgart.kriegerreissner.bibliothek.media.Media;

import java.util.Set;

public class Student implements BibUser {
    /**
     * <p>Adds the given media to the collection of medias currently lended by the user</p>
     * <p>This will also start the timer for how long the book may still be lended and set the media to be lended by this user.</p>
     *
     * @param media The {@link Media} object to be lended.
     */
    @Override
    public void lendMedia(Media media) {

    }

    /**
     * <p>Returns the given media</p>
     * <p>Removes the media from the list of lended media and tells the media it's no longer lended.</p>
     *
     * @param media The media to be returned to the library
     */
    @Override
    public void returnMedia(Media media) {

    }

    /**
     * <p>Returns an unmodifiable set of currently lended books</p>
     * <p>The set will be unmodifiable so interacting with it won't affect the lended books.</p>
     *
     * @return Unmodifiable set of the currently lended books of this user (expired and valid)
     */
    @Override
    public Set<Media> getLendedMedia() {
        return null;
    }

    /**
     * <p>Returns how many days the user has left to return this specific media</p>
     *
     * @param media The media to get the time for.
     * @return The number of days until the user must return the media. Can be negative, if the media is overdue.
     */
    @Override
    public int getDaysLeft(Media media) {
        return 0;
    }

    /**
     * <p>Returns how much the user still must pay.</p>
     * <p>This is the sum of how much he must pay for the usage plus the penalties for not returning media on time.</p>
     *
     * @return The amount he has to pay in euros.
     */
    @Override
    public int getOpenPayments() {
        return 0;
    }

    /**
     * <p>Pays the given amount</p>
     * <p>If the user has to pay money (see {@link BibUser#getOpenPayments()} it ca be payed with this method.</p>
     *
     * @param amount The amount of euros the user has payed.
     */
    @Override
    public void pay(int amount) {

    }

    /**
     * <p>Returns the ID of the user. This won't change and will always be the same and unique</p>
     *
     * @return The library id of this user
     */
    @Override
    public String getBibUserId() {
        return null;
    }
}
