package de.unistuttgart.kriegerreissner.bibliothek.media;

/**
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public abstract class PrintMedia implements Media {
    /*@
     @ requires true;
     @ ensures \result >= 0;
     @*/
    abstract int getNumPages();

    /*@
     @ requires true;
     @ ensures \result != null;
     @*/
    abstract BookCoverType getCoverType();

    /*@
     @ requires true;
     @ ensures \result != null;
     @ ensures !\result.isEmpty();
     @*/
    abstract String getShelfNumber();
}
