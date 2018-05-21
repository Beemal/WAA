/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalexam.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@RequestScoped
public class examJSFManagedBean {

    private int count = 0;
    private String size = "Small";

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void updateNext(){
        count++;
        updatesize();
    }
    public void updatePrevious(){
        count--;
        updatesize();
        
    }

    private void updatesize() {
        if(count == 0){
            size = "Small";
        }else if(count == 1){
            size = "Medium";
        }else{
            size = "Large";
        }
    }
    
}
