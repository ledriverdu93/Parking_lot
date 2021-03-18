import java.util.ArrayList;

public class ParkingLot {
    
    private ArrayList ParkingSpots;

    public ParkingLot() {
        Spot spot = new Spot(1);
        this.ParkingSpots = new ArrayList<Spot>();
        this.ParkingSpots.add(spot);
        
    }
    public ParkingLot(int numberOfMotorcycleSpots, int numberOfCarSpots, int numberOfLargeSpots) {

        this.ParkingSpots = new ArrayList<Spot>();

        for (int i = 0; i < numberOfMotorcycleSpots; i++) {
            MotorcycleSpot spot = new MotorcycleSpot();
            spot.setNumber(ParkingSpots.size()+1);
            this.ParkingSpots.add(spot);
        }
        for (int i = 0; i < numberOfCarSpots; i++) {
            CarSpot spot = new CarSpot();
            spot.setNumber(ParkingSpots.size()+1);
            this.ParkingSpots.add(spot);
        }
        for (int i = 0; i < numberOfLargeSpots; i++) {
            LargeSpot spot = new LargeSpot();
            spot.setNumber(ParkingSpots.size()+1);
            this.ParkingSpots.add(spot);
        }
        
    }

    public Spot getParkingSpot(int spotNumber) {
        
        Spot parkingSpot = null;

        if (this.ParkingSpots.size()< spotNumber || spotNumber <= 0) {

            System.out.println("Parking spot n°"+ spotNumber + " does not exist !");
        } 
        else {
            
            parkingSpot = (Spot)this.ParkingSpots.get(spotNumber-1);
        }

        return parkingSpot;
    }

    public int getNumberOfParkingSpots() {
        int NumberOfParkingSpots = this.ParkingSpots.size();
        return NumberOfParkingSpots;
    }

    public int freeSpots() {
        int freeSpots = 0;

        for (int i = 0; i < this.ParkingSpots.size(); i++) {
            Spot spot = (Spot)ParkingSpots.get(i);
            if (spot.isTaken == false) {
                freeSpots ++;
            }
        }

        return freeSpots;
    }
    
    public boolean isEmpty() {
        
        boolean isEmpty = false;
        
        if (this.freeSpots()==this.getNumberOfParkingSpots()) {
            isEmpty = true;
        }

        return isEmpty;
    }

    public boolean isFull(){

        boolean isFull = false;
        
        if (this.freeSpots()==0) {
            isFull = true;
        }

        return isFull;
    }

    public boolean isTypeOfSpotsFull(String typeOfSpot) {
        int freeSpots = 0;
        boolean isTypeOfSpotsFull = false;
        for (int i = 0; i < this.ParkingSpots.size(); i++) {
            Spot spot = (Spot)ParkingSpots.get(i);
            if (spot.isTaken == false && spot.type == typeOfSpot) {
                freeSpots ++;
            }
        }

        if (freeSpots == 0) {
            isTypeOfSpotsFull = true;
        }

        return isTypeOfSpotsFull;
    }

    public int numberOfSpotsTakenByVans() {
        
        int numberOfSpotsTakenByVans = 0;
        String typeOfVehiculeParked = "";
        
        for (int i = 0; i < this.ParkingSpots.size(); i++) {

            Spot spot = (Spot)ParkingSpots.get(i);

            if (spot.isTaken) {
            typeOfVehiculeParked = spot.vehicule.getType();
            }
            
            if (typeOfVehiculeParked == "van") {
                numberOfSpotsTakenByVans ++;
            }
        }

        return numberOfSpotsTakenByVans;
    }

    public ArrayList<Integer> listOfTakenSpots() {
        
        ArrayList<Integer> listOfTakenSpots =  new ArrayList<Integer>();
        
        for (int i = 0; i < this.ParkingSpots.size(); i++) {
            Spot spot = (Spot)ParkingSpots.get(i);
            if (spot.isTaken == true) {
                listOfTakenSpots.add(spot.getNumber());
            }
        }
        
        return listOfTakenSpots;
    }

    public String toString() {
        
        String print = "\n--------------------Parking status--------------------\n";
        
        print = print + this.freeSpots() + " Parking spots are remaining." 
               + "\n" + this.getNumberOfParkingSpots() + " total spots are in the parking lot.";

        if (this.isFull()) {
            print = print + "\nThe parking lot is full !";
        }
        if (this.isEmpty()) {
            print = print + "\nThe parking lot is empty !";
            
        }
        if (this.isTypeOfSpotsFull("car")) {
            print = print + "\nNo car spots are available !";
        }
        if (this.isTypeOfSpotsFull("motorcycle")) {
            print = print + "\nNo motorcycle spots are available !";
        }
        if (this.isTypeOfSpotsFull("large")) {
            print = print + "\nNo large spots are available !";
        }

        print = print + "\n"+ this.numberOfSpotsTakenByVans() +" spots are taken by vans.\n";

        if(this.listOfTakenSpots().size()>0){
            for (int i = 0; i < this.listOfTakenSpots().size(); i++) {
                print = print + this.listOfTakenSpots().get(i);
                if (i < this.listOfTakenSpots().size()-1) {
                    print = print +", ";
                }
                else{
                    print = print +" are spot numbers that are taken.";
                }
            }
        }
        



        return print;
    }
}
