public class PoliceOfficer {
    private String name;
    private int badgeNum;
    protected ParkedCar car;
    protected ParkingMeter meter;
    public ParkingTicket ticket;
    public boolean ticketIssued;

    public PoliceOfficer(String name, int badgeNum, ParkedCar car, ParkingMeter meter){
        this.name = name;
        this.badgeNum = badgeNum;

        this.car = new ParkedCar(car);
        this.meter = new ParkingMeter(meter);

        generateTicket();
    }

    public void generateTicket(){
        if (issueTicket(car, meter)){
            ticketIssued = true;
            ticket = new ParkingTicket(car, meter, name, badgeNum);
        }
    }

    public String getName() {
        return name;
    }

    public int getBadgeNum() {
        return badgeNum;
    }

    public ParkingTicket getTicket(){
        return ticket;
    }

        //This method decides whether it is fair to issue the ticket or not
    public boolean issueTicket(ParkedCar car, ParkingMeter meter){
        boolean issueTicket = false;
        if(car.getNumMinsParked() - meter.getNumMinsPurchased()> 0){
            issueTicket = true;
        }
        else{
            issueTicket = false;
        }
        return issueTicket;
    }
}
