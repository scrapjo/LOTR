

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


    }
