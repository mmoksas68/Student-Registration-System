package com.group29.srs.model;

public class Person {
    Long PersonId;
    String FirstName;
    String LastName;

    public Person() {
    }

    public Person(Long personId, String firstName, String lastName) {
        PersonId = personId;
        FirstName = firstName;
        LastName = lastName;
    }

    public Long getPersonId() {
        return PersonId;
    }

    public void setPersonId(Long personId) {
        PersonId = personId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

}
