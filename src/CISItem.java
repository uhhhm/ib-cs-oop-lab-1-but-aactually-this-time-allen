public class CISItem {
    private String name;
    private String location;
    private int price;
    private String description;

    public CISItem(String name, String location, int price, String description) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.description = description;
    }

    // Getters and Setters needed for updates
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return name + " located at " + location;
    }
}