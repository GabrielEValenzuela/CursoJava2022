package Logic;

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
    public Wizard(String name){
        this.name = name;
        System.out.printf("Hola, soy %s\n",name);
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
    };
    public void makePotion(){};
    public void fly(){};
    public void attackAnother(Wizard enemy){
        if(this.level > enemy.getLevel()){
            System.out.print("Toma gato !\n");
            System.out.printf("HP Antes: %.1f\n",enemy.getHp());
            enemy.setHp(enemy.getHp()-(100*this.level));
            System.out.printf("HP Despues: %.1f",enemy.getHp());
        }
    };

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
