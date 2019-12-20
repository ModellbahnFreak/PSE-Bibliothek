package de.unistuttgart.kriegerreissner.bibliothek.media;

/**
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public abstract class PrintMedia implements Media {
    abstract int getNumPages();

    abstract BookCoverType getCoverType();

    abstract String getShelfNumber();
}
