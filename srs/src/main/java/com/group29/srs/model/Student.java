package com.group29.srs.model;

public class Student {
    int PersonID;
    String FirstName;
    String LastName;




    public Student() {

    }

    public Student(String FirstName, String surname) {
        this.FirstName = FirstName;
        this.LastName = surname;
    }

    public Student(String FirstName, String surname, int[] grades) {
        this.FirstName = FirstName;
        this.LastName = surname;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int personID) {
        PersonID = personID;
    }

}
