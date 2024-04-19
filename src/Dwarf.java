import java.util.ArrayList;

public class Dwarf extends LivingBeing{

    Dwarf(String name, int age, double weight) {
        super (name, age, weight);
    }

    public void useWeapon(Weapon weapon) {
        System.out.println(this.getName() + " is using the " + weapon.getName() + ".");
        System.out.println(weapon.shoot());
        System.out.println(weapon.stab());
        System.out.println(weapon.toss());

    }

    public ArrayList<Weapon> getAvailableWeapons() {
        return Weapon.PREDEFINED_WEAPONS;
    }

}



