package ObjectsAndClasses_StaticFinal;

public class CPU {
    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    public int getAmountCore() {
        return amountCore;
    }
    public void setAmountCore(int amountCore) {
        this.amountCore = amountCore;
    }
    public static double getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    double frequency;
    int amountCore;
    static double weight;
    String manufacturer;
    public CPU(double frequency, int amountCore, double weight, String manufacturer) {
        this.frequency = frequency;
        this.amountCore = amountCore;
        this.weight = weight;
        this.manufacturer = manufacturer;
    }


     CPU(double frequency, int amountCore, int weight){
 this.frequency=frequency;
 this.amountCore=amountCore;

     }



}
