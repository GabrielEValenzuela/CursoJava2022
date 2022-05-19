package org.hogwarts.logic;

import java.util.List;

public class WizardTinder implements Observable {
    private final List<Observer> observers;

    public void setVersion(String version) {
        this.version = version;
        notifyAllObservers();
    }

    private String version = "1.0.0";

    public WizardTinder(List<Observer> observers){
        this.observers = observers;
    }
    @Override
    public void suscribeObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unSuscribeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for(var observer: observers){
            observer.update(this.version);
        }
    }

    @Override
    public String getDetails() {
        return "WizardTinder: It's what you want :)";
    }
}
