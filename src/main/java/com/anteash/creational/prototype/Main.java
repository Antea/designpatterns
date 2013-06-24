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
public class Main {

    public static void main() {
        Machine machine = new Machine();
        Prototype a=new ClassA(6);

        machine.setPrototype(a);
        Prototype newPrototype = machine.newPrototype();

    }
}
