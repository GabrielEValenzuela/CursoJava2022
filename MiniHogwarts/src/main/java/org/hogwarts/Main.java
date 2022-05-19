package org.hogwarts;

import org.hogwarts.logic.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        var harryPotter = new Wizard("Harrry" , "Potter", (byte) 20 );
        harryPotter.setBroomstrick(new Nimbus());
        harryPotter.FlyWizzard();
        harryPotter.setBroomstrick(new Comet());
        harryPotter.FlyWizzard();
        harryPotter.setAnimalesfantasticos(new Fenix());
        harryPotter.AccionesAnimales();
        var GinnyWeasly = new Wizard("Ginny" , "Weasly", (byte) 20 );
        GinnyWeasly.setBroomstrick(new Nimbus());
        GinnyWeasly.FlyWizzard();
        GinnyWeasly.setBroomstrick(new Comet());
        GinnyWeasly.FlyWizzard();
        GinnyWeasly.setAnimalesfantasticos(new Fenix());
        GinnyWeasly.AccionesAnimales();
        WizardTinder tinder = new WizardTinder(new ArrayList<Observer>());
        harryPotter.setObs(tinder);
        GinnyWeasly.setObs(tinder);
        harryPotter.suscribe();
        GinnyWeasly.suscribe();
        tinder.setVersion("2.0.1");
        harryPotter.unSuscribe();
        tinder.setVersion("3.0.1");
    }

    } 