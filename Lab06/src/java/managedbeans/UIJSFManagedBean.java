/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@Named(value = "uIJSFManagedBean")
@RequestScoped
public class UIJSFManagedBean {
    private String from;
    private String to;
    private String depart_date;
    private String return_date;
    private String trip;
    private String[] options;

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

    public String getDepart_date() {
        return depart_date;
    }

    public void setDepart_date(String depart_date) {
        this.depart_date = depart_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }
    public String[] getOptions() {
        return options;
    }
    public void setOptions(String[] options) {
        this.options = options;
    }
    public String getOptionsInString(){
        String result = "";
        String separator ="";
        for (String option : options) {
            result += separator+option;
            separator=", ";
        }
       return result;
    }
    public String submit(){
        return "result.xhtml";
    }
}
