package de.unistuttgart.kriegerreissner.bibliothek.media;

public interface PrintMedia extends Media {
    int getNumPages();
    BookCoverType getCoverType();
    String getShelfNumber();
}
