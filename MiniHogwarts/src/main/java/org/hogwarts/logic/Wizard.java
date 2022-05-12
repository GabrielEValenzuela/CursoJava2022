package org.hogwarts.logic;

public class Wizard {
    //Miembros de la clase
    private String name;
    private String surname;
    private byte age;
    private char gender;
    private String house;
    private float hp;
    private float energy;
    private byte level;

    //CONSTRUCTORES
    public Wizard(){
        System.out.printf("Hola, soy %s",name);
    }
    public Wizard(String name,String surname, byte age){
        this.name = name;
        this.surname= surname;
        this.age= age;
        System.out.printf("Hola, soy %s %s y tengo %s años\n",name,surname,age);
    }

    //Metodos
    public void makeSpell(Spells newSpell){
        switch (newSpell){
            case HEALTH -> {
                if(this.level > 1 && this.energy > 0f) {
                    this.hp += 10;
                    System.out.printf("New hp: %.1f\n", this.hp);
                } else {
                    System.out.println("No energy :'(");
                }
            }
        }
    }
    public void makePotion(){
        case POCION_AMOR->{
            if(this.level >1){
            this.POCION_AMOR += 1;
            System.out.printf(" POCION DE AMOR was built satisfactorily ");
            }
            else{
                System.out.println("I do not have the necessary level to make this potion");
            }
            breack;
            case POCION_ANIMAGOS ->{
                if(this.level >2){
                    this.POCION_ANIMAGOS += 1;
                    System.out.println(" POCION ANIMAGOS was built satisfactorily");
                }
                else{
                    System.out.println("I do not have the necessary level to make this potion"
                    );
                }
                breack;
            case POCION_DE_INGENIO {
                if(this.level > 5)
                {
                this.POCION_DE_INGENIO += 1;
                System.out.println("POCION DE INGENIO was built satisfactorily ");
                }
            else{
                System.out.println("I do not have the necessary level to make this potion ")
            }
            breack;

            }


    }

    
    }
    public void fly(){}
    public void attackAnother(Wizard enemy){
        if(this.level > enemy.getLevel()){
            System.out.print("Toma gato !\n");
            System.out.printf("HP Antes: %.1f\n",enemy.getHp());
            enemy.setHp(enemy.getHp()-(100*this.level));
            System.out.printf("HP Despues: %.1f",enemy.getHp());
        }
    }
    public void chooseHouse (House newHouse) {
        switch (newHouse){
            case Gryffindor -> {
                System.out.println("Bienvenido a Gryffindor ");
                System.out.println("Tus jefes de casa seran : Godric Gryffindor, Albus Dumbledore, Minerva McGonagall  ");
                System.out.println("Ellos te guiaran dentro de Hogwarts ");
                System.out.println("En esta casa desarrollaras cualidades como el valor, la fuerza y la audacia ");
                System.out.println("Ah!! me olvidaba cuidado con Nick Casi Decapitado que anda merodeando por ahi ");
                System.out.println("Buena Suerte");    
            }
            case Hufflepuff -> {
                System.out.println("Bienvenido a Hufflepuff");
                System.out.println("Tus jefes de casa seran : Helga Hufflepuff y Pomona Sprout  ");
                System.out.println("Ellos te guiaran dentro de Hogwarts ");
                System.out.println("En esta casa desarrollaras cualidades como la justicia, la lealtad y la paciencia ");
                System.out.println("Ah!! me olvidaba cuidado con el Fraile Gordo que anda merodeando por ahi ");
                System.out.println("Buena Suerte");    
            }
            case Ravenclaw ->{
                System.out.println("Bienvenido a Ravenclaw ");
                System.out.println("Tus jefes de casa seran : Rowena Ravenclaw y Filius Flitwick  ");
                System.out.println("Ellos te guiaran dentro de Hogwarts ");
                System.out.println("En esta casa desarrollaras cualidades como la creatividad, la erudicion y la inteligencia");
                System.out.println("Ah!! me olvidaba cuidado con la Dama Gris que anda merodeando por ahi ");
                System.out.println("Buena Suerte");   
            }
            case Slytherin -> {
                System.out.println("Bienvenido a Slytherin ");
                System.out.println("Tus jefes de casa seran : Salazar Slytherin, Horace Slughorn y Severus Snape ");
                System.out.println("Ellos te guiaran dentro de Hogwarts ");
                System.out.println("En esta casa desarrollaras cualidades como la ambision, la determinacion y la astucia");
                System.out.println("Ah!! me olvidaba cuidado con el Barón Sanguinario que anda merodeando por ahi ");
                System.out.println("Buena Suerte"); 
            }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public float getEnergy() {
        return energy;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

}