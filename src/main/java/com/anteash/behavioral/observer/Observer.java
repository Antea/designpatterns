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
public class Observer implements Button.ClickListener {

    public void doClick() {
        System.out.println("click");
    }
}
