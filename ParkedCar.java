public class ParkedCar {

    private String carMake, carModel, carColor, carLicence;     //The car's make,model,color, and licence plate
    private int numMinsParked;      //Number of minutes the car has been parked.

    /**
     * The constructor below initializes the car's
     * make, model, color, and licence plate
     * @param aMake The car's make
     * @param aModel The car's model
     * @param aColor the car's color
     * @param aLicence the car's licence plate
     * @param aMinsParked The time car was parked
     */

    public ParkedCar(String aMake, String aModel, String aColor, String aLicence, int aMinsParked){
        carMake = aMake;
        carModel = aModel;
        carColor = aColor;
        carLicence = aLicence;
        numMinsParked = aMinsParked;
    }

    //ParkedCar copy constructor
    public ParkedCar(ParkedCar object2){
        carMake = object2.carMake;
        carModel = object2.carModel;
        carColor = object2.carColor;
        carLicence = object2.carLicence;
        numMinsParked = object2.numMinsParked;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public String getCarLicence() {
        return carLicence;
    }

    public int getNumMinsParked() {
        return numMinsParked;
    }
}
