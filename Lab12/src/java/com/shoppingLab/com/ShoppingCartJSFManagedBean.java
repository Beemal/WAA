/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingLab.com;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@SessionScoped
public class ShoppingCartJSFManagedBean implements Serializable {
    private List<Cart> shoppingList;
   
    public ShoppingCartJSFManagedBean() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        
        shoppingList = (List<Cart>) session.getAttribute("cart");
        if(shoppingList == null){
            shoppingList = new ArrayList<>();
            session.setAttribute("cart", shoppingList);
        }
    }

    public List<Cart> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<Cart> shoppingList) {
        this.shoppingList = shoppingList;
    }
    
    public void removeFromCart(ActionEvent event){
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        List<Cart> shoppingList = (List<Cart>) session.getAttribute("cart");
        if(shoppingList == null){
            shoppingList = new ArrayList<>();
            session.setAttribute("cart", shoppingList);
        }
        UIParameter component1 = (UIParameter) event.getComponent().findComponent("code");
        String cdCode = component1.getValue().toString();
       
        Cart toRemoveCart = null;
        for (Cart cart : shoppingList) {
            if(cart.getCd().getCode().equals(cdCode)){
                if(cart.getQuantity() > 1)
                    cart.setQuantity(cart.getQuantity() - 1);
                else if(cart.getQuantity() <= 1)
                    toRemoveCart = cart;
            }
        }
        if(toRemoveCart != null)
            shoppingList.remove(toRemoveCart);
        session.setAttribute("cart", shoppingList);
    }
   
}
