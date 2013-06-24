/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anteash.behavioral.strategy;

/**
 * 
 *
 * @author Federico Russo <russo.federico@anteash.com>
 */
public class Client {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        System.out.println("I am " + strategy.howAreYou() + ".");
    }
}
