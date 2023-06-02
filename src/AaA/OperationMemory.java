package AaA;

public class OperationMemory {

    public String typeOM;
    public int volume;
    public double weight;

    public OperationMemory (String typeOM, int volume, double weight) {
        this.typeOM = typeOM;
        this.volume = volume;
        this.weight = weight;
    }

    public OperationMemory setTypeOM (String typeOM) {
        return new OperationMemory(typeOM, volume, weight);
    }
    public OperationMemory setVolume (int volume) {
        return new OperationMemory(typeOM, volume, weight);
    }
    public OperationMemory setWeight (double weight) {
        return new OperationMemory(typeOM, volume, weight);
    }
    public String getTypeOM() {return typeOM;}
    public int getVolume() {return volume;}
    public double getWeight() {return weight;}
}