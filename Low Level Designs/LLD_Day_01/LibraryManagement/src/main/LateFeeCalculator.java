package main;

public class LateFeeCalculator {
    /**
     * Logic to calculate the late Fees
     */

    public double calculateTotalLateFees( LateFeeCalc[] items, int days){
        double totalLateFees = 0;

        if(items.length == 0){
            System.out.println("Zero number of books found.");
            return 0;
        }

        for(LateFeeCalc item : items){
            totalLateFees += item.calculateLateFee(days);
        }
        return totalLateFees;
    }
}
