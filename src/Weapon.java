import java.util.ArrayList;
import java.util.Collections;

public class Weapon {

    private String name;
    private int damage;

    public Weapon(String name, int damage) {
       this.name = name;
       this.damage = damage;
    }

    public String swing() {
        if (name.equals("Sword") || name.equals("Flail")) {
            return "The " + name + "is swung in a wide arc. ";
        } else {
            return "The " + name + " cannot be swung. ";
        }
    }

    public String shoot() {
        if(name.equals("Longbow") || name.equals("Slingshot")) {
            return "The " + name + " is fired. ";
        } else {
            return "The " + name + " cannot be shot. ";
        }
    }

    public String stab() {
        if(name.equals("Fork") || name.equals("Sword")) {
            return "The " + name + " is stabbing. ";
        } else {
            return "The " + name + " cannot stab. ";
        }
    }



    public String getName() {
        return name;
    }

    public int getDamage(){
        return damage;
    }

    ArrayList<Weapon> weapons = new ArrayList<>();
    weapons.add(new Weapon("Sword", 10));
    weapons.add(new Weapon("Axe", 15));
    weapons.add(new Weapon("Fork", 2));
    weapons.add(new Weapon("Longbow", 20));
    weapons.add(new Weapon("Slingshot", 8));
    weapons.add(new Weapon("Flail", 12));



