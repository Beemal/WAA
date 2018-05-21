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
public class SizeBean implements Serializable {

   private String size="Small";

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
   public void increment(){
       if(size.equals("Small")){
           size="Medium";
       }else{
           if(size.equals("Medium"))
               size="Large";
           else
               size="Small";
       }
   }
   public void decrement(){
       if(size.equals("Large")){
           size="Medium";
       }else{
           if(size.equals("Medium"))
               size="Small";
           else
               size="Large";
       }
   }
}
