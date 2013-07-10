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
public class Client {

    private static Target target;

    public static void main(String... args) {
        target = new Adapter(new Adaptee());
        target.doSomethingElse(123);
    }
}
