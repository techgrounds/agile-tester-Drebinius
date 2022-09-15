package ArrayOfCats;

import java.util.ArrayList;
import java.util.List;

public class SomeCats {

    public static void main(String[] args) {
        String[] fourCats = {"Kat 1", "Kat 2", "Kat 3", "Kat 4"};                                //ODPR1
        System.out.println(fourCats.length);                                                        //ODPR2

        String [] [] sortedCats = {{"Kat 1"}, {"Kat 2", "Kat 3", "Kat 4"}};                   //ODPR3
        System.out.println(sortedCats.length);                                                    //multi-dimensional array

        ArrayList<String> catList = new ArrayList<>(4);            //ODPR4/8 initial capacity aangepast naar 4 voor opdr8
//        catList.ensureCapacity(4);

        catList.add("Kat 1");
        catList.add("Kat 2");
        catList.add("Kat 3");
        catList.add("Kat 4");
        System.out.println(catList);

        List<String> buitenKat = catList.subList(1, 4);
//        System.out.println(buitenKat);

//        catList.remove(buitenKat); // wont work, gonna remove 3 separate instances

        catList.remove("Kat 2");
        catList.remove("Kat 3");
        catList.remove("Kat 4");                                                                    //OPDR5 buitenkatten verwijderd

        System.out.println(catList);

//        System.out.println(catList.size());                                                          //OPDR6
                                                                                                                        /*
                                                                                                                        OPDR7 standaardmaat is 0, tot er een toevoeging is, dan wordt de cap 10,
                                                                                                                        nadat 10 bereikt is voor elke toevoeging +1 cap
                                                                                                                         */
    }


}



 /*   public static void main(String[] args) {
        String[] [] multiDimensionalArrayCats = {{"Kat 1", "Kat 2"}, {"Kat 3", "Kat 4", "Kat 5", "Kat 6"}};
                System.out.println(multiDimensionalArrayCats[1] [0]);

        String [] arrayCats = {"Kat 1", "Kat 2", "Kat 3", "Kat 4", "Kat 5", "Kat 6"};
                System.out.println(arrayCats[0]);

        ArrayList<String> arrayListCats = new ArrayList<>();
        arrayListCats.add("Kat 1");
        arrayListCats.add("Kat 2");
        arrayListCats.add("Kat 3");
        arrayListCats.add("Kat 4");
        arrayListCats.add("Kat 5");
        arrayListCats.add("Kat 6");

        System.out.println(arrayListCats);
    } */