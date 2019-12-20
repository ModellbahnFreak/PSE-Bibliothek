package de.unistuttgart.kriegerreissner.bibliothek.library;

import de.unistuttgart.kriegerreissner.bibliothek.media.Media;

import java.util.Optional;
import java.util.Set;

public class MediaSeracher {
	private final Set<Media> libInventory;
	private final Set<Media> libAvailable;

    public MediaSeracher(final Set<Media> inventory, final Set<Media> availableMedia) {
		this.libInventory = inventory;
		this.libAvailable = availableMedia;
    }

    public Optional<Media> findMediaById(final String mediaId) {
		return null;
	}

	public Set<Media> findMediaByTitle(final String title) {
		return null;
	}

	public Set<Media> findMediaByAuthor(final String autor) {
		return null;
	}
}
