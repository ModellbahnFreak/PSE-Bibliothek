package de.unistuttgart.kriegerreissner.bibliothek.media;

import de.unistuttgart.kriegerreissner.bibliothek.bibUser.BibUser;
import de.unistuttgart.kriegerreissner.bibliothek.library.Library;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

/**
 * <p>A class representing a digital media</p>
 * <p>The digital media is stored on some network address. The link of which can be retrieved from this class.</p>
 *
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public abstract class MultiMedia implements Media {

    /**
     * Title of this Multimedia
     */
    private final String title;

    /**
     * Unique Id of this MultiMedia. Won't change during the lifetime of the media.
     */
    private final String id;

    /**
     * The url where this multimedia object can be found.
     */
    private final String mediaUrl;

    /**
     * The length of the multi media in seconds
     */
    private final int lenSec;

    /**
     * The file type of the multimedia
     */
    private final String mimeType;

    /*@
     @ requires id != null;
     @ requires !id.isEmpty();
     @ requires title != null;
     @ requires !title.isEmpty();
     @ requires lenSec >= 0;
     @ requires mimeType != null;
     @ requires !mimeType.isEmpty():
     */

    /**
     * <p>Constructor setting the id and title of the multimedia.</p>
     *
     * @param id       The (within the library) unique id. Mustn't be null or empty
     * @param title    The title of the media to be displayed in the gui. Mustn't be null or empty
     * @param mediaUrl The url where this multimedia is stored.
     * @param lenSec   The length of the multimedia clip in seconds
     * @param mimeType The file type of the clip
     */
    protected MultiMedia(final String id, final String title, final String mediaUrl, final int lenSec, final String mimeType) {
        this.id = id;
        this.title = title;
        this.mediaUrl = mediaUrl;
        this.lenSec = lenSec;
        this.mimeType = mimeType;
    }

    /*@
     @ requires true;
     @ ensures \result >= 0;
     @ pure;
     */

    /**
     * gets the length of this multimedia
     *
     * @return the length of this MultiMedia in seconds
     */
    public int getLengthSec() {
        return this.lenSec;
    }

    /*@
     @ requires true;
     @ ensures \result != null;
     @ ensures !result.isEmpty();
     @ pure;
     */

    /**
     * gets the mime type of this multimedia
     *
     * @return the mime of this MultiMedia
     */
    public String getMimeType() {
        return this.mimeType;
    }

    /**
     * <p>Returns the id-String of the media.</p>
     * <p>The id String is an alpha numeric combination which uniquely identifies the media across all media. The id will never change during the lifetime of a media object. The id will always be set and a media object without id is an invalid media object.</p>
     *
     * @return The id of the media as string
     */
    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <p>Returns the title of the media as String.</p>
     * <p>The title is the name under which the media is known. The title doesn't need to be unique as but it won't change during the lifetime of the media object. Any media must have a title. And empty or <code>null</code> title is not allowed.</p>
     *
     * @return The title of the media describing the content
     */
    @Override
    public String getTitle() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <p>Returns the authors of the media</p>
     * <p>The set of authors returned might be empty if the author of the media is unknown or anonymous. It can also contain more than one author if more than one person worked on the specific title. The list of authors might change during the lifetime of a media as people work on it and get added to the list of authors.</p>
     *
     * @return An unmodifiable version of the list of authors. The authors themselves however won't be unmodifiable.
     */
    @Override
    public Set<String> getAuthor() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <p>Returns the library this media is currently owned by.</p>
     * <p>The parent library might change if the media migrates to another library permanently. If the book is in another library temporarily (e.g. if it as returned in that other library and will be transported back soon) the parent library is still set to the library the media is owned by.</p>
     *
     * @return The {@link Library} which owns this media object.
     */
    @Override
    public Optional<Library> getParentLibrary() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Returns weather this media object is currently available to lend.
     *
     * @return Weather this media can be lent
     */
    @Override
    public boolean isAvailable() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <p>Gets the {@link BibUser} who has currently lent the media</p>
     *
     * @return The optional of the user who has lent the media or {@link Optional#empty()} if it's not lent
     */
    @Override
    public Optional<BibUser> getCurrentLender() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <p>Sets the user who has currently lent the media. If the book in not lent, {@link Optional#empty()}</p>
     *
     * @param user The user who has lent the media or an empty optional
     */
    @Override
    public void setCurrentLender(final Optional<BibUser> user) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Returns a short description of the media. This might be empty if none is available
     *
     * @return The short description
     */
    @Override
    public String getShortDescription() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * If available, the url to a image file with the cover of the media. If there is none, the returned String might
     * be empty. This image should be used as preview in the gui.
     *
     * @return The string of a url to an image with the cover
     */
    @Override
    public String getCoverImageLink() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Changes the parent library of this media object
     *
     * @param lib The new parent library which now owns the media
     */
    @Override
    public void moveToLibrary(final Library lib) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Removes the reference to the current parent library. This won't remove the media from the set of books of the
     * library.
     */
    @Override
    public void removeFromLibrary() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Returns the date and time on which the media was taken from the library
     *
     * @return A {@link Date} object describing the point in time the book was taken.
     */
    @Override
    public Date getLendDateTime() {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <p>Returns the address where this multimedia's content is stored.</p>
     * <p>The url will only be accessible for users who have lent this media.</p>
     *
     * @return The String of the url where the content of this media is located.
     */
    public String getMediaUrl() {
        return this.mediaUrl;
    }
}
