/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anteash.creational.singleton;

/**
 * 
 *
 * @author Federico Russo <russo.federico@anteash.com>
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getINSTANCE() {
        return INSTANCE;
    }
}
