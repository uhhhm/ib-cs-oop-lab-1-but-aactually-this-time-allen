public class Phone extends ElectronicItem {
    private String networkType;
    private int screenSize;

    public Phone(String name, String location, int price, String description, int storageCapacity, String model, String maker, String operatingSystem, String networkType, int screenSize) {
        super(name, location, price, description, storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone: " + getName() + " (" + networkType + "), " + super.toString();
    }
}