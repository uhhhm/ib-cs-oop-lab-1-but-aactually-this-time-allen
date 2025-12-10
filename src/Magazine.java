public class Magazine extends ReadingItem {
    private String coverStoryTitle;
    private String printDate;

    public Magazine(String name, String location, int price, String description, int wordCount, String datePublished, String author, String coverStoryTitle, String printDate) {
        super(name, location, price, description, wordCount, datePublished, author);
        this.coverStoryTitle = coverStoryTitle;
        this.printDate = printDate;
    }

    @Override
    public String toString() {
        return "Magazine: " + coverStoryTitle + ", " + super.toString();
    }
}