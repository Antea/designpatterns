/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anteash.structural.decorator;

/**
 * 
 *
 * @author Federico Russo <russo.federico@anteash.com>
 */
public class Main {

    public static void main(String... args) {
        Button button = new Button();
        button.featureOne();
        System.out.println("=======");
        new LoggingDecorator(button).featureOne();
    }
}
