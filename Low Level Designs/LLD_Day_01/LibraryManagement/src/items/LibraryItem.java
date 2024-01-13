package items;

//Single Responsibility Principal (SRP)
//Since it is only containing the data about Item

//Open and close principal
//Open for enhacement/extension, closed for modification

import main.LateFeeCalc;

public interface LibraryItem extends LateFeeCalc {
    String getTitle();
    String getUniqueId();
    double getValue();
}

