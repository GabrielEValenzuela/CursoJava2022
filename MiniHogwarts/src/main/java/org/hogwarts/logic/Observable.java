package org.hogwarts.logic;

public interface Observable {
    public void suscribeObserver(Observer o);
    public void unSuscribeObserver(Observer o);
    public void notifyAllObservers();
    public String getDetails();
}
