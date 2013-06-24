/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anteash.creational.factorymethod;

/**
 * 
 *
 * @author Federico Russo <russo.federico@anteash.com>
 */
public abstract class WordProcessor {

    public void print() {
        Document newDocument = newDocument();
    }

    public abstract Document newDocument();
}
