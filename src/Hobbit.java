import java.util.ArrayList;

public class Hobbit extends LivingBeing{

    private static final String[] NAMES = {
            "Frodo", "Samvise", "Bilbo", "Meriadoc", "Belladonna","Peregrin", "Fredegar", "Sméagol", "Déagol"
    };
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = 100;
    private static final int MIN_WEIGHT = 50;
    private static final int MAX_WEIGHT = 100;

    Hobbit(String name, int age, double weight) {
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

    public static Hobbit generateRandomHobbit() {
        String name = NAMES[(int)(Math.random() * NAMES.length)];
        int age = MIN_AGE + (int)(Math.random() * (MAX_AGE - MIN_AGE + 1));
        double weight = MIN_WEIGHT + (Math.random() * (MAX_WEIGHT - MIN_WEIGHT + 1));
        return new Hobbit(name, age, weight);
    }
}


