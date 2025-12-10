public class Arduino extends ElectronicItem {
    private String version;

    public Arduino(String name, String location, int price, String description, int storageCapacity, String model, String maker, String operatingSystem, String version) {
        super(name, location, price, description, storageCapacity, model, maker, operatingSystem);
        this.version = version;
    }

    @Override
    public String toString() {
        return "Arduino: " + version + ", " + super.toString();
    }
}