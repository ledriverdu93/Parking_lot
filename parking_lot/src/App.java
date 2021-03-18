
import java.io.*;
import java.util.*;

class App {
  public static void main(String[] args) {
    
    ArrayList<String> strings = new ArrayList<String>();
    
    strings.add("Hello, World!");
    strings.add("Please put code below\n");
    
    for (String string : strings) {
      System.out.println(string);
    }

    ParkingLot parking = new ParkingLot(5,5,5);

    Motorcycle honda = new Motorcycle();
    Motorcycle yamaha = new Motorcycle();

    Car vw = new Car();
    Van vito = new Van();


    System.out.println(parking);
    
    System.out.println();

    parking.getParkingSpot(5).use(honda);
    parking.getParkingSpot(3).use(honda);
    parking.getParkingSpot(7).use(vw);




    System.out.println(parking);

    System.out.println(parking.getParkingSpot(3));
    System.out.println(parking.getParkingSpot(5));
    System.out.println(parking.getParkingSpot(7));

    parking.getParkingSpot(5).free();
    parking.getParkingSpot(3).free();
    parking.getParkingSpot(7).free();

    System.out.println(parking);
    
    System.out.println(parking.getParkingSpot(3));
    System.out.println(parking.getParkingSpot(5));
    System.out.println(parking.getParkingSpot(7));

  }
}