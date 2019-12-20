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
    private final Set<Media> libInventory;
    private final Set<Media> libAvailable;

    public MediaSearcher(final Set<Media> inventory, final Set<Media> availableMedia) {
        this.libInventory = inventory;
        this.libAvailable = availableMedia;
    }

    public Optional<Media> findMediaById(final String mediaId) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public Set<Media> findMediaByTitle(final String title) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public Set<Media> findMediaByAuthor(final String autor) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
