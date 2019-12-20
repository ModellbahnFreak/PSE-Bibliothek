package de.unistuttgart.kriegerreissner.bibliothek.library;

import de.unistuttgart.kriegerreissner.bibliothek.exceptions.MediaUnavailableException;
import de.unistuttgart.kriegerreissner.bibliothek.exceptions.MediaUnknownException;
import de.unistuttgart.kriegerreissner.bibliothek.media.Media;

import java.util.Set;

/**
 * <p>Class for managing the media of a library.</p>
 * <p>This class enables a library to manage the owned library. This includes adding and removing media from the set
 * of available media, getting the state of a media etc.
 * </p>
 *
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public class MediaManager {

    /*@
     @ public instance invariant medias != null;
     @*/

    private final Set<Media> medias;

    public MediaManager(final Set<Media> media) {
        this.medias = media;
    }

    /*@
     @ requires media != null;
     @ ensures !this.medias.contains(media);
     @*/

    /**
     * <p>Removes the given media object from the library.</p>
     * <p>This method removes the given media object from the library, if it is owned by the library and currently
     * available.</p>
     *
     * @param media The media object to remove from the inventory of the library.
     * @throws MediaUnavailableException If the media provided is currently not available.
     * @throws MediaUnknownException     If the media provided isn't owned by this library
     */
    void removeMedia(final Media media) throws MediaUnavailableException, MediaUnknownException {
        throw new UnsupportedOperationException("Not implemented");
    }

    /*@
     @ requires media != null;
     @ ensures this.medias.contains(media);
     @*/

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

    /*@
     @ requires media != null;
     @ pure;
     @*/

    /**
     * checks if the media is available
     *
     * @param media the media to search for
     * @return true if the media is available, otherwise false
     */
    boolean isMediaAvailable(final Media media) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
