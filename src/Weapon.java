import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Weapon {

    private String name;
    private int damage;
    public static final ArrayList<Weapon> PREDEFINED_WEAPONS = new ArrayList<>();
    public static final Map<String, Integer> PREDEFINED_WEAPON_DAMAGE = new HashMap<>();


    //TODO make weapons usable in different ways and to have different ammount of damage if they are used in different ways
    //TODO make more weapons
    static {
            PREDEFINED_WEAPONS.add(new Weapon("Sword", 10));
            PREDEFINED_WEAPONS.add(new Weapon("Axe", 15));
            PREDEFINED_WEAPONS.add(new Weapon("Fork", 2));
            PREDEFINED_WEAPONS.add(new Weapon("Longbow", 20));
            PREDEFINED_WEAPONS.add(new Weapon("Slingshot", 8));
            PREDEFINED_WEAPONS.add(new Weapon("Flail", 17));
            PREDEFINED_WEAPONS.add(new Weapon("Stone", 4));
            PREDEFINED_WEAPONS.add(new Weapon("Spear", 16));
        }

    static {
            PREDEFINED_WEAPON_DAMAGE.put("Sword", 10);
            PREDEFINED_WEAPON_DAMAGE.put("Axe", 15);
            PREDEFINED_WEAPON_DAMAGE.put("Fork", 2);
            PREDEFINED_WEAPON_DAMAGE.put("Longbow", 20);
            PREDEFINED_WEAPON_DAMAGE.put("Slingshot", 8);
            PREDEFINED_WEAPON_DAMAGE.put("Flail", 17);
            PREDEFINED_WEAPON_DAMAGE.put("Stone", 4);
            PREDEFINED_WEAPON_DAMAGE.put("Spear", 16);
    }

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public Weapon(String name) {
        this.name = name;
        this.damage = PREDEFINED_WEAPON_DAMAGE.getOrDefault(name, 0);
    }

    public String swing() {
        if (name.equals("Sword") || name.equals("Flail") || name.equals("Axe")) {
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
        if(name.equals("Fork") || name.equals("Sword") || name.equals("Spear")) {
            return "The " + name + " is stabbing. ";
        } else {
            return "The " + name + " cannot stab. ";
        }
    }

    public String toss() {
        if(name.equals("Stone") || name.equals("Spear") || name.equals("fork")) {
            return "The " + name + " is tossing. ";
        } else {
            return "The " + name + " cannot be tossed. ";
        }
    }

    public ArrayList<Weapon> getPredefinedWeapons() {
        return new ArrayList<>(PREDEFINED_WEAPONS);
    }

    public String getName() {
        return this.name;
    }
}









