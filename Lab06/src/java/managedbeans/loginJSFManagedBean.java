/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbeans;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@Named(value = "loginJSFManagedBean")
@RequestScoped
public class loginJSFManagedBean {
    private String userId;
    private String password;
    private String name = "Bimal Parajuli";

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String login(){
        if(userId.equals("k101") && password.equals("yoyo")){
            return "welcome.xhtml";
        }else
        return "error.xhtml";
    }
}
