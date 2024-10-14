public class ParkingTicket {
    public String make, model, color, licencePlate, officerName;
    public int numMinsParked, numMinsPaidFor, numMinsOver, badgeNumber;
    public int fee;
    public ParkingTicket(ParkedCar car, ParkingMeter meter, String officerName, int badgeNum){
        make = car.getCarMake();
        model = car.getCarModel();
        color = car.getCarColor();
        licencePlate = car.getCarLicence();
        numMinsParked = car.getNumMinsParked();
        numMinsPaidFor = meter.numMinsPurchased;

        fee = getParkFee();

        this.officerName = officerName;
        badgeNumber = badgeNum;
    }

    private int getParkFee(){
        numMinsOver = numMinsParked - numMinsPaidFor;
        int parkFee = 0;
        if (numMinsOver <= 60){
            parkFee = 25;
        }
        else if(numMinsOver > 60){
            parkFee = 25;
            fee = additionalFee(numMinsOver);
            parkFee = parkFee + fee;
        }

        return parkFee;
    }


        //Method below counts the additional fee for every extra hour after the first hour
    private int additionalFee(int numMinsOver){
        int additionalFee = 10;
        int fee = 0;

        if (numMinsOver > 60){
            fee = additionalFee * (numMinsOver  /60);
        }

        return fee;
    }


    public String toString(){
        String str = "Car information: " +
                "\n  Make: " + make +
                "\n  Model: " + model +
                "\n  Color: " + color +
                "\n  Licence Plate: " + licencePlate +
                "\nTicket information: " +
                "\n  Ticket fee: $" + fee +
                "\nOfficer information: " +
                "\n  Officer's name: " + officerName +
                "\n  Officer's badge number: " + badgeNumber+
                "\nMinutes overtime: " + numMinsOver;

        return str;
    }



}
