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
public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        client.setStrategy(new HappyStrategy());
        client.doSomething();

        client.setStrategy(new SadStrategy());
        client.doSomething();
    }
}
