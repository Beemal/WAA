/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employees.of.acme;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author bimal.parajuli
 */
@ManagedBean
@RequestScoped
public class EmployeeManagedBean {
    private List<Employee> employeelist = new ArrayList<>();
    private Employee onlyEmployee;

    public EmployeeManagedBean() {
        employeelist.add(new Employee(1432, "Frank Brown", "625-541-1221", 7032.45));
        employeelist.add(new Employee(4521, "John Doe ", "919-232-1677", 7032.45));
        employeelist.add(new Employee(8867, "Marry Zeren", "515-342-1221", 10032.45));
        employeelist.add(new Employee(8832, "Harry Johnson", "514-355-6721", 9952.45));
        onlyEmployee = employeelist.get(0);
    }
    public void setOnlyEmployee(Employee onlyEmployee) {
        this.onlyEmployee = onlyEmployee;
    }
    public Employee getOnlyEmployee(){
        return onlyEmployee;
    }
    public List<Employee> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(List<Employee> employeelist) {
        this.employeelist = employeelist;
    }
    
    public String displayOnlyEmployee(int eid){
        for(Employee emp: employeelist){
            if(emp.getId() == eid){
                onlyEmployee = emp;
            }
        }
        return null;
    }
}
