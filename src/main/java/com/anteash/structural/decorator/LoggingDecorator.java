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
public class LoggingDecorator extends ComponentDecorator {

    public LoggingDecorator(Component component) {
        super(component);
    }

    public void featureOne() {
        System.out.println("Invoking featureOne");
        component.featureOne();
        System.out.println("Invoked featureOne OK");
    }

    public void featureTwo() {
        component.featureTwo();
    }
}
