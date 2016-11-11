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
    private Long pId;

    @Column
    private String personName;

    @Column
    private double personAge;

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
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
        sb.append("pId=").append(pId);
        sb.append(", personName='").append(personName).append('\'');
        sb.append(", personAge=").append(personAge);
        sb.append('}');
        return sb.toString();
    }
}