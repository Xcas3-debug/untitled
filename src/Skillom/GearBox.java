package Skillom;


public class GearBox {
    /**
     * 0 - neutral
     * -1 - real
     * 1-6
     */
    private int minGear = 1;
    private int maxGear = 6;
    private int gear = 0;

    public void shiftUp(){ //не когда не будет свыше 6
        gear = gear <  maxGear ? gear + 1 : gear;
    }
    public void shiftDown(){
        gear = gear > maxGear ? gear - 1 : gear;
    }

    public void swiftRear() {
        gear = (gear > 1) ? gear : -1;
    }

    public void swiftNeutral() {
        gear = 0;
    }
    public  int getCurrentGear(){
        return gear;
    }
}
