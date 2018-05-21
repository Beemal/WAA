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
public class AmountBean {

   private Amount amount;

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
   
    public String submit(){
        return "showCurrency";
    }
}
