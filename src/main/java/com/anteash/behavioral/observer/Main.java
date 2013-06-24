/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anteash.behavioral.observer;

/**
 * 
 *
 * @author Federico Russo <russo.federico@anteash.com>
 */
public class Main {

    public static void main(String[] args) {
        Button button = new Button();
        button.addListener(new Observer());
        button.addListener(new Observer());
        button.addListener(new Observer());
        button.addListener(new Observer());
        button.addListener(new Observer());
        button.addListener(new Observer());
        button.addListener(new Observer());
        button.addListener(new Observer());

        button.clik();
    }
}
