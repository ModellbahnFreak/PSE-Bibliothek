package de.unistuttgart.kriegerreissner.bibliothek.library;

import de.unistuttgart.kriegerreissner.bibliothek.media.Media;

import java.util.Optional;
import java.util.Set;

/**
 * <p>Class for searching media of a library by different aspects.</p>
 * <p>This class provides functions searching media for example by id, title, author etc. This is needed if a user
 * is looking for a media to be able to lend it.</p>
 *
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public class MediaSearcher {

    /*@
     @ public instance invariant libInventory != null;
     @ public instance invariant libAvailable != null;
     @*/

    private final Set<Media> libInventory;
    private final Set<Media> libAvailable;

    /*@
     @ requires inventory != null;
     @ requires availableMedia != null;
     @ ensures this.libInventory == inventory;
     @ ensure this.libAvailable == availableMedia;
     @*/

    /**
     * creates a new MediaSearcher with
     * @param inventory
     * @param availableMedia
     */
    public MediaSearcher(final Set<Media> inventory, final Set<Media> availableMedia) {
        this.libInventory = inventory;
        this.libAvailable = availableMedia;
    }

    /*@
     @ requires mediaId != null;
     @ requires !mediaID.isEmpty();
     @ ensures \result  != null;
     @ pure;
     @*/
    /**
     * finds media based on the id
     * @param mediaId the id to search for
     * @return Optional.empty() if nothing was found,
     */
    public Optional<Media> findMediaById(final String mediaId) {
        if (mediaId == null || mediaId.isEmpty()) {
            throw new IllegalArgumentException("mediaId must no be null or empty");
        }

        throw new UnsupportedOperationException("Not implemented");
    }

    /*@
     @ requires title != null;
     @ requires !title.isEmpty();
     @ ensures \result  != null;
     @ pure;
     */
    /**
     * finds media by its title
     * @param title the title of the media
     * @return a set with all medias which have this title, if no media was found the set is empty
     */
    public Set<Media> findMediaByTitle(final String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException( "title must not be null or empty");
        }

        throw new UnsupportedOperationException("Not implemented");
    }

    /*@
     @ requires author != null;
     @ requires !author.isEmpty();
     @ ensures \result  != null;
     @ pure;
     */
    /**
     * finds  media by its author
     * @param author the author name
     * @return a set with all the medias by the author, this set is empty if no media was found
     */
    public Set<Media> findMediaByAuthor(final String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("author must not be null or empty");
        }

        throw new UnsupportedOperationException("Not implemented");
    }
}
