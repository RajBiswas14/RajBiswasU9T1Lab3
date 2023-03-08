public class Truck extends Vehicle{
    private int axles;
    private boolean hasTrailer;

    private boolean discountApplied;
    private int passengers;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer ){
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }


    public boolean getDiscountedApplied() {
        return discountApplied;
    }
    public void printTruck(){
        System.out.println("License plate: " + getlicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("axles? : " + axles);
        System.out.println("hasTrailer? :" + discountApplied);
    }

}

