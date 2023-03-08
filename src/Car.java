public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric, boolean discountApplied){

        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public boolean isElectric(){
        return electric;
    }




    public void printCar(){
        System.out.println("License plate: " + getlicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric? : " + electric);
        System.out.println("Discount Applied? :" + discountApplied);
    }

}



