package de.unistuttgart.kriegerreissner.bibliothek.library;

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
 *
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public class Library {

    /*@
     @ public instance invariant this.libraryName != null;
     @ public instance invariant !this.libraryName.isEmpty();
     @ public instance invariant this.currentBalance >= 0;
     @ public instance invariant this.inventory != null;
     @ public instance invariant this.availableMedia != null;
     @ public instance invariant searchTool != null;
     @ public instance invariant userManager != null;
     @*/

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

    /*@
     @ requires libraryName != null;
     @ !requires libraryName.isEmpty();
     @ ensures this.libraryName == libraryName;
     @ ensures this.currentBalance == 0;
     @ ensures this.inventory != null;
     @ ensures this.availableMedia != null;
     @ ensures searchTool != null;
     @ ensures userManager != null;
     @*/
    /**
     * <p>Initialized a library with the given display name.</p>
     * <p>The currentBalance is set to 0 and the inventory is initialized empty.</p>
     *
     * @param libraryName The display name (on the gui) of the library. Can't be null or empty or a
     *                    {@link IllegalArgumentException} is thrown.
     */
    public Library(final String libraryName) {
        this(libraryName, 0);

        if (libraryName == null || libraryName.isEmpty()) {
            throw new IllegalArgumentException("The given library displayName was null or empty");
        }
    }

    /*@
     @ requires libraryName != null;
     @ !requires libraryName.isEmpty();
     @ requires currentBalance >= 0;
     @ ensures this.libraryName == libraryName;
     @ ensures this.currentBalance == currentBalance;
     @ ensures this.currentBalance >= 0;
     @ ensures this.inventory != null;
     @ ensures this.availableMedia != null;
     @ ensures searchTool != null;
     @ ensures userManager != null;
     @*/
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
        if (currentBalance < 0) {
            throw new IllegalArgumentException("currentBalance must be >= 0");
        }

        this.libraryName = libraryName;
        this.currentBalance = currentBalance;
        this.inventory = new HashSet<>();
        this.availableMedia = new HashSet<>();
        this.searchTool = new MediaSearcher(this.inventory, this.availableMedia);
        this.userManager = new BibUserManager();
    }

    /*@
     @ requires amount >= 0;
     @ requires amount <= this.currentBalance;
     @ ensures this.currentBalance == (\old(this.currentBalance) - amount);
     @ assignable currentBalance;
     */
    /**
     * <p>Removes the given amount of money from the current balance</p>
     * <p>If th balance is greater or equal the given amount, the given amount of money will be subtracted from the
     * current balance. If the current balance isn't high enough, an {@link IllegalArgumentException} ist trown</p>
     *
     * @param amount The amount of money (currency of your choice) to subtract must be greater or equal to 0 and
     *               smaller or equal to the current balance of the library.
     */
    public void useMoney(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount must be >= 0");
        }

        if (amount <= this.currentBalance) {
            this.currentBalance -= amount;
        } else {
            throw new IllegalArgumentException("The balance of the library is too low.\nBalance: " + this.currentBalance + "\nRemove amount: " + amount);
        }
    }
}
