package com.tgtb.dtos;

/**
 * Person Data Transfer Object.
 *
 * Created by dqromney on 11/14/16.
 */
public class NewPerson {
    String personName;
    String personAge;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonAge() {
        return personAge;
    }

    public void setPersonAge(String personAge) {
        this.personAge = personAge;
    }
}
