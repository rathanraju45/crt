package Day2;


class Car {
    private String doors;
    private String engienes;
    private String drivers;
    public int speed;

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void setDoors(String doors){
        this.doors=doors;
    }

    public String getDoors(){
        return doors;
    }

    public void setEngienes(String engienes){
        this.engienes=engienes;
    }

    public String getEngienes(){
        return engienes;
    }

    public void setDrivers(String drivers){
        this.drivers=drivers;
    }

    public String getDrivers(){
        return drivers;
    }
}
public class Hello{
    public static void main(String[] args) {
        Car obj=new Car();
        obj.setSpeed(1);
        obj.setDoors("open");
        obj.setDrivers("rathan");
        obj.setEngienes("suzuki");

        System.out.println("details");
        System.out.println("speed:"+obj.getSpeed());
        System.out.println("engien:"+obj.getEngienes());
        System.out.println("doors:"+obj.getDoors());
        System.out.println("drivers:"+obj.getDrivers());
    }
}
