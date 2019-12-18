package de.unistuttgart.kriegerreissner.bibliothek.library;

import de.unistuttgart.kriegerreissner.bibliothek.exceptions.MediaUnavaliableException;
import de.unistuttgart.kriegerreissner.bibliothek.exceptions.MediaUnknownException;
import de.unistuttgart.kriegerreissner.bibliothek.media.Media;

import java.util.Set;

public class Library {
	private Set<Media> inventory;
	private Set<Media> availableMedia;

	void removeMedia(Media media) throws MediaUnavaliableException, MediaUnknownException {

	}

	void addNewMedia(Media media) {

	}
}
