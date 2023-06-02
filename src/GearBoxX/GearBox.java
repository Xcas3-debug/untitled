package GearBoxX;

public class GearBox {
    /**
     * 0 - neutral
     * -1 - real
     * 1-6
     */
    public static final int MIN_GEAR = 1;
    private static final int MAX_GEAR = 6;
    private int gear = 0;

    //public final int type;
    public final GearBoxType type;
//    public static  final  int TYPE_AUTOMATIC =1;
//    public  static  final int TYPE_MANUAL=2;
//    public  static  final int TYPE_ROBOT=3;
//    public  static  final int TYPE_VARIATOR=4;
    public GearBox(GearBoxType type) {
        this.type= type;

    }
    public GearBoxType getType(){
        return type;
    }


    public void shiftUp(){ //не когда не будет свыше 6
        gear = gear < MAX_GEAR ? gear + 1 : gear;
    }
    public void shiftDown(){
        gear = gear > MAX_GEAR ? gear - 1 : gear;
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
