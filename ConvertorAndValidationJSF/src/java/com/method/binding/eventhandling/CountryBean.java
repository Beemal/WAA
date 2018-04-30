/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.method.binding.eventhandling;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@SessionScoped
public class CountryBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private Map<String, String> countries;
    private String localeCode = "en"; 

    public CountryBean(){
        countries  = new LinkedHashMap<>();
        countries.put("United Kingdom", "en");
        countries.put("French", "fr");
        countries.put("German", "de");
        countries.put("China", "zh_CN");
        countries.put("China", "zh_CN");
    }
    
    public void countryLocaleCodeChanged(ValueChangeEvent e){
        localeCode = e.getNewValue().toString();
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        countries = countries;
    }

    public String getLocaleCode() {
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        this.localeCode = localeCode;
    }
    
    
    
}
