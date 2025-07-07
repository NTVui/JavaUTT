/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number;

import static java.lang.Math.sqrt;

/**
 *
 * @author soide
 */
public class Number {
private int value;
   private int min, max; 

   public Number(){}
   
    public Number(int value, int min, int max) {
         this.value = value;
         this.min = min;
         this.max = max;
    }

    public int getValue() {
        return value;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public boolean kt(int a){
        if(a <= 1){
            return false;
        }
        for(int i = 2; i <= sqrt(a); i++){
            if(a % i == 0){
                return false;
            }
        }
        return a > 1;
    }

    @Override
    public String toString() {
        return "Number{" + "value=" + value + ", min=" + min + ", max=" + max + '}';
    }
    
}
