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
public class Machine {

    private Prototype prototype;

    public void setPrototype(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype newPrototype() {
        return prototype.clone();
    }
}
