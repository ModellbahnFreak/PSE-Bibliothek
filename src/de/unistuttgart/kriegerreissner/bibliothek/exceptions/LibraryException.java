package de.unistuttgart.kriegerreissner.bibliothek.exceptions;

/**
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public class LibraryException extends RuntimeException {
    private static final long serialVersionUID = -827904600857966487L;

    /*@
     @ requires true;
     @*/
    public LibraryException() {
        super();
    }

    /*@
     @ requires message != null;
     @*/
    public LibraryException(final String message) {
        super(message);

        assert message != null;
    }
}
