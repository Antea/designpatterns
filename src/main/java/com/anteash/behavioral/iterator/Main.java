/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anteash.behavioral.iterator;

/**
 * 
 *
 * @author Federico Russo <russo.federico@anteash.com>
 */
public class Main {

    public static void main(String[] args) {
        Iterable collection = null;


        Iterator iterator = collection.getIterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();

        }
    }
}
