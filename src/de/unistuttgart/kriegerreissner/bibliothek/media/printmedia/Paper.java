package de.unistuttgart.kriegerreissner.bibliothek.media.printmedia;

import de.unistuttgart.kriegerreissner.bibliothek.library.Library;
import de.unistuttgart.kriegerreissner.bibliothek.media.BookCoverType;
import de.unistuttgart.kriegerreissner.bibliothek.media.PrintMedia;

import java.util.Set;

/**
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public class Paper extends PrintMedia {

    /**
     * Initialitzes this print media by setting all required properties.
     *
     * @param id            The unique id of the printmedia
     * @param title         The title which will be displayed
     * @param parentLibrary The Library which owns the printmedia
     * @param authors       A list of authows or an empty list if anonymous
     * @param numberPages   The number of pages this printmedia has
     * @param coverType     The cover type of this media
     */
    public Paper(final String id, final String title, final Library parentLibrary, final Set<String> authors, final int numberPages, final BookCoverType coverType) {
        super(id, title, parentLibrary, authors, numberPages, coverType);
    }
}
