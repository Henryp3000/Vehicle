public class Main {
    public static void main(String[] args) {
        Car Car = new Car("Mazda 6","2","20","60f");
        Truck truck = new Truck("Ford Edge","5","35","65");
        Bike bike = new Bike("Ninja","6","12","80");
        RollerCoaster rollerCoaster = new RollerCoaster();
        System.out.println(Car.totalBeforeTax());
        System.out.println(truck.totalBeforeTax());
        System.out.println(Bike.totalBeforeTax());


        Vehicle [] vehicles = {Car, truck, bike};
        RideAble [] rideAbles = { rollerCoaster, bike};

    }

}
