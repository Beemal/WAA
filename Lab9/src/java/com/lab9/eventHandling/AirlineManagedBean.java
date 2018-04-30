/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab9.eventHandling;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ValueChangeEvent;



/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@RequestScoped
public class AirlineManagedBean {
    private List<Airline> airlines;
    private String selectedAirline;   
   
    public AirlineManagedBean() {
        airlines = new ArrayList<>();
        airlines.add(new Airline("Amsterdam","New York","12/11/06", "KLM", 790.80));
        airlines.add(new Airline("Amsterdam","New York","12/11/06", "NorthWest", 795.55));
        airlines.add(new Airline("Amsterdam","New York","12/11/06", "KLM", 820.80));
        airlines.add(new Airline("Amsterdam","New York","12/11/06", "United Airlines", 825.80));
        airlines.add(new Airline("Amsterdam","New York","12/11/06", "NorthWest", 875.80));
        airlines.add(new Airline("Amsterdam","New York","12/11/06", "KLM", 790.80));
        airlines.add(new Airline("Amsterdam","New York","12/11/06", "United Airlines", 1050.80));
    }
    
    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public String getSelectedAirline() {
        return selectedAirline;
    }
    
    public void setSelectedAirline(String selectedAirline) {
        this.selectedAirline = selectedAirline;
    }

    public void airlineChanged(ValueChangeEvent event) {
        selectedAirline = event.getNewValue().toString();
        List<Airline> newList = new ArrayList<>();
        for(Airline a: airlines){
            if(a.getAirline().equals(selectedAirline))
                newList.add(a);
        }
        airlines = newList;
    }
}
