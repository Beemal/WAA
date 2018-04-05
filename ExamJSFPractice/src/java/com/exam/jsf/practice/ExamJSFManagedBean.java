/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.jsf.practice;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@Named(value = "examJSFManagedBean")
@RequestScoped
public class ExamJSFManagedBean {

    private String name;
    private String phone;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String callMe(){
        return "call.xhtml";
    }
    public String emailMe(){
        return "email.xhtml";
    }
}
