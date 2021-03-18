public class LargeSpot extends Spot{
    
    public LargeSpot() {
        
        this.number = 0;
        this.isTaken = false;
        this.type = "large";
        this.vehicule = null;
    }

    public LargeSpot(int spotNumber) {
        
        this.number = spotNumber;
        this.isTaken = false;
        this.type = "large";
        this.vehicule = null;
    }
}
