import java.util.ArrayList;
public class StoreTester {

    // Helper method to mimic JUnit assertions
    public static void assertTrue(boolean condition, String testName) {
        if (condition) {
            System.out.println("PASS: " + testName);
        } else {
            System.out.println("FAIL: " + testName);
        }
    }

    // Helper method to mimic JUnit assertEquals
    public static void assertEquals(String actual, String expected, String testName) {
        if (actual.equals(expected)) {
            System.out.println("PASS: " + testName);
        } else {
            System.out.println("FAIL: " + testName + " [Expected: " + expected + ", Got: " + actual + "]");
        }
    }

    public static void main(String[] args) {

        // ==========================================
        // TODO 6: Test for addBook
        // ==========================================
        System.out.println("\n--- TODO 6: addBook Test ---");
        Store store1 = new Store(); // 0. Create instance
        Book b1 = new Book("Harry Potter", "Shelf A", 20, "Wizard book", 50000, "1997", "JK Rowling", "12345", "1st", "Harry Potter 1"); // 1. Create Book
        store1.addBook(b1); // 2. Add book
        assertTrue(true, "Program did not crash adding a book"); // 3. Assert

        // ==========================================
        // TODO 8: Test for addBook AND addPhone
        // ==========================================
        System.out.println("\n--- TODO 8: addPhone Test ---");
        Store store2 = new Store();
        Book b2 = new Book("The Hobbit", "Shelf B", 15, "Fantasy", 30000, "1937", "Tolkien", "67890", "2nd", "The Hobbit");
        Phone p1 = new Phone("iPhone X", "Cabinet 1", 999, "Apple Phone", 64, "X", "Apple", "iOS", "5G", 6);

        store2.addBook(b2);
        store2.addPhone(p1);

        assertTrue(true, "Program did not crash adding book and phone");

        // ==========================================
        // TODO 11: Test for updatePhonesLocation and getAllPhones
        // ==========================================
        System.out.println("\n--- TODO 11: Location Update Test ---");
        Store store3 = new Store();
        store3.addPhone(new Phone("Pixel 5", "Warehouse", 600, "Google Phone", 128, "5", "Google", "Android", "5G", 6));
        store3.addPhone(new Phone("Galaxy S21", "Warehouse", 800, "Samsung Phone", 256, "S21", "Samsung", "Android", "5G", 7));
        // Add a book to make sure it DOESN'T get moved
        store3.addBook(new Book("Java 101", "Warehouse", 50, "Textbook", 500, "2023", "Teacher", "111", "1st", "Java Basics"));

        store3.updatePhonesLocation("Room 512"); // 2. Update all phones
        ArrayList<Phone> allPhones = store3.getAllPhones(); // 3. Get all phones

        // 4 & 5 Check assertions
        boolean allMoved = true;
        for (Phone p : allPhones) {
            if (!p.getLocation().equals("Room 512")) {
                allMoved = false;
            }
        }
        assertTrue(allMoved, "All phones moved to Room 512");

        // Verify the book didn't move (Manual check logic)
        ArrayList<CISItem> books = store3.getItems("Book");
        if(books.get(0).getLocation().equals("Warehouse")) {
            System.out.println("PASS: Non-phones remained in original location.");
        } else {
            System.out.println("FAIL: Non-phones were moved incorrectly.");
        }

        // ==========================================
        // TODO 13: Test for getItems()
        // ==========================================
        System.out.println("\n--- TODO 13: getItems Test ---");
        Store store4 = new Store();
        store4.addBook(b1);
        store4.addBook(b2);
        store4.addPhone(p1);

        ArrayList<CISItem> onlyBooks = store4.getItems("Book");
        ArrayList<CISItem> onlyPhones = store4.getItems("Phone");

        assertTrue(onlyBooks.size() == 2, "Found 2 Books");
        assertTrue(onlyPhones.size() == 1, "Found 1 Phone");

        // ==========================================
        // TODO 15: Test for updateItems()
        // ==========================================
        System.out.println("\n--- TODO 15: updateItems Test ---");
        Store store5 = new Store();
        store5.addPhone(new Phone("iPhone 13", "Room 1", 1000, "New", 128, "13", "Apple", "iOS", "5G", 6));
        store5.addPhone(new Phone("iPhone 14", "Room 1", 1100, "Newer", 128, "14", "Apple", "iOS", "5G", 6));

        // Move all phones to Room 511
        store5.updateItems("phone", "location", "Room 511");

        ArrayList<CISItem> phonesInRoom511 = store5.getItems("Phone");
        boolean updateSuccess = true;
        for(CISItem item : phonesInRoom511) {
            if(!item.getLocation().equals("Room 511")) updateSuccess = false;
        }
        assertTrue(updateSuccess, "Generic updateItems moved phones to Room 511");

        // ==========================================
        // TODO 16: showAllInfo verification
        // ==========================================
        System.out.println("\n--- TODO 16: Visual Verification ---");
        store5.showAllInfo();
    }
}