/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anteash.structural.adapter;

/**
 * 
 *
 * @author Federico Russo <russo.federico@anteash.com>
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void doSomethingElse(int arg) {
        adaptee.doSomething("" + arg);
    }
}
