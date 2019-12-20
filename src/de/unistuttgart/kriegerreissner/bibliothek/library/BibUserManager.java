package de.unistuttgart.kriegerreissner.bibliothek.library;

import de.unistuttgart.kriegerreissner.bibliothek.bibUser.BibUser;
import de.unistuttgart.kriegerreissner.bibliothek.bibUser.BibUserFactory;
import de.unistuttgart.kriegerreissner.bibliothek.bibUser.BibUserGroup;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * <p>Class to manage all library users</p>
 * <p>This class manages users of a {@link Library}. It's possible to add, remove, modify users. Users can be
 * searched for by a few different methods.</p>
 *
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public class BibUserManager {

    /**
     * The set of al users authorized to use the library.
     */
    private final Set<BibUser> users;

    /**
     * <p>Initializes the User manager with an empty set of users</p>
     */
    BibUserManager() {
        this.users = new HashSet<>();
    }

    /**
     * <p>Creates a new user with the specified data.</p>
     * <p>The specified username, displayName and group will be used to create a new user and add it to the set of
     * authorized users. For details on users and the parameters, see {@link BibUserFactory} and {@link BibUser}</p>
     *
     * @param username    The username for the new user must be unique within this UserManager
     * @param displayName The display name to initially set for the new user.
     * @param group       The {@link BibUserGroup} the new user should be assigned to.
     */
    void newUser(final String username, final String displayName, final BibUserGroup group) {
        this.users.add(BibUserFactory.createUser(username, displayName, group, this.users));
    }

    /**
     * <p>Returns all users of this {@link BibUserManager} as unmodifiable set</p>
     * <p>The set will be unmodifiable, but the user objects can be changed, so it is possible to update data for the
     * users.</p>
     *
     * @return An unmodifiable set of all Users authorized to use the library.
     */
    Set<BibUser> getUsers() {
        return Collections.unmodifiableSet(this.users);
    }

    /**
     * <p>Tries to find the user specified by the given username.</p>
     * <p>If found, the user with the given username will be returned (max. 1 as the username must be unique within
     * one library). If none is found, an empty optional will be returned</p>
     * <p>NOTE: Capitalisation matters.</p>
     *
     * @param username The username to find a user for
     * @return An optional of the user with the specified username, Optional.empty() if none was found.
     */
    Optional<BibUser> findUserByUsername(final String username) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <p>Tries to find the user specified by the given id.</p>
     * <p>If found, the user with the given id will be returned (max. 1 as the id must be unique within
     * one library). If none is found, an empty optional will be returned</p>
     * <p>NOTE: Capitalisation matters.</p>
     *
     * @param id The id to find a user for
     * @return An optional of the user with the specified id, Optional.empty() if none was found.
     */
    Optional<BibUser> findUserById(final String id) {
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * <p>Tries to find all users with the given display name.</p>
     * <p>The returned set will contain all users, who's display name contains or is equal to the given display name.
     * If none is found, an empty set will be returned.</p>
     * <p>NOTE: Capitalisation doesn't matter.</p>
     *
     * @param displayName The display name to find all users for
     * @return A set of the users who's display name contains the given string.
     */
    Set<BibUser> findUserByDisplayName(final String displayName) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
