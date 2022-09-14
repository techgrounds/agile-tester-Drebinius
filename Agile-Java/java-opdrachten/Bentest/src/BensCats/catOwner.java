package BensCats;

class catOwner {

     final String name;

     static  String fulllName = "";

     static  int numberOfCats = 0;

     public catOwner(String name) {
         this.name = name;
    }

    public catOwner(int numberOfCats, String name) {
        this.name = "";
        this.numberOfCats = 0;
    }
}
