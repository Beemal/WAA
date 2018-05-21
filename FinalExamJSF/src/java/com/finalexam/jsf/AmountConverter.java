/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.finalexam.jsf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author bimal.parajuli
 */
@FacesConverter(value="amountConverter")
public class AmountConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if("".equals(value))
            return null;
        String currency = value.substring(0,1);
        String amount = value.substring(1,value.length());
        Amount amt = new Amount(Double.parseDouble(amount), currency);
        return amt;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Amount amt = (Amount) value;
        String result = amt.getValue()+" ";
        
        if(amt.getCurrency().equals("$"))
            result += "dollars";
        else
            result += "euros";
        
        return result;
    }
    
}
