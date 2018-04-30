/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab9.eventHandling;

/**
 *
 * @author bimal.parajuli
 */
public class Airline {
    private String from;
    private String to;
    private String date;
    private String airline;
    private double price;

    public Airline(String from, String to, String date, String airline, double price) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.airline = airline;
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
