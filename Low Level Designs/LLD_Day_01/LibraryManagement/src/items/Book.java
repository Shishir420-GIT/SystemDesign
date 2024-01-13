package items;

public class Book implements LibraryItem{
    private String title;
    private String uniqueId;
    private String author;
    private double value;

    public Book(String title, String uniqueId, String author, double value) {
        this.title = title;
        this.uniqueId = uniqueId;
        this.author = author;
        this.value = value;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public double calculateLateFee(int days) {
        //Assuming fine is 10 rupees per day
        return days * 10;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
