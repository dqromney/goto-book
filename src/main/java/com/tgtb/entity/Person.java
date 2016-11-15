package com.tgtb.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Person entity class.
 * <p>
 * Created by dqromney on 11/10/16.
 */
@Entity(name = "person")
public class Person implements Serializable {

    private static final long serialVersionUID = -5378396373373165919L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column
    private String personName;

    @Column
    private double personAge;

    public Person() {
    }

    public Person(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getPersonAge() {
        return personAge;
    }

    public void setPersonAge(double personAge) {
        this.personAge = personAge;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", personName='").append(personName).append('\'');
        sb.append(", personAge=").append(personAge);
        sb.append('}');
        return sb.toString();
    }
}