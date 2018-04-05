/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam;

/**
 *
 * @author bimal.parajuli
 */
class TimeCalculator {

    public String timeCalculate(String time) {
        String[] split = time.split(":");
        return split[0]+" hours and "+split[1]+" minutes.";
    }
    
}
