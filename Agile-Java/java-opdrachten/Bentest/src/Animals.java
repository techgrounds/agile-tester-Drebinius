public class Animals {

    public static void main(String[] args) {
        int cats   =5;
        int dogs  =4;
        System.out.println(cats > dogs);                  // t
//        System.out.println(cats >= dogs);               // t
//        System.out.println(cats < dogs);                  //f
//        System.out.println(cats <= dogs);               //f
//        System.out.println(cats == dogs);               //f
//        System.out.println(cats != dogs);                //t
    }
}
    /*
    strict typing lijkt zoals java te zijn, alle types e.d. moeten expliciet aangegeven worden.
    fouten/errors misschien beter te tracen omdat er minder conversion bezig is op de achtergrond?


    weak lijkt zoals javascript te zijn, datatypes hoeven niet expliciet aangegeven te worden.
    mede hierdoor voelt programmeren "soepeler", maar de code is meer vatbaar voor errors door auto conversion e.d.


     */
