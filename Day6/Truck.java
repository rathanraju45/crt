package Day6;

public class Truck extends Vehicle{
    private String steering;
    private String musicSystem;
    private String airConditioner;

    public Truck(){
        super();
        this.airConditioner="long";
        this.musicSystem="small";
        this.steering="round";
    }

    public Truck(String steering,String musicSystem,String airConditioner){
        super();
        this.airConditioner=airConditioner;
        this.steering=steering;
        this.musicSystem=musicSystem;
    }

    public String getSteering() {
        return steering;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(String musicSystem) {
        this.musicSystem = musicSystem;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(String airConditioner) {
        this.airConditioner = airConditioner;
    }
}
