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
public abstract class ComponentDecorator implements Component {

    protected Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }
}
