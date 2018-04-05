/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shopping.app;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author bimal.parajuli
 */
public class ShoppingCart {
    private List cartlist = new LinkedList();
    private double totalPrice= 0;

    public List getCartlist() {
        return cartlist;
    }

    public void setCartlist(List cartlist) {
        this.cartlist = cartlist;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void addToCart(Product product){
        boolean found=false;
        //check if product already in shopping list
        Iterator iter = cartlist.iterator();
        while (iter.hasNext()){
            Cartitem cartitem = (Cartitem) iter.next();
            Product prod = cartitem.getProduct();
                if (prod.getItemcode().equals(product.getItemcode())){
                    cartitem.setQuantity(cartitem.getQuantity()+1); found=true;
                    break;
                } 
        }
        if (!found){
            cartlist.add(new Cartitem(product,1));
        }
        computeTotalPrice();
    }
    
    public void computeTotalPrice(){
        totalPrice = 0;
        Iterator iter = cartlist.iterator();
        while (iter.hasNext()){
            Cartitem cartitem = (Cartitem) iter.next();
            totalPrice = totalPrice + (cartitem.getQuantity()* cartitem.getProduct().getItemprice());
        } 
    }
    
    public void removeFromCart(String itemcode){ 
        Iterator iter = cartlist.iterator(); 
        while (iter.hasNext()){
            Cartitem cartitem = (Cartitem) iter.next(); Product product = cartitem.getProduct();
            if (product.getItemcode().equals(itemcode)){
                    if (cartitem.getQuantity()== 1){
                        iter.remove();
                        computeTotalPrice();
                        break;
                    } else
                        cartitem.setQuantity(cartitem.getQuantity()-1);
            }
        }
    }
}