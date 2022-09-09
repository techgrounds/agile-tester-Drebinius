public class Ben {

//  error, incompatible types. string cannot be converted to integer.
    public static void main(String[] args) {
            String name  = "Ben";
            int numberOfCats =7;

//        System.out.println();
            getIntro("Ben", numberOfCats);
    }

    public static void getIntro(String name, int numberOfCats) {
        int cats = numberOfCats;

        if (cats == 3){
            System.out.println(
                    ("This is ")
                            + name
                            +(", ")
                            + name
                            +(" has ")
                            + cats
                            +(" cats.")
            );
        } else if (cats >=4 && cats <=6) {
            System.out.println(
                    ("This is ")
                            + name
                            +(", ")
                            + name
                            +(" has ")
                            + cats
                            +(" cats. Must smell nice."));

        } else if (cats >=7) {
            System.out.println(
                    ("This is ")
                            + name
                            +(", ")
                            + name
                            +(" has ")
                            + cats
                            +(" cats. Must be hell."));
        }
    }
}
