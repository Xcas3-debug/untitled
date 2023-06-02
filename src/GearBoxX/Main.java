package GearBoxX;

public class Main {
    public static void main(String[] args) {
        GearBoxType type = GearBoxType.valueOf( "ROBOT");
//        GearBox gearBox = new GearBox();
//        gearBox.shiftUp();
                GearBox gearBox = new GearBox(type); // (GearBoxType.MANUAL);
        System.out.println(gearBox.getType());

    }

}
