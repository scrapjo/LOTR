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

            PREDEFINED_WEAPONS.add(new Weapon("Spoon", 3));
            PREDEFINED_WEAPONS.add(new Weapon("Pot", 5));
            PREDEFINED_WEAPONS.add(new Weapon("Mace", 10));
            PREDEFINED_WEAPONS.add(new Weapon("Morning Star", 15));
            PREDEFINED_WEAPONS.add(new Weapon("Sling", 13));
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

            PREDEFINED_WEAPON_DAMAGE.put("Spoon", 3);
            PREDEFINED_WEAPON_DAMAGE.put("Pot", 5);
            PREDEFINED_WEAPON_DAMAGE.put("Mace", 10);
            PREDEFINED_WEAPON_DAMAGE.put("Morning Star", 15);
            PREDEFINED_WEAPON_DAMAGE.put("Sling", 13);
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
        if (name.equals("Sword") || name.equals("Flail") || name.equals("Axe") || name.equals("Spoon") || name.equals("Pot")
                || name.equals("Mace") || name.equals("Morning Star")) {
            return  " swung the " + name + " in a wide arc. ";
        } else {
            return " cannot be swing the " + name;
        }
    }
    //Todo ammo count
    public String shoot() {
        if(name.equals("Longbow") || name.equals("Slingshot") || name.equals("Sling")) {
            return " has fired the " + name;
        } else {
            return " cannot be shoot with the " + name;
        }
    }

    public String stab() {
        if(name.equals("Fork") || name.equals("Sword") || name.equals("Spear") || name.equals("Spoon")) {
            return " is stabbing with the " + name;
        } else {
            return " cannot stab with the " + name;
        }
    }

    public String toss() {
        if(name.equals("Stone") || name.equals("Spear") || name.equals("Fork") || name.equals("Spoon") || name.equals("Pot")) {
            return " is tossing the " + name;
        } else {
            return " cannot toss the " + name;
        }
    }

    public ArrayList<Weapon> getPredefinedWeapons() {
        return new ArrayList<>(PREDEFINED_WEAPONS);
    }

    public String getName() {
        return this.name;
    }
}









