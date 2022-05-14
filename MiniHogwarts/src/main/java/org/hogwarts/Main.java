package org.hogwarts;

import org.hogwarts.logic.Comet;
import org.hogwarts.logic.Nimbus;
import org.hogwarts.logic.Wizard;

public class Main {
    public static void main(String[] args) {



        var wizard = new Wizard("Harrry" , "Potter", (byte) 20 );
        wizard.setBroomstrick(new Nimbus());
        wizard.FlyWizzard();
        wizard.setBroomstrick(new Comet());
        wizard.FlyWizzard();
        wizard.setAnimalFantastico(new Fenix());
        wizard.AccionesAnimales();
    }

    } 