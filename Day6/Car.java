package Day6;

public class Car extends Vehicle{
    public String steering;
    public String musicSystem;
    public String airConditioner;
    public String fridge;
    public String entertainmentSystem;

    public Car(String steering,String musicSystem,String airConditioner, String fridge,String entertainmentSystem){
        super();
        this.airConditioner=airConditioner;
        this.fridge=fridge;
        this.steering=steering;
        this.musicSystem=musicSystem;
        this.entertainmentSystem=entertainmentSystem;
    }

    public Car(){
        super();
        this.steering="round";
        this.fridge="small";
        this.musicSystem="sony";
        this.airConditioner="small";
        this.entertainmentSystem="TV SET";
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

    public String getFridge() {
        return fridge;
    }

    public void setFridge(String fridge) {
        this.fridge = fridge;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    public void setEntertainmentSystem(String entertainmentSystem) {
        this.entertainmentSystem = entertainmentSystem;
    }
}
