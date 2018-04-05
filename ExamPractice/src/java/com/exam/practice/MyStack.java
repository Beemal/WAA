/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.practice;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author bimal.parajuli
 */
public class MyStack {
    private List<String> elements = new LinkedList<String>();

    public void push (String object){
    elements.add(0,object); 
    }
    public String pop (){
    String top = top();
    elements.remove(0);
    return top;
    }

    public List<String> getElements() {
        return elements;
    }

    private String top() {
       if(elements.size() == 0)
            throw new IllegalStateException("stack is empty"); 
       return elements.get(0);
    }

 
} 