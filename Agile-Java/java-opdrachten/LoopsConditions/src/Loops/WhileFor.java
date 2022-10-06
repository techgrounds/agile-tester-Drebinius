package Loops;


/*
OPDR 3.1

dan wordt de code uitgevoerd als een bepaalde boolean true is. deze boolean is altijd true
waardoor de loop in principe infinite wordt
*/

//public class WhileFor {                                                                                        //OPDR3.2
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 != 0) {
//                continue;                                                                                         //OPDR3.3
//            }
//            System.out.println(i);
//        }
//    }
//}

public class WhileFor {                                                                                        //OPDR3.4
    public static void main(String[] args) {

        for (int h = 1; h <= 3; h++) {  //outer loop
            System.out.println("outer loop iteration " + h);

            for (int i = 1; i <= 10; i++) { //inner løøp
                                                                                                                            //OPDR3.5
                if (h == 1) {
                    System.out.println(i);
                }
                if (h == 2) {
                    System.out.println(i*2);
                }
                if (h == 3){
                    System.out.println(i*4);
                }
            }
        }
    }
}


