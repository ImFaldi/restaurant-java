package com.mycompany.quiz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rifal
 */
class veh {
    String type;
    int cap;
    int spd;

}

class type extends veh{
    String carName;
    public type(String carName){
    this.carName = carName;
    }
}

public class Quiz {

    public static void inputMenu() {
        String input;
        int choose;
        Scanner ketik = new Scanner(System.in);
        System.out.println("Car Dealership :)");
        System.out.print("Please Input car name :");
        input = ketik.nextLine();
        System.out.print("Please Input type car :");
        System.out.println("1. Jeep\n2. SUV\n3. Sedan");
        choose = ketik.nextInt();

    }

    public static void main(String[] args) {
        int stats = 0;
        Scanner ketik = new Scanner(System.in);
        ArrayList<type> carList = new ArrayList<>();
        carList.add(new type("Jeep"));
        carList.add(new type("SUV"));
        carList.add(new type("Sedan"));

        type jeep = new type("Jeep");
        jeep.cap = 30;
        jeep.spd = 120;
        
        type SUV = new type("SUV");
        SUV.cap = 30;
        SUV.spd = 120;
        
        type sed = new type("Sedan");
        sed.cap = 30;
        sed.spd = 120;

        
        while (stats != 3) {
            System.out.println("Menu :");
            System.out.println("1. Add Car");
            System.out.println("2. Show Car");
            System.out.println("3. Exit");
            System.out.print("Input :");
            stats = ketik.nextInt();

            switch (stats) {
                case 1:
                    String input;
                    int choose;
                    
                    System.out.println("Please Input car name :");
                    input = ketik.next();
                    System.out.println("Please Input the car type :");
                    System.out.println("1. Jeep\n2. SUV\n3. Sedan");
                    choose = ketik.nextInt();
                    switch (choose) {
                        case 1:
                            jeep.type = "Jeep";
                            jeep.carName = input;
                            System.out.println("Success ✔");
                            break;
                        case 2:
                            SUV.type = "Jeep";
                            SUV.carName = input;
                            System.out.println("Success ✔");
                            
                        case 3:
                            sed.type = "Sedan";
                            sed.carName = input;
                            System.out.println("Success ✔");
                        default:
                            System.out.println("Invalid Input");
                    }
                    break;
                    
                case 2:
                    System.out.println("Here The List");
                    System.out.println(carList.toString());
                    
                case 3:
                    
                    break;
                default:
                    System.out.println("Invalid Input");
            }

        }

    }
}
