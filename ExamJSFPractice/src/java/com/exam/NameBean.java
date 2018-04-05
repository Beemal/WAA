/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@Named(value = "nameBean")
@RequestScoped
public class NameBean {
    @ManagedProperty(value = "#{orderJSFManagedBean}")
   private OrderJSFManagedBean order;

    public OrderJSFManagedBean getOrder() {
        return order;
    }

    public void setOrder(OrderJSFManagedBean order) {
        this.order = order;
    }
   
}
