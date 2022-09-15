package Numan;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", "Forest Green");
        Car car2 = new Car("Lada", "Cardboard Brown", "Apyr (друг)");
        Car car3 = new Car();
        Car car4 = new Car();

            car3.brand="Kamaz";                           //adding or adjusting values is possible
            car3.color="slim, possibly shady";
            car3.name="Bintliy";

        System.out.println(car1);                      //toString has been adjusted in class Car to give a custom return instead of hashcode
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        car1.Display();                                         // brand= Volvo, color= Forest Green
        car2.Display();                                          // brand= Lada, color= Cardboard Brown, name= Apyr
        car3.Display();                                          //brand= Kamaz, color= Questionable, name= Bintliy
        car4.Display();

        car1.printColor();
        car2.printColor();
        car3.printColor();
        car4.printColor();
    }
}