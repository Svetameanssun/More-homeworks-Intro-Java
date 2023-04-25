public class Laptop {
    private final String brand;
    private int ram;
    private String typeDrive;
    private int HDD;
    private final String color;
    private String operationSystem;
    private final int sizeDisplay;

    public Laptop(String brand, int ram,
                    int sizeDisplay, int HDD, String typeDrive,
                    String operationSystem, String color) {
        this.brand = brand;
        this.ram = ram;
        this.typeDrive = typeDrive;
        this.HDD = HDD;
        this.color = color;
        this.operationSystem = operationSystem;
        this.sizeDisplay = sizeDisplay;
    }

    public Laptop(String brand, int ram, int sizeDisplay) {
        this(brand, ram,
                sizeDisplay, 512, "SDD",
                "Windows 10", "White");
    }

    @Override
    public String toString() {
        return  String.format("Laptop  { brand = %-8s ram = %-5d\ttypeDrive = %s\tHDD = %d\tcolor = %s\toperationSystem = %-10sizeDisplay = %d}",brand, ram, typeDrive, HDD, color, operationSystem, sizeDisplay);

    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getSizeDisplay() {
        return sizeDisplay;
    }

    public int getValueHDD() {
        return HDD;
    }

    public String getTypeDrive() {
        return typeDrive;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public String getColor() {
        return color;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setValueHDD(int valueHDD) {
        this.HDD = HDD;
    }

    public void setTypeDrive(String typeDrive) {
        this.typeDrive = typeDrive;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }


}