public class Vehicule {
    protected String type;
    protected int size;

    public Vehicule(){
        this.type = "vehicule";
        this.size = 1;
    }

    public Vehicule(String typeOfVehicule, int sizeOfVehicule){
        this.type = typeOfVehicule;
        this.size = sizeOfVehicule;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
    
        String print = "Type => " + this.type + " :\nSize => " + this.size;

        return print;
    }
}
