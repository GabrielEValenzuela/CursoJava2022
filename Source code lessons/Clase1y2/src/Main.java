//PascalCase -> Nombres de la clase
//camelCase -> Miembros de la clase

import Logic.Spells;
import Logic.Wizard;

import javax.sound.midi.SysexMessage;

public class Main {
    // 8 tipos de datos primitivos: byte,short,int,long,char,float,double and boolean

    /*
        Enteros -> byte,short,int,long.
        Puntos flotantes -> float,double
        Caracteres -> char
        Boolean -> true o false

        + - * / % ^

        Bitwise
        byte var = b1010 //A
        ~var //0101
        &
        |

        ^ XOR
        <<
        >>

        Operadores de relacion
        A = 5
        B = 5
        == (Igual) A==B ->true o false
        !=
        <
        >=
        <
        <=

        Operadores logicos
        true 1
        false 0
        && AND -> Producto: A && B = 1
        || OR -> Suma: A || B = 0

        boolean A = true;
        boolean B = true;
        boolean C = false;
        System.out.println("\t A && B = "+(A && B));
        System.out.println("\t A && C = "+(A && C));
        System.out.println("\t C && B = "+(C && B));
        System.out.println("\t C && C = "+(C && C));

        String nombre = !A ? "Homero" : "Peter";
        System.out.println(nombre);

        if(expr){
            //Accion a llevar a cabo si expr es true
        } else if (expr) {
            //Accion a llevar a cabo si expr es true
        } else {
            //Accion a llevar a cabo por defecto
        }

        switch (expr){
            case valor1:{
                break;
            }
            case valor2:{
                break;
            }
            default:{
                //else
            }
        }

        //Persona

        //Iteradores
        while(condicion){
            //Ejecutar
        }


     */
    public static void main(String [] args){
        var HallyPotler = new Wizard("Harry");
        var Ron = new Wizard("Ron");
        HallyPotler.setHp(1);
        HallyPotler.setLevel((byte)2);
        HallyPotler.setEnergy(20);
        HallyPotler.makeSpell(Spells.HEALTH);
        System.out.println(HallyPotler.getName());
        HallyPotler.attackAnother(Ron);
    }
}
