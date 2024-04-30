

public class LivingBeing {

    String name;
    int age;
    double weight;


    public LivingBeing(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
        public String getName() {
        return this.name;
        }

        public int getAge() {
        return this.age;
        }

        public double getWeight() {
        return this.weight;
        }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + getName() + ", Age: " + getAge() + " Weight: " + String.format("%.2f", getWeight()) + " kg";
    }

        void eat () {
            System.out.println(this.name + " is eating");
        }

        void eatMultiple (LivingBeing...beings){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < beings.length; i++) {
                sb.append(beings[i].getName());
                if (i < beings.length - 2) {
                    sb.append(" , ");
                } else if (i == beings.length - 2) {
                    sb.append(" and ");
                }
            }
            sb.append(" is eating");
            System.out.println(sb.toString());
        }

        void drink () {
            System.out.println(this.name + " is drinking");
        }

        void drinkMultiple (LivingBeing...beings){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < beings.length; i++) {
                sb.append(beings[i].getName());
                if (i < beings.length - 2) {
                    sb.append(" , ");
                } else if (i == beings.length - 2) {
                    sb.append(" and ");
                }
            }
            sb.append(" is drinking");
            System.out.println(sb.toString());
        }

        void walk () {
            System.out.println(this.name + " went for a walk");
        }

        void walkMultiple (LivingBeing...beings){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < beings.length; i++) {
                sb.append(beings[i].getName());
                if (i < beings.length - 2) {
                    sb.append(" , ");
                } else if (i == beings.length - 2) {
                    sb.append(" and ");
                }
            }
            sb.append(" went for a walk. ");
            System.out.println(sb.toString());
        }

        void sleep () {
            System.out.println(this.name + " is sleeping");
        }

        void sleepMultiple (LivingBeing...beings){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < beings.length; i++) {
                sb.append(beings[i].getName());
                if (i < beings.length - 2) {
                    sb.append(" , ");
                } else if (i == beings.length - 2) {
                    sb.append(" and ");
                }
            }
            sb.append(" is sleeping");
            System.out.println(sb.toString());
        }

        void useSwing(Weapon weapon) {
            String swingResult = weapon.swing();
            if (swingResult.contains("cannot")) {
                System.out.println(this.getName() + " cannot swing the " + weapon.getName());
            } else {
                System.out.println(this.getName() + " " + swingResult);
                //TODO Implement logic to swing the weapon
            }
        }

        void useStab(Weapon weapon) {
            String stabResult = weapon.stab();
            if (stabResult.contains("cannot")) {
                System.out.println(this.getName() + " cannot stab with the " + weapon.getName());
            } else {
                System.out.println(this.getName() + " " + stabResult);
                //TODO Implement logic to stab the weapon
            }
        }

        void useToss(Weapon weapon) {
            String tossResult = weapon.toss();
            if (tossResult.contains("cannot")) {
                System.out.println(this.getName() + "cannot toss the " + weapon.getName());
            } else {
                System.out.println(this.getName() + " " + tossResult);
                //TODO Implement logic to toss
                //TODO remember dwarfs can be tossed
            }
        }

        void useShoot(Weapon weapon) {
            String shootResult = weapon.shoot();
            if (shootResult.contains("cannot")) {
                System.out.println(this.getName() + "cannot shoot" + weapon.getName());
            } else {
                System.out.println(this.getName() + " " + shootResult);
                //TODO Implement logic to shoot
            }
        }
    }
