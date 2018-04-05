/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shopping.app;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author bimal.parajuli
 */
public class ProductCatalog {
    public Collection<Product> productlist = new ArrayList<Product>();
    
    public Collection<Product> getProductlist() {
        return productlist;
    }

    @Override
    public String toString() {
        return "ProductCatalog{" + "productlist=" + productlist + '}';
    }

    public void setProductlist(Collection<Product> productlist) {
        this.productlist = productlist;
    }

    public ProductCatalog() {
        productlist.add(new Product("A32581","The winner takes it all",12.95));
        productlist.add(new Product("A33278","Yellow submarine",11.35)); 
        productlist.add(new Product("A35324","Greatest Hits",9.75));
    }
    public Product getProduct(String productid) { 
        Product p = null;
            for (Product product : productlist) {
                if (product.getItemcode().equals(productid)){
                            p= product;
                          break;
                } 
            }
        return p;
        }
    
}