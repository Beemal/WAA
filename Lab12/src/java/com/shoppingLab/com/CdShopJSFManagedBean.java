/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingLab.com;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;


/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@RequestScoped
public class CdShopJSFManagedBean {
    private List<CD> cdList = new ArrayList<>();
  
    public CdShopJSFManagedBean() {
        cdList.add(new CD("A32581", "The Winner Takes it All", 12.95));
        cdList.add(new CD("A33278", "Yellow submarine", 11.35));
    }

    public List<CD> getCdList() {
        return cdList;
    }

    public void setCdList(List<CD> cdList) {
        this.cdList = cdList;
    }
    public void addToCart(ActionEvent event){
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        List<Cart> shoppingList = (List<Cart>) session.getAttribute("cart");
        if(shoppingList == null){
            shoppingList = new ArrayList<>();
            session.setAttribute("cart", shoppingList);
            session.setAttribute("total", 0);
        }
        UIParameter component1 = (UIParameter) event.getComponent().findComponent("code");
        String cdCode = component1.getValue().toString();
        UIParameter component2 = (UIParameter) event.getComponent().findComponent("name");
        String cdName = component2.getValue().toString();
        UIParameter component3 = (UIParameter) event.getComponent().findComponent("price");
        double cdPrice = (double) component3.getValue();
       
        boolean cdExists = false;
        CD cd = new CD(cdCode, cdName, cdPrice);
        for (Cart cart : shoppingList) {
            if(cart.getCd().equals(cd)){
                cart.setQuantity(cart.getQuantity() + 1);
                cdExists = true;
            }
        }
        if(!cdExists)
            shoppingList.add(new Cart(1, cd));
        session.setAttribute("cart", shoppingList);
    }
    public String showShoppingCart(){
        return "shoppingCart";
    }
    
}
