/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anteash.behavioral.observer;

import java.util.Collection;
import java.util.HashSet;

/**
 * 
 *
 * @author Federico Russo <russo.federico@anteash.com>
 */
public class Button {

    public void clik() {
        for (ClickListener l : listeners) {
            l.doClick();
        }
    }
    private Collection<ClickListener> listeners = new HashSet<ClickListener>();

    public void addListener(ClickListener l) {
        listeners.add(l);
    }

    public interface ClickListener {

        void doClick();
    }
}
