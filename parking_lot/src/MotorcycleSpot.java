public class MotorcycleSpot extends Spot{
    
    private Motorcycle motorcycle;

    public MotorcycleSpot() {
        
        this.number = 0;
        this.isTaken = false;
        this.type = "motorcycle";
        this.motorcycle = null;
    }

    public MotorcycleSpot(int spotNumber) {
        
        this.number = spotNumber;
        this.isTaken = false;
        this.type = "motorcycle";
        this.motorcycle = null;
    }

    public boolean use(Vehicule vehiculeToPark) {
        
        boolean success = false;
        
        if (isTaken == false) {

            if (vehiculeToPark.getType() =="motorcycle") {

                this.isTaken = true;
                this.vehicule = vehiculeToPark;
                success = true; 
            }
            else{
                System.out.println("This is a spot for motorcycle only !");
            }
            
        }else{
            System.out.println("Parking spot n°" + this.number +" is used !");
        }

        return success;
    }

    public Motorcycle getVehicule() {
        return motorcycle;
    }

    
}
