package de.unistuttgart.kriegerreissner.bibliothek.media;

/**
 * Class representing a printed media
 *
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public abstract class PrintMedia implements Media {
    /*@
     @ requires true;
     @ ensures \result >= 0;
     @ pure;
     @*/
    /**
     * gets the number of pages of this printed media
     * @return the amount of pages
     */
    abstract int getNumPages();


    /*@
     @ requires true;
     @ ensures \result != null;
     @ pure;
     @*/
    /**
     * gets the type of the book cover
     * @return the type of the book cover
     */
    abstract BookCoverType getCoverType();


    /*@
     @ requires true;
     @ ensures \result != null;
     @ ensures !\result.isEmpty();
     @ pure;
     @*/
    /**
     * gets the shelf number
     * @return the number where this book is in the library
     */
    abstract String getShelfNumber();
}
