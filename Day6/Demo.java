package Day6;

public class Demo {
    public static void main(String[] args) {
        Bike bike=new Bike();
        Car car=new Car();
        Truck truck=new Truck();
        bike.handle="short";
        bike.setWheels(4);
        bike.setSeats(1);
        bike.setLights(2);
        System.out.println(bike.getHandle());
        System.out.println(bike.getEngine());
        System.out.println(car.getEngine());
        System.out.println(car.getEntertainmentSystem());
        System.out.println(car.getMusicSystem());
        System.out.println(car.getFridge());
        System.out.println(truck.getMusicSystem());
        System.out.println(truck.getSteering());
        System.out.println(truck.getAirConditioner());
        System.out.println(truck.getFuelTank());
    }
}
