public class ElectronicItem extends CISItem {
    private int storageCapacity;
    private String model;
    private String maker;
    private String operatingSystem;

    public ElectronicItem(String name, String location, int price, String description, int storageCapacity, String model, String maker, String operatingSystem) {
        super(name, location, price, description);
        this.storageCapacity = storageCapacity;
        this.model = model;
        this.maker = maker;
        this.operatingSystem = operatingSystem;
    }
}