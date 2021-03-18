public class Spot {

    protected int number;
    protected boolean isTaken;
    protected String type;
    protected Vehicule vehicule;

    public Spot() {
        
        this.number = 0;
        this.isTaken = false;
        this.type = "spot";
        this.vehicule = null;
    }

    public Spot(int spotNumber) {
        
        this.number = spotNumber;
        this.isTaken = false;
        this.type = "spot";
        this.vehicule = null;
    }

    public boolean getIsTaken() {
        return this.isTaken;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public boolean use(Vehicule vehiculeToPark) {
        
        boolean success = false;
        
        if (isTaken == false) {
            this.isTaken = true;
            this.vehicule = vehiculeToPark;
            success = true; 
        }

        return success;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public boolean free() {
        
        boolean success = false;
        
        if (isTaken == true) {
            this.isTaken = false;
            this.vehicule = null;
            System.out.println("Parking spot n°" + this.number +" is now empty !");
            success = true; 
        }
        
        return success;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
    
        String print = "Spot n° "+ this.number + " :\nState => ";
        
        if (isTaken) {
            print = print + "not available";
        } 
        else {
            print = print + "available";
        }
        
        print = print + "\nType => " + this.type;

        return print;
    }   
}
    
    
