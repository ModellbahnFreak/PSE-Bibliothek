package de.unistuttgart.kriegerreissner.bibliothek.media;

/**
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public abstract class MultiMedia implements Media {
    abstract int getLengthSec();

    abstract String getMimeType();
}
