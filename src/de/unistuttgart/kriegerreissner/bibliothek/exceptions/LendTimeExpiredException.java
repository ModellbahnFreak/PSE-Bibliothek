package de.unistuttgart.kriegerreissner.bibliothek.exceptions;

import de.unistuttgart.kriegerreissner.bibliothek.bibUser.BibUser;
import de.unistuttgart.kriegerreissner.bibliothek.media.Media;

/**
 * <p>Exception used by the {@link de.unistuttgart.kriegerreissner.bibliothek.library.Library} which is thrown if a
 * user hasn't returned a media in time before the max lend time has expired.</p>
 *
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public class LendTimeExpiredException extends LibraryException {
    private static final long serialVersionUID = -3576796126241436271L;

    /**
     * <p>Initializes a {@link LendTimeExpiredException} with a message displaying the users displayName and the
     * media title.</p>
     * <p>The media </p>
     */
    public LendTimeExpiredException(final BibUser user, final Media media) {
        super("User " + user.getDisplayName() + " has expired the lend time for media " + media.getTitle());
    }

    public LendTimeExpiredException(final BibUser user) {
        super("User " + user.getDisplayName() + " has expired the lend time for one of his lent media.");
    }
}
