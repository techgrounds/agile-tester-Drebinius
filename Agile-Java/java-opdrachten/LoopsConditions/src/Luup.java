public class Luup {
    public static void main(String[] args) {
        int amount = 27;
       /* if (amount%3 == 0) {
            System.out.println(amount + " is deelbaar door 3");                               //OPDR1.1
              if (amount%2 != 0) {
                  System.out.println(amount + " is niet deelbaar door 2");                  //ODPR1.2
              }
        } else {
            System.out.println("idk what to do"); */
        if (amount%3 == 0 && amount%2 != 0) {
            System.out.println(amount + " is deelbaar door 3, maar niet door 2");
        } else {
            System.out.println("not a clue mate");
        }
    }
}
