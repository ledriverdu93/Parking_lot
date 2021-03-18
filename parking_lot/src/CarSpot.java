public class CarSpot extends Spot{
    
    private Car car;

    public CarSpot() {
        
        this.number = 0;
        this.isTaken = false;
        this.type = "car";
        this.car = null;
    }

    public CarSpot(int spotNumber) {
        
        this.number = spotNumber;
        this.isTaken = false;
        this.type = "car";
    }

    public boolean use(Vehicule vehiculeToPark) {
        
        boolean success = false;
        
        if (isTaken == false) {
            
            if (vehiculeToPark.getType() == "car" || vehiculeToPark.getType() =="motorcycle") {
            
                this.isTaken = true;
                this.vehicule = vehiculeToPark;
                success = true; 
            } 
        }else{
            System.out.println("Parking spot n°" + this.number +" is used !");
        }

        return success;
    }
    public Car getVehicule() {
        return car;
    }
}
