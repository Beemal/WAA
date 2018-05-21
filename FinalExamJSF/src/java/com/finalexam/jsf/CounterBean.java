/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalexam.jsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@SessionScoped
public class CounterBean implements Serializable {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void next(){
        count++;
    }
    public void previous(){
        count--;
    }
}
