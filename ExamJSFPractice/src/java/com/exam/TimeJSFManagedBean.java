/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@RequestScoped
public class TimeJSFManagedBean {

   String time;
   String result;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
   
   public void calculate(){
       TimeCalculator calc = new TimeCalculator();
       result = calc.timeCalculate(time);
   } 
}
