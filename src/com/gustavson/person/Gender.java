package com.gustavson.person;

/**
 * An enum to describe a persons gender.
 */
public enum Gender {
    /**
     * An enumeration constant to represent a persons gender as a male.
     */
    MALE("Male"),
    /**
     * An enumeration constant to represent a persons gender as a female.
     */
    FEMALE("Female");
    /**
     * A private field to give a more human friendly name to the sex of a person (Male or Female).
     */
    private final String sex;

    /**
     * A private constructor to assign the sex to a gender.
     *
     * @param sex The desired sex to be assigned to a gender (male or female).
     */
    Gender(String sex) {
        this.sex = sex;
    }

    /**
     * A method to retrieve the sex of the person (Male or Female).
     *
     * @return The sex of a person (Male or Female).
     */
    public String getSex() {
        return sex;
    }

    /**
     * A static method to retrieve a gender, based on a sex. This method acts in the same way as the Gender.{@link Gender valueOf} method.
     * <p>
     * <strong>Note</strong> this method will work on a case insensitive basis. Meaning, if the method receives the
     * planet name of "Male" it not will retrieve the enumeration constant for Male (MALE).
     * </p>
     *
     * @param sex The name of the sex (or gender) to retrieve.
     * @return The sex (or gender) with the same name as the name used in the parameter. If it isn't found, it will throw an {@link IllegalArgumentException}.
     */
    public static Gender getGender(String sex) {
        return Gender.valueOf(sex);
    }
}
