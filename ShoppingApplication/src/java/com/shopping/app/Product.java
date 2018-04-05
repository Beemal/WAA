/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shopping.app;

/**
 *
 * @author bimal.parajuli
 */
public class Product {
    public String itemcode;
    public String name;
    public double itemprice;

    public Product(String itemcode, String name, double itemprice) {
        this.itemcode = itemcode;
        this.name = name;
        this.itemprice = itemprice;
    }


    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }

    @Override
    public String toString() {
        return "Product{" + "itemcode=" + itemcode + ", name=" + name + ", itemprice=" + itemprice + '}';
    }
    
}
