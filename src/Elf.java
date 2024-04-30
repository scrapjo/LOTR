import java.util.ArrayList;

public class Elf extends LivingBeing{

    private static final String [] NAMES = {
            "Galadriel", "Elrond", "Thranduil", "Arwen", "Legolas", "Celeborn", "Gil-galad", "Finwë", "Fingolfin", "Lúthien", "Glorfindel",
            "Fëanor"

    };
    private static final int MIN_AGE = 18;
    private static final int MAX_AGE = Integer.MAX_VALUE;
    private static final double MIN_WEIGHT = 40;
    private static final double MAX_WEIGHT = 90;




    Elf(String name, int age, double weight) {
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

    public static Elf generateRandomElf() {
        String name = NAMES[(int)(Math.random() * NAMES.length)];
        int age = MIN_AGE + (int)(Math.random() * (MAX_AGE - MIN_AGE + 1));
        double weight = MIN_WEIGHT +(Math.random() * (MAX_WEIGHT -MIN_WEIGHT + 1));
        return new Elf(name, age, weight);
    }
}
