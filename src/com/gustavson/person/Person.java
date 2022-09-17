package com.gustavson.person;

/**
 * A Person record to abstractly represent a Person.
 *
 * @param firstName The first name of a person.
 * @param lastName  The last name of a person.
 * @param age       The age of a person.
 * @param gender    The gender of a person.
 */
public record Person(String firstName, String lastName, int age, Gender gender) {
    /**
     * An overridden method to return a Person record object as a String.
     *
     * @return The String representation of a Person record object.
     */
    @Override
    public String toString() {
        return getClass().getSimpleName()
               + " { "
               + "firstName = '" + firstName + '\'' +
               ", lastName = '" + lastName + '\'' +
               ", age = " + age +
               ", gender = " + gender +
               " }";
    }
}
