/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.practice;

/**
 *
 * @author bimal.parajuli
 */
class Person {
    private String key;
    private String firstname;
    private String lastname;

    public Person(String key, String firstname, String lastname) {
        this.key = key;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
