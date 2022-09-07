
class Test {

    //public = Iedereen kan het zien
    //private = Strict tot dit bestand
 
    /*
          Opdracht 1 :
 
          Opdracht 2 :
     */

    public static void main(String[] args) {

//        String nummer = "Ik ben";
//        String nummer2 = "Mitch";
//
//        String uitkomst = nummer + nummer2;
//
//        System.out.println(uitkomst);


        int nummer1 = 1;

        int nummer = nummer1 + 2;

        test3("Mitch", "Mitch");
//        test3(4, 5);
//        test3(5, 5);
//        test3(7, 5);
 
        /*
       String tekst = "Hoi ik ben Mitch";
       double decimaal = 1.0;
       float floating = 1.0F;
         */

        // int - 1
        // naam - 2
        // = - 3
        // Wat gaat het worden - 4


    }

    public static void test3(String nummer1, String nummer2) {
        /*
            > = groter dan
            < = kleiner dan
            >= Groter of gelijkaan
            <= Kleiner en gelijk aan
            == Gelijk aan
            != Niet gelijk aan
 
            || = of
            && = En
 
 
         */

        if(nummer1 == "Mitch" || nummer2 == "Hup" ) {
            System.out.println("Tekst klopt");
        } else {
            System.out.println("Nummer 1 is niet groter dan 2");
        }
    }
}
 