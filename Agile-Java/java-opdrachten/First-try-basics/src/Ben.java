class Ben {

//  error, incompatible types. string cannot be converted to integer.
    public static void main(String[] args) {
            String name  = "Ben";

            int x = 6;

            int numberOfCats = x;

//        System.out.println();
            CatMan("Ben",x);
    }

    public static void CatMan(String name, int numberOfCats) {
        if (name == "Ben"){
            System.out.println(
                    ("This is ")
                            + name
                            +(", ")
                            + name
                            +(" has ")
                            + numberOfCats
                            +(" cats. He must smell nice.")
            );
        } else {
            System.out.println("THIS ISNT BEN");
        }
    }
}
