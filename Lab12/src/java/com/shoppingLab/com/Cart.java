/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingLab.com;

/**
 *
 * @author bimal.parajuli
 */
public class Cart {
    private int quantity;
    private CD cd;

    public Cart(int quantity, CD cd) {
        this.quantity = quantity;
        this.cd = cd;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }
    
    
}
