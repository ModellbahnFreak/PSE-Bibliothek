package de.unistuttgart.kriegerreissner.bibliothek.media;

import de.unistuttgart.kriegerreissner.bibliothek.bibUser.BibUser;
import de.unistuttgart.kriegerreissner.bibliothek.library.Library;

import java.util.Optional;

public interface Media {
    String getId();
    String getTitle();
    String getAuthor();
    Library getParentLibrary();
    boolean isAvailable();
    Optional<BibUser> getCurrentLender();
    void setCurrentLender(Optional<BibUser> user);
    String getShortDescription();
    String getCoverImageLink();
    void moveToLibrary(Library lib);
    void removeFromLibrary();
}
