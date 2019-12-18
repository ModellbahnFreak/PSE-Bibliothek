package de.unistuttgart.kriegerreissner.bibliothek.bibUser;

import de.unistuttgart.kriegerreissner.bibliothek.media.Media;

import java.util.Set;

public interface BibUser {
	void lendMedia (Media media);
	void returnMedia (Media media);
	Set<Media> getLendedMedia();
	String getBibUserId();
}
