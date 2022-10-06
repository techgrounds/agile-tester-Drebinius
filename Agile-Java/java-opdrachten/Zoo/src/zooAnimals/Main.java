package zooAnimals;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ZooAnimals = new ArrayList<>();


        System.out.println("enter something choom");
        String name = scanner.nextLine();;
//        name = scanner.nextLine();

        System.out.println(name);

        scanner.close();
    }
}
