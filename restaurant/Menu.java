package restaurant;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItems> items;

    public Menu(ArrayList<MenuItems> items){
        this.items = items;
        this.lastUpdated = new Date();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItems> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItems> items) {
        this.items = items;
    }

    public void add(MenuItems itemToAdd){
        for (MenuItems item: items){
            if (item.equals(itemToAdd)){
                System.out.println("Can't add duplicate items to menu");
                return;
            }

        }
        items.add(itemToAdd);
        Date today = new Date();
        this.setLastUpdated(today);
    }

    public void remove(MenuItems item) {
        int indexToRemove = this.items.indexOf(item);
        this.items.remove(indexToRemove);
        Date today = new Date();
        this.setLastUpdated(today);
    }

    public void printMenu() {
        for (MenuItems item: items) {
            System.out.println(item.getDescription() + " " + item.getPrice());
        }
    }

    public void printItem(MenuItem item) {
        int indexToPrint = this.items.indexOf(item);
        MenuItems itemToPrint = this.items.get(indexToPrint);
        System.out.println(itemToPrint.getDescription() + " " + itemToPrint.getPrice());
    }
}
