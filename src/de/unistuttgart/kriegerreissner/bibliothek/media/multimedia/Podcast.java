package de.unistuttgart.kriegerreissner.bibliothek.media.multimedia;

import de.unistuttgart.kriegerreissner.bibliothek.media.MultiMedia;

/**
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public class Podcast extends MultiMedia {
    /**
     * <p>Constructor setting the id and title of the podcats.</p>
     *
     * @param id       The (within the library) unique id. Mustn't be null or empty
     * @param title    The title of the media to be displayed in the gui. Mustn't be null or empty
     * @param mediaUrl The url where this multimedia is stored.
     * @param lenSec   The length of the multimedia clip in seconds
     * @param mimeType The file type of the clip
     */
    protected Podcast(final String id, final String title, final String mediaUrl, final int lenSec, final String mimeType) {
        super(id, title, mediaUrl, lenSec, mimeType);
    }
}
