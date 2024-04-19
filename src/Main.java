

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Frodo",22, 67);
        Human human2 = new Human("Gandalf", 640, 80);
        Human human3 = new Human("Samvise", 25, 75);
        Human human4 = new Human("Aragorn", 40, 90);
        Human human5 = new Human("Bilbo", 75, 70);
        Human human6 = new Human("Elendil", 76, 78);
        Human human7 = new Human("Isildur", 30, 85);
        Human human8 = new Human("Eärien", 23, 55);
        Human human9 = new Human("Bronwyn", 47, 66);
        Human human10 = new Human("Theo", 23, 78);

        Elf elf1 = new Elf("Legolas", 500, 70);
        Elf elf2 = new Elf("Galadriel", 3000, 60);
        Elf elf3 = new Elf("Elrond", 6000, 65);
        Elf elf4 = new Elf("Thranduill", 1500, 70);
        Elf elf5 = new Elf("Glorfindel", 1340, 66);
        Elf elf6 = new Elf("Amroth", 5200, 65);
        Elf elf7 = new Elf("Lúthien", 3160, 70);
        Elf elf8 = new Elf("Éowyn", 1500, 60);
        Elf elf10 = new Elf("Galathil", 2000, 65);

        Dwarf dwarf1 = new Dwarf("Thorin",300,50);
        Dwarf dwarf2 = new Dwarf("Balin",200,55);
        Dwarf dwarf3 = new Dwarf("Dwalin",110,67);
        Dwarf dwarf4 = new Dwarf("Filli",330,63);
        Dwarf dwarf5 = new Dwarf("Killi",224,64);
        Dwarf dwarf6 = new Dwarf("Dori",132,65);
        Dwarf dwarf7 = new Dwarf("Nori",88,65);
        Dwarf dwarf8 = new Dwarf("Óin",150,80);
        Dwarf dwarf9 = new Dwarf("Glóin",321,55);
        Dwarf dwarf10 = new Dwarf("Bofur",180,45);


        Weapon axe = new Weapon("Axe");
        Weapon longbow = new Weapon("Longbow");
        Weapon stone = new Weapon("Stone");

        human2.useToss(stone);


    }
}