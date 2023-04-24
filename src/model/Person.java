package model;

import java.time.LocalDate;

public class Person {
    private String firstname;
    private String lastname;
    private LocalDate dob;

    // allows creating instances without initializing the values
    // it's created by default if no other constructor is declared
    // setting it to private don't allow instantiating without arguments
    private Person() {
    }

    public Person(String firstname, String lastname, LocalDate dob) {
        this.firstname = firstname.toLowerCase();
        this.lastname = lastname.toLowerCase();
        this.dob = dob;
    }

    public String getFirstname() {
        return firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname.toLowerCase();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
