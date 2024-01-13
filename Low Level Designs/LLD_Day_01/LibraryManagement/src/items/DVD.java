package items;

public class DVD implements LibraryItem{

    private String title;
    private String uniqueId;
    private String artist;
    private double value;

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
        //Assuming late fees per day is 30 rupees
        return days * 30;
    }

    @Override
    public double getValue() {
        return this.value;
    }
}
