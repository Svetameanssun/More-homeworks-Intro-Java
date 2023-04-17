public class Laptop {
    public String getRam() {
        return ram;
    }

    public String getMemory() {
        return memory;
    }

    public String getOS() {
        return OS;
    }

    public String getColour() {
        return colour;
    }

    public String getCost() {
        return cost;
    }

    public String getId() {
        return id;
    }

    private String id;
    private String ram;
    private String memory;
    private String OS;
    private String colour;

    public void setCost(String cost) {
        this.cost = cost;
    }

    private String cost;

    public Laptop(String id, String OS,String memory,String ram,String colour,String cost){
        this.id = id;
        this.OS = OS;
        this.memory = memory;
        this.ram = ram;
        this.colour = colour;
        this.cost = cost;

    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s",id,OS,memory,ram,colour,cost);
    }
}
