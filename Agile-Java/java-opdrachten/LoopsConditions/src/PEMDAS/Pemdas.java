package PEMDAS;
/* OPDR2 PEMDAS practice

    OPDR 2.1/2/3

    isMathFun1
    if a is not equal to 7 (its not) AND if b is equal or greater than a(its not) OR a is not equal to a(it is)
    a is NIET gelijk aan 7 && b is NIET gelijk of groter dan a || a is WEL gelijk aan a~~~boolean is dus TRUE

    isMathFun2
    if a is equal to b(its not) OR if b is not larger than 3 (b is not larger than 3, its equal)
    a is NIET gelijk aan b || b is NIET groter dan 3~~~boolean is dus TRUE

    isMathFun3
    if b is not smaller than or equal to a(it is) AND if b is not equal to a+b (its not)
    b is WEL kleiner of gelijk aan a && b(3) is NIET gelijk aan de som van a + b(9)~~~boolean is dus FALSE


  */
public class Pemdas {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        boolean isMathFun1 = !(b <= a && b != a + b);
        System.out.println(isMathFun1);
    }
}
