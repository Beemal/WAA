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
class Entry {
    private String email;
    private String comment;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Entry(String email, String comment) {
        this.email = email;
        this.comment = comment;
    }
    
}
