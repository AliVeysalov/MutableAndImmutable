/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ali.veysalov
 */
public class Mutable extends Immutable {

    private int realValue;

    public Mutable(int value) {
        super(value);
    }

    public Mutable(int realValue, int value) {
        super(value);
        this.realValue = realValue;
    }

    public int getRealValue() {
        return realValue;
    }

    public void setRealValue(int realValue) {
        this.realValue = realValue;
    }

   

   
}
