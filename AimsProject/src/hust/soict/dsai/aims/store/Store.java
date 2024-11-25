package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int numberOfDVDs;  
    
    public Store(int capacity) {
        itemsInStore = new DigitalVideoDisc[capacity];
        numberOfDVDs = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (numberOfDVDs < itemsInStore.length) {
            itemsInStore[numberOfDVDs] = dvd;
            numberOfDVDs++;
            System.out.println("Added DVD: " + dvd.getTitle());
        } else {
            System.out.println("Store is full. Cannot add DVD.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < numberOfDVDs; i++) {
            if (itemsInStore[i].getId() == dvd.getId()) {
                for (int j = i; j < numberOfDVDs - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[numberOfDVDs - 1] = null;
                numberOfDVDs--;
                found = true;
                System.out.println("Removed DVD: " + dvd.getTitle());
                break;
            }
        }
        if (!found) {
            System.out.println("Cannot found DVD");
        }
    }
    
    public void print() {
        System.out.println("List DVD in store: ");
        for (int i = 0; i < numberOfDVDs; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
    }
}