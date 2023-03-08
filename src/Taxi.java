public class Taxi extends Car{
    private double fareCollected;
    private boolean discountApplied;


    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, boolean discountApplied, double fareCollected){
        super(licensePlate, tollFee, passengers, electric, discountApplied);
        this.fareCollected = fareCollected;

        }


        public void printTaxi(){
            System.out.println("License plate: " + getlicensePlate());
            System.out.println("Toll fee: " + getTollFee());
            System.out.println("Passengers: " + getPassengers());
            System.out.println("Electric? : " + isElectric());
            System.out.println("Discount Applied? :" + discountApplied);
            System.out.println("Fare collected: " + fareCollected);
        }
        }


