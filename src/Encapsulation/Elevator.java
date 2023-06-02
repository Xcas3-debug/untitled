package Encapsulation;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor= currentFloor<minFloor ? currentFloor - 1 : currentFloor;}

    public void moveUp() {
        currentFloor= currentFloor<maxFloor ? currentFloor + 1 : currentFloor;}


    public Elevator(int minFloor, int maxFloor) {
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
    }

    public void move(int floor) {
        if (floor >= minFloor && floor <= maxFloor && floor != currentFloor) {
            int moveStep = floor > currentFloor ? 1 : -1;
            do {
                currentFloor += moveStep;
                System.out.println("Этаж: " + currentFloor);
            } while (floor != currentFloor);
        } else {
            System.out.println("Ошибка");
        }

    }
}
