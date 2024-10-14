public class Demo {
    public static void main(String[] args) {

        ParkedCar car = new ParkedCar("Honda", "Pilot", "Black","",120);
        ParkingMeter meter = new ParkingMeter(60);
        PoliceOfficer officer = new PoliPceOfficer("Victor Ciubaciuc", 4460, car, meter);

        if(officer.ticketIssued){
            System.out.println("TICKET ISSUED!\n");
            System.out.println(officer.getTicket().toString()); //prints the ticket if the officer checked and gave ticket
        }
        else{
            System.out.println("No ticket for you today. \n :)");
        }
    }
}
