package de.unistuttgart.kriegerreissner.bibliothek.media;

import de.unistuttgart.kriegerreissner.bibliothek.bibUser.BibUser;
import de.unistuttgart.kriegerreissner.bibliothek.library.Library;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

/**
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public interface Media {

    /*@
     @ requires true;
     @ ensures \result != null;
     @ ensures !\result.isEmpty();
     @*/

    /**
     * <p>Returns the id-String of the media.</p>
     * <p>The id String is an alpha numeric combination which uniquely identifies the media across all media. The id will never change during
     * the lifetime of a media object. The id will always be set and a media object without id is an invalid media object.</p>
     *
     * @return The id of the media as string
     */
    String getId();

    /*@
     @ requires true;
     @ ensures \result != null;
     @ ensures !\result.isEmpty();
     @*/

    /**
     * <p>Returns the title of the media as String.</p>
     * <p>The title is the name under which the media is known. The title doesn't need to be unique as but it won't change during the
     * lifetime of the media object. Any media must have a title. And empty or <code>null</code> title is not allowed.</p>
     *
     * @return The title of the media describing the content
     */
    String getTitle();

    /*@
     @ requires true;
     @ ensures \result != null;
     @ ensures !\result.contains(null);
     @*/

    /**
     * <p>Returns the authors of the media</p>
     * <p>The set of authors returned might be empty if the author of the media is unknown or anonymous. It can also contain more than one
     * author if more than one person worked on the specific title. The list of authors might change during the lifetime
     * of a media as people work on it and get added to the list of authors.</p>
     *
     * @return An unmodifiable version of the list of authors. The authors themselves however won't be unmodifiable.
     */
    Set<String> getAuthor();

    /*@
     @ requires true;
     @ ensures \result != null;
     @*/

    /**
     * <p>Returns the library this media is currently owned by.</p>
     * <p>The parent library might change if the media migrates to another library permanently. If the book is in another library
     * temporarily (e.g. if it as returned in that other library and will be transported back soon) the parent library is still set to the library the media is owned by.</p>
     *
     * @return The {@link Library} which owns this media object.
     */
    Optional<Library> getParentLibrary();

    /*@
     @ requires true;
     @*/

    /**
     * Returns weather this media object is currently available to lend.
     *
     * @return Weather this media can be lent
     */
    boolean isAvailable();

    /*@
     @ requires true;
     @ ensures \result != null;
     @*/

    /**
     * <p>Gets the {@link BibUser} who has currently lent the media</p>
     *
     * @return The optional of the user who has lent the media or {@link Optional#empty()} if it's not lent
     */
    Optional<BibUser> getCurrentLender();

    /*@
     @ requires user != null;
     @*/

    /**
     * <p>Sets the user who has currently lent the media. If the book in not lent, {@link Optional#empty()}</p>
     *
     * @param user The user who has lent the media or an empty optional
     */
    void setCurrentLender(Optional<BibUser> user);

    /*@
     @ requires true;
     @ ensures \result != null;
     @*/

    /**
     * Returns a short description of the media. This might be empty if none is available
     *
     * @return The short description
     */
    String getShortDescription();

    /*@
     @ requires true;
     @ ensures \result != null;
     @*/

    /**
     * If available, the url to a image file with the cover of the media. If there is none, the returned String might
     * be empty. This image should be used as preview in the gui.
     *
     * @return The string of a url to an image with the cover
     */
    String getCoverImageLink();

    /*@
     @ requires lib != null;
     @ ensures getParentLibrary().get() == lib;
     @*/

    /**
     * Changes the parent library of this media object
     *
     * @param lib The new parent library which now owns the media
     */
    void moveToLibrary(Library lib);

    /*@
     @ requires true;
     @ ensures getParentLibrary).isEmpty();
     */

    /**
     * Removes the reference to the current parent library. This won't remove the media from the set of books of the
     * library.
     */
    void removeFromLibrary();

    /**
     * Returns the date and time on which the media was taken from the library
     *
     * @return A {@link Date} object describing the point in time the book was taken.
     */
    Date getLendDateTime();
}
