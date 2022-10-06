package zooAnimals;

public class Animal {
        String habitat;
        String type;

        static String name;
        int age;
        int lastFed;

        public Animal(String h, String t, String n, int a, int f) {
                this.habitat = h;
                this.type = t;

                this.name = n;
                this.age = 0;
                this.lastFed = 0;
        }
        void displayInfo() {
                System.out.println(
                        "animal is a "
                        +type
                        + ", "
                        + "located in "
                        +habitat);
                System.out.println();
                System.out.println(
                        "specific animal is "
                        +name
                        +", "
                        +age
                        +" years of age.");
                System.out.println();
                System.out.println(
                        "last been fed "
                        +lastFed
                        +" day(s) ago."
                );
        }
}
