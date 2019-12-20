package de.unistuttgart.kriegerreissner.bibliothek.bibUser;

import java.util.Set;

/**
 * <p>Factory class for creating and managing users and their groups</p>
 * <p>The {@link BibUserFactory} offers operations fr creating a new {@link BibUser} of a certain user group. It will also take care of generating a new unique id for the user and it will check if the username already exists</p>
 *
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public final class BibUserFactory {

    /**
     * private constructor to prevent creation
     */
    private BibUserFactory() {

    }

    /*@
     @ requires username != null;
     @ requires !username.isEmpty();
     @ requires displayName != null;
     @ requires !displayName.isEmpty();
     @ requires knownUsers != null;
     @*/
    /**
     * <p>Creates a new {@link BibUser} with the group {@link BibUserGroup#STUDENT}.</p>
     * <p>The method will check if the username exists. If so, it will throw an {@link IllegalArgumentException} if the username already exists in the given list o known users. Furthermore a new unique id will be created which doesn't exist in the list of known users.</p>
     *
     * @param username    The username to set for the new user. Must be unique.
     * @param displayName The name which to display for the user in the GUI
     * @param knownUsers  A set of known users against which to check the username and which to user for generating the unique id.
     * @return A new instance of the {@link BibUser} class with the group {@link BibUserGroup#STUDENT} and the given username, displayName and generated id set.
     */
    public static BibUser createStudent(final String username, final String displayName, final Set<BibUser> knownUsers) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("username must not be null or empty");
        }
        if (displayName == null || displayName.isEmpty()) {
            throw new IllegalArgumentException("displayName must not be null or empty");
        }
        if (knownUsers == null) {
            throw new IllegalArgumentException("knownUsers must not be null");
        }

        throw new UnsupportedOperationException("Not implemented yet");
    }

    /*@
     @ requires username != null;
     @ requires !username.isEmpty();
     @ requires displayName != null;
     @ requires !displayName.isEmpty();
     @ requires knownUsers != null;
     @*/
    /**
     * <p>Creates a new {@link BibUser} with the group {@link BibUserGroup#EMPLOYEE}.</p>
     * <p>The method will check if the username exists. If so, it will throw an {@link IllegalArgumentException} if the username already exists in the given list o known users. Furthermore a new unique id will be created which doesn't exist in the list of known users.</p>
     *
     * @param username    The username to set for the new user. Must be unique.
     * @param displayName The name which to display for the user in the GUI
     * @param knownUsers  A set of known users against which to check the username and which to user for generating the unique id.
     * @return A new instance of the {@link BibUser} class with the group {@link BibUserGroup#EMPLOYEE} and the given username, displayName and generated id set.
     */
    public static BibUser createEmployee(final String username, final String displayName, final Set<BibUser> knownUsers) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("username must not be null or empty");
        }
        if (displayName == null || displayName.isEmpty()) {
            throw new IllegalArgumentException("displayName must not be null or empty");
        }
        if (knownUsers == null) {
            throw new IllegalArgumentException("knownUsers must not be null");
        }

        throw new UnsupportedOperationException("Not implemented yet");
    }

    /*@
     @ requires username != null;
     @ requires !username.isEmpty();
     @ requires displayName != null;
     @ requires !displayName.isEmpty();
     @ requires knownUsers != null;
     @*/
    /**
     * <p>Creates a new {@link BibUser} with the group {@link BibUserGroup#EXTERNAL}.</p>
     * <p>The method will check if the username exists. If so, it will throw an {@link IllegalArgumentException} if the username already exists in the given list o known users. Furthermore a new unique id will be created which doesn't exist in the list of known users.</p>
     *
     * @param username    The username to set for the new user. Must be unique.
     * @param displayName The name which to display for the user in the GUI
     * @param knownUsers  A set of known users against which to check the username and which to user for generating the unique id.
     * @return A new instance of the {@link BibUser} class with the group {@link BibUserGroup#EXTERNAL} and the given username, displayName and generated id set.
     */
    public static BibUser createExternal(final String username, final String displayName, final Set<BibUser> knownUsers) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("username must not be null or empty");
        }
        if (displayName == null || displayName.isEmpty()) {
            throw new IllegalArgumentException("displayName must not be null or empty");
        }
        if (knownUsers == null) {
            throw new IllegalArgumentException("knownUsers must not be null");
        }

        throw new UnsupportedOperationException("Not implemented yet");
    }

    /*@
     @ requires username != null;
     @ requires !username.isEmpty();
     @ requires displayName != null;
     @ requires !displayName.isEmpty();
     @ requires knownUsers != null;
     @*/
    /**
     * <p>Creates a new {@link BibUser} with the given group.</p>
     * <p>The method will check if the username exists. If so, it will throw an {@link IllegalArgumentException} if the username already exists in the given list o known users. Furthermore a new unique id will be created which doesn't exist in the list of known users.</p>
     *
     * @param username    The username to set for the new user. Must be unique.
     * @param displayName The name which to display for the user in the GUI
     * @param group       The group to assign the user to.
     * @param knownUsers  A set of known users against which to check the username and which to user for generating the unique id.
     * @return A new instance of the {@link BibUser} class with the group {@link BibUserGroup#EXTERNAL} and the given username, displayName and generated id set.
     */
    public static BibUser createUser(final String username, final String displayName, final BibUserGroup group, final Set<BibUser> knownUsers) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("username must not be null or empty");
        }
        if (displayName == null || displayName.isEmpty()) {
            throw new IllegalArgumentException("displayName must not be null or empty");
        }
        if (knownUsers == null) {
            throw new IllegalArgumentException("knownUsers must not be null");
        }

        throw new UnsupportedOperationException("Not implemented yet");
    }
}
