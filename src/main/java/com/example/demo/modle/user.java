package com.example.demo.modle;

import javax.persistence.*;

@Entity
@Table(name="customer")

public class user {
    @Id
    @Column(name = "id")
    private long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "fristname")
    private String fristname;

    @Column(name = "lastname")

    private String lastname;

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
