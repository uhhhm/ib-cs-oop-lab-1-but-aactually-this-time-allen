import java.util.ArrayList;
public class Store {

    // TODO 4: Create an ArrayList of CISItem called cisItems
    private ArrayList<CISItem> cisItems;

    public Store() {
        cisItems = new ArrayList<>();
    }

    // TODO 5: Create a method addBook
    public void addBook(Book book) {
        cisItems.add(book);
    }

    // TODO 7: Create a method addPhone
    public void addPhone(Phone phone) {
        cisItems.add(phone);
    }

    public void addMagazine(Magazine magazine) {
        cisItems.add(magazine);
    }

    public void addArduino(Arduino arduino) {
        cisItems.add(arduino);
    }

    // TODO 9: updatePhonesLocation()
    public void updatePhonesLocation(String location) {
        for (CISItem item : cisItems) {
            if (item instanceof Phone) {
                item.setLocation(location);
            }
        }
    }

    // TODO 10: getAllPhones()
    public ArrayList<Phone> getAllPhones() {
        ArrayList<Phone> phones = new ArrayList<>();
        for (CISItem item : cisItems) {
            if (item instanceof Phone) {
                phones.add((Phone) item);
            }
        }
        return phones;
    }

    // TODO 12: getItems(String itemType)
    public ArrayList<CISItem> getItems(String itemType) {
        ArrayList<CISItem> result = new ArrayList<>();
        for (CISItem item : cisItems) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(itemType)) {
                result.add(item);
            }
        }
        return result;
    }

    // TODO 14: updateItems(String itemType, String property, String value)
    public void updateItems(String itemType, String property, String value) {
        for (CISItem item : cisItems) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(itemType)) {

                if (property.equalsIgnoreCase("location")) {
                    item.setLocation(value);
                } else if (property.equalsIgnoreCase("name")) {
                    item.setName(value);
                } else if (property.equalsIgnoreCase("description")) {
                    item.setDescription(value);
                }
            }
        }
    }

    // TODO 16: showAllInfo()
    public void showAllInfo() {
        System.out.println("--- Store Inventory ---");
        for (CISItem item : cisItems) {
            System.out.println(item.toString());
        }
        System.out.println("-----------------------");
    }
}