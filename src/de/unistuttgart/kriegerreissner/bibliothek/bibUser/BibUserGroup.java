package de.unistuttgart.kriegerreissner.bibliothek.bibUser;

/**
 * <p>Enum for the User type. Specifies the properties which differ between user groups</p>
 * <p>Using an enum and a field of the {@link BibUser} class allows a user to be "up- od downgraded" between
 * categories and therefore gives the opportunity for people to change type when their occupation changes without
 * having to create a new user which would have new id, new user name and wouldn't be able to keep the media while
 * transferring type.</p>
 *
 * @author Georg Reissner, Niklas Kriger
 * @version 42.101010_Christmas19
 */
public enum BibUserGroup {
    /**
     * <p>User type for an external user who has nothing to do with the university.</p>
     * <p>Maximum lending period: 30 days</p>
     */
    EXTERNAL(30),

    /**
     * <p>User type for a student of the university.</p>
     * <p>Maximum lending period: 3 months (=90 days)</p>
     */
    STUDENT(90),

    /**
     * <p>User type employee of the the university/the institute to which that library belongs.</p>
     * <p>Maximum lending period: indefinite</p>
     */
    EMPLOYEE(-1);

    /**
     * Field to store the max Lending duration for the given state
     */
    private final int lendingDays;

    /*@
     @ ensures this.lendingDays == lendingDays;
     @*/
    /**
     * Constructor for the enum instances. Will initialize {@link BibUserGroup#lendingDays}
     *
     * @param lendingDays The days this user group may lend a media.
     */
    BibUserGroup(final int lendingDays) {
        this.lendingDays = lendingDays;
    }

    /*@
     @ requires true;
     @ pure;
     @*/
    /**
     * <p>Returns the maximum lending duration for that user group.</p>
     * <p>The returned value is the max lending duration in days if it is >= 0. If the returned value is < 0, the maximum lending duration for that group is indefinite.</p>
     *
     * @return The number of days a user of that group can lend media or < 0 if he can lend them indefinite.
     */
    int getLendingDays() {
        return this.lendingDays;
    }
}
