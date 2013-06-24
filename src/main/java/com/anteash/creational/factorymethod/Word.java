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
public class Word extends WordProcessor {

    @Override
    public Document newDocument() {
        return new Doc();
    }
}
