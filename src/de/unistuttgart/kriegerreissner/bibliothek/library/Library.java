package de.unistuttgart.kriegerreissner.bibliothek.library;

import de.unistuttgart.kriegerreissner.bibliothek.exceptions.MediaUnavaliableException;
import de.unistuttgart.kriegerreissner.bibliothek.exceptions.MediaUnknownException;
import de.unistuttgart.kriegerreissner.bibliothek.media.Media;

import java.util.HashSet;
import java.util.Set;

/**
 * <p>Class for representing a library with media and users.</p>
 * <p>This class allows the management of a library. It can store the media which is available in the library as well
 * as users who can lend media. Each media can be available (users can lend them) or unavailable (already lent or
 * missing etc.)</p>
 * <p>Furthermore the library has a balance which is increased when users pay penalty fees for not returning a book
 * on time. A library also has a display name which ill be used on the gui to represent the library.</p>
 */
public class Library {
    /**
     * The display name of the library used on the gui. This can't change during the lifetime of the library.
     */
    private final String libraryName;

    /**
     * <p>The set of media this library owns. This includes all media (even lent and missing).</p>
     * <p>The Set is static, but the content might change as the library acquires or drops media.</p>
     */
    private final Set<Media> inventory;

    /**
     * <p>The set of currently available for lent media this library owns. Lent and missing media is not included.</p>
     * <p>The Set is static, but the content changes as the users lent and return media.</p>
     */
    private final Set<Media> availableMedia;

    /**
     * Instance of the {@link MediaSearcher} class responsible for finding the correct media object to a given query.
     * Will never change during the lifetime
     */
    private final MediaSearcher searchTool;

    /**
     * Instance of the user Manager, whiche cares about the users, so this class won't have to.
     */
    private final BibUserManager userManager;

    /**
     * The current balance of the library in the currency of your choice.
     */
    private int currentBalance;

    /**
     * <p>Initialized a library with the given display name.</p>
     * <p>The currentBalance is set to 0 and the inventory is initialized empty.</p>
     *
     * @param libraryName The display name (on the gui) of the library. Can't be null or empty or a
     *                    {@link IllegalArgumentException} is thrown.
     */
    public Library(final String libraryName) {
        this(libraryName, 0);
    }

    /**
     * <p>Initialized a library with the given display name and the given balance.</p>
     * <p>The libraries inventory is initialized empty.</p>
     *
     * @param libraryName    The display name (on the gui) of the library. Can't be null or empty or a
     *                       {@link IllegalArgumentException} is thrown.
     * @param currentBalance The balance which the library has in the beginning (currency of your choice).
     */
    public Library(final String libraryName, final int currentBalance) {
        if (libraryName == null || libraryName.isEmpty()) {
            throw new IllegalArgumentException("The given library displayName was null or empty");
        }
        this.libraryName = libraryName;
        this.currentBalance = currentBalance;
        this.inventory = new HashSet<>();
        this.availableMedia = new HashSet<>();
        this.searchTool = new MediaSearcher(this.inventory, this.availableMedia);
        this.userManager = new BibUserManager();
    }

    /**
     * <p>Removes the given media object from the library.</p>
     * <p>This method removes the given media object from the library, if it is owned by the library and currently
     * available.</p>
     *
     * @param media The media object to remove from the inventory of the library.
     * @throws MediaUnavaliableException If the media provided is currently not available.
     * @throws MediaUnknownException     If the media provided isn't owned by this library
     */
    void removeMedia(final Media media) throws MediaUnavaliableException, MediaUnknownException {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <p>Adds a new media to the collection of the library</p>
     * <p>This method will add the given media to the collection of the library, given it is not already part of it.
     * The parent Library tag of the given media object will be set to point to this library
     * </p>
     *
     * @param media The media to add to the library
     */
    void addNewMedia(final Media media) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <p>Removes the given amount of money from the current balance</p>
     * <p>If th balance is greater or equal the given amount, the given amount of money will be subtracted from the
     * current balance. If the current balance isn't high enough, an {@link IllegalArgumentException} ist trown</p>
     *
     * @param amount The amount of money (currency of your choice) to subrtact must be greater or equal to 0 and
     *               smaller or equal to the current balance of the library.
     */
    void useMoney(final int amount) {
        if (amount <= this.currentBalance) {
            this.currentBalance -= amount;
        } else {
            throw new IllegalArgumentException("The balance of the library is too low.\nBalance: " + this.currentBalance + "\nRemove amount: " + amount);
        }
    }
}
