package org.hogwarts.logic;

//Modificado
public class Fenix implements AnimalFantastico {
    @Override
    public void comer(){
        System.out.println("Tengo hambre");
    }
    public void cagar(){
        System.out.println("Falta papel");
    }
    public void atacar(){
        System.out.println("*Escupe fuego*");
    }
    public void Caminar(){
        System.out.println("*Camina*");
    }
    public void Fly(){
        System.out.println("*Vuela*");
    }


}
