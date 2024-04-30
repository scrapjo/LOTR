import java.util.ArrayList;

public class Human extends LivingBeing {

    private static final String[] NAMES = {
            "Aragorn", "Ailinel", "Aldor", "Andróg", "Araglas", "Anborn", "Bain", "Barahir", "Berúthiel", "Borondir", "Denethor", "Éomer",
            "Éowyn", "Húrin", "Morwen", "Yávien"

    };
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 100;
    private static final double MIN_WEIGHT = 50;
    private static final double MAX_WEIGHT = 140;
    //TODO height?


    Human(String name, int age, double weight) {

        super (name, age, weight);

    }
    public void useWeapon(Weapon weapon) {
        System.out.println(this.getName() + " is using the " + weapon.getName() + ".");
        System.out.println(weapon.shoot());
        System.out.println(weapon.stab());
        System.out.println(weapon.toss());
    }

    public ArrayList<Weapon> getAvailableWeapons(){

        return Weapon.PREDEFINED_WEAPONS;
    }

    public static Human generateRandomHuman() {
        String name = NAMES[(int)(Math.random() * NAMES.length)];
        int age = MIN_AGE + (int)(Math.random() * (MAX_AGE - MIN_AGE + 1));
        double weight = MIN_WEIGHT + (Math.random() * (MAX_WEIGHT - MIN_WEIGHT + 1));
        return new Human(name, age, weight);
    }

}



