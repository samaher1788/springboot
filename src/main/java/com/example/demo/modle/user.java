package com.example.demo.modle;

import javax.persistence.*;

@Entity
// no need for this annotation as spring-data-jpa will map User entity to User table,
@Table(name="customer")
// classes always starts with capital letters, User intead of user
public class user {
    @Id
    // no need for this annotation as spring-data-jpa will map id object to id column,
    @Column(name = "id")
    // always use a wrapper classes, use Long instead of long
    private long id;

    // this annotation must be used with @Id annotation, move it up
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // no need for this annotation as spring-data-jpa will map fristname object to fristname column,
    @Column(name = "fristname")
    private String fristname;

    // no need for this annotation as spring-data-jpa will map lastname object to lastname column,
    @Column(name = "lastname")

    private String lastname;

    // no need for this annotation as spring-data-jpa will map phonenumber object to phonenumber column,
    // keep in mind that capital letters are assumed to be prefixed with underscores phoneNumber object will be phone_number column, and UserManagement entity will be user_management table.
    @Column(name = "phoneNumber")

    private String phoneNumber;

    public String getFristname() {
        return fristname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setFristname(String fristname) {
        this.fristname = fristname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
