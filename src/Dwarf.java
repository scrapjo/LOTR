import java.util.ArrayList;

public class Dwarf extends LivingBeing implements Tossable {

    private static final String[] NAMES = {
            "Azaghâl", "Balin", "Bofur", "Dáin", "Durin", "Dwalin", "Fíli", "Gimli", "Glóin", "Óin", "Thorin"
    };

    private static final int MIN_AGE = 30;
    private static final int MAX_AGE = 250;
    private static final double MIN_WEIGHT = 50;
    private static final double MAX_WEIGHT = 100;

    Dwarf(String name, int age, double weight) {
        super(name, age, weight);
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

    public static Dwarf generateRandomDwarf() {
        String name = NAMES[(int) (Math.random() * NAMES.length)];
        int age = MIN_AGE + (int) (Math.random() * (MAX_AGE - MIN_AGE + 1));
        double weight = MIN_WEIGHT + (Math.random() * (MAX_WEIGHT - MIN_WEIGHT + 1));
        return new Dwarf(name, age, weight);
    }

    @Override
    public void useToss(Tossable tossable) {
        if (tossable instanceof Weapon) {
            Weapon weapon = (Weapon) tossable;
            String tossResult = weapon.toss();
            if (tossResult.contains("cannot")) {
                System.out.println(this.getName() + " cannot toss the " + weapon.getName());
            } else {
                System.out.println(this.getName() + " " + tossResult);
            }

            } else if (tossable instanceof Dwarf) {
                Dwarf dwarf = (Dwarf) tossable;
                System.out.println(this.getName() + " is tossing " + dwarf.getName());
            System.out.println("Hey! dwarves dont like being tossed!");
            }
        }

        @Override
        public String getName () {
            return super.getName();
        }
    }




