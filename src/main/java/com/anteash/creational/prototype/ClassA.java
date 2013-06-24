/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anteash.creational.prototype;

/**
 * 
 *
 * @author Federico Russo <russo.federico@anteash.com>
 */
public class ClassA implements Prototype {

    private int a;

    public ClassA() {
    }

    public ClassA(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public Prototype clone() {
        ClassA result = new ClassA();
        result.a = a;
        return result;
    }
}
