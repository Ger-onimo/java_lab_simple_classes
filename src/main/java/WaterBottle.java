public class WaterBottle {
    private int volume = 100;


    public WaterBottle(){

    }

    public int reduceVolume(){
        return this.volume - 10;
    }

    public int zeroVolume(){
        return this.volume = 0;
    }

    public int fillWaterBottle(){
        return this.volume = 100;
    }
}