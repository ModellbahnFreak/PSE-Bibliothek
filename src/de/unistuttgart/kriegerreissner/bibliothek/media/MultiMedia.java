package de.unistuttgart.kriegerreissner.bibliothek.media;

import de.unistuttgart.kriegerreissner.bibliothek.bibUser.BibUser;
import de.unistuttgart.kriegerreissner.bibliothek.library.Library;

import java.util.Date;
import java.util.Optional;
import java.util.Set;

/**
 * A class representing a digital media
 *
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public abstract class MultiMedia implements Media {

    /**title for this Multimedia*/
    private final String title;

    /**id for this MultiMedia*/
    private final String id;

    /**
     * constructor which sets id and title
     * @param id
     * @param title
     */
    protected MultiMedia(final String id, final String title) {
        this.id = id;
        this.title = title;
    }

    /*@
     @ requires true;
     @ ensures \result >= 0;
     @ pure;
     */
    /**
     * gets the length of this multimedia
     * @return the length of this MultiMedia in seconds
     */
    abstract int getLengthSec();

    /*@
     @ requires true;
     @ ensures \result != null;
     @ ensures !result.isEmpty();
     @ pure;
     */
    /**
     * gets the mime type of this multimedia
     * @return the mime of this MultiMedia
     */
    abstract String getMimeType();

    /**
     * <p>Returns the id-String of the media.</p>
     * <p>The id String is an alpha numeric combination which uniquely identifies the media across all media. The id will never change during the lifetime of a media object. The id will always be set and a media object without id is an invalid media object.</p>
     *
     * @return The id of the media as string
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * <p>Returns the title of the media as String.</p>
     * <p>The title is the name under which the media is known. The title doesn't need to be unique as but it won't change during the lifetime of the media object. Any media must have a title. And empty or <code>null</code> title is not allowed.</p>
     *
     * @return The title of the media describing the content
     */
    @Override
    public String getTitle() {
        return null;
    }

    /**
     * <p>Returns the authors of the media</p>
     * <p>The set of authors returned might be empty if the author of the media is unknown or anonymous. It can also contain more than one author if more than one person worked on the specific title. The list of authors might change during the lifetime of a media as people work on it and get added to the list of authors.</p>
     *
     * @return An unmodifiable version of the list of authors. The authors themselves however won't be unmodifiable.
     */
    @Override
    public Set<String> getAuthor() {
        return null;
    }

    /**
     * <p>Returns the library this media is currently owned by.</p>
     * <p>The parent library might change if the media migrates to another library permanently. If the book is in another library temporarily (e.g. if it as returned in that other library and will be transported back soon) the parent library is still set to the library the media is owned by.</p>
     *
     * @return The {@link Library} which owns this media object.
     */
    @Override
    public Optional<Library> getParentLibrary() {
        return Optional.empty();
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public Optional<BibUser> getCurrentLender() {
        return Optional.empty();
    }

    @Override
    public void setCurrentLender(final Optional<BibUser> user) {

    }

    @Override
    public String getShortDescription() {
        return null;
    }

    @Override
    public String getCoverImageLink() {
        return null;
    }

    @Override
    public void moveToLibrary(final Library lib) {

    }

    @Override
    public void removeFromLibrary() {

    }

    @Override
    public Date getLendDateTime() {
        return null;
    }
}
