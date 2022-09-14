package Numan;

public class Car {
     String brand;         // when static is added, all brand and color
                                         // outputs set to the last added values. memory adressess do still differ
     String color;

    String name;

 public  Car(String b, String c) {
//        this.brand = b;
//        this.color = c;

     this.brand = b;
     if (brand == null) {
         brand = "placeholder";}

     this.color = c;
     if (color == null) {
         color = "placeholder";}

     this.name = null;
     if (name == null) {
         name = "placeholder";}
    }

   public Car(String b, String c, String n) {
        this.brand = b;
       if (brand == null) {
           brand = "placeholder";}

        this.color = c;
       if (color == null) {
           color = "placeholder";}

        this.name = n;
       if (name == null) {
           name = "placeholder";}
 }

//    public Car() {
//        this.brand = "placeholder";
//        this.color = "placeholder";
//        this.name ="placeholder";
    public Car() {
    this.brand = null;
        if (brand == null) {
            brand = "a placeholder";}
     this.color = null;
        if (color == null) {
            color = "placeholder";}
      this.name = null;
        if (name == null) {
            name = "a placeholder";}
    }
    void  Display(){
         System.out.println(      //display is een method bestaande uit sout en strings die icm een car instance called kan worden om "brand= b(brand), color= c(color)" als output te krijgen (zie line 25)
                            "brand= "
                         + brand
                         + ", "
                         + "color= "
                         + color
                         + ", "
                         + "name= "
                         + name);
     }
    void printColor(){
        System.out.println(color);                  //method voor OPDR3
    }

public String toString() {
     return  "This is a "
                        +color
                        +" colored car."
                        + " The brand is "
                        + brand
                        + ", "
                        + "it's name is "
                        + name
                        + ".";}
}



//    public static void main(String[] args) {
//      Car c1 = new Car("Volvo","Forest Green", " ");
//      Car c2 = new Car("Lada","Cardboard Brown", "Apyr");
//
//
//
//        c1.display();                           // brand= Volvo, color= Forest Green
//        c2.display();                           // brand= Lada, color= Cardboard Brown
//        c2.namedDisplay();
        //System.out.println(c1);     // Numan.Car@5b480cf9

       // c1.printColor();                    // OPDR 3 method call, output = forest green


