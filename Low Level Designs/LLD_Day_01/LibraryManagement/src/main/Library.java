package main;

import items.LibraryItem;

public class Library {
    private LibraryItem[] items;

    public double calcualteTotalValue(){
        double totalValue = 0;

        for(LibraryItem item : items){
            totalValue += item.getValue();
        }
        return totalValue;
    }
}

//LibraryItem can be any now : Book, CD, DVD
//This is Liskov's substitution principal