package BensCats;

public class Ben {

    public static void main(String[] args) {
        catOwner catowner = new catOwner("BensCats.Ben");
            catowner.fulllName = "BensCats.Ben Catman";
            catowner.numberOfCats = 10;
            System.out.println(catowner.numberOfCats);

            catowner.numberOfCats = 10 + 5;
            System.out.println(catowner.numberOfCats);

            System.out.println(catowner.numberOfCats % 4);      //3 cats remain. poor ben.
    }

}
