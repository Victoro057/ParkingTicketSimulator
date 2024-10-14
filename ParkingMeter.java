public class ParkingMeter {
    int numMinsPurchased;


    public ParkingMeter(int minsPurchased){
        numMinsPurchased = minsPurchased;
    }
    public ParkingMeter (ParkingMeter meter){
        numMinsPurchased = meter.numMinsPurchased;
    }
    public int getNumMinsPurchased() {
        return numMinsPurchased;
    }

}
