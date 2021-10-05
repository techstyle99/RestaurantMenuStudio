package restaurant;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MenuItems pizza = new MenuItems(4.99, "Tomato pie", "Main course", true);
        MenuItems fries = new MenuItems(2.99, "Crispy", "Appetizer", true);

        ArrayList<MenuItems> menuItems = new ArrayList<>();
        Menu restaurantMenu = new Menu(menuItems);

        restaurantMenu.add(pizza);
        restaurantMenu.add(fries);

        restaurantMenu.printMenu();

        System.out.println("*****");
        restaurantMenu.remove(fries);
        restaurantMenu.printMenu();

        System.out.println("*****");
        restaurantMenu.add(fries);
        restaurantMenu.add(fries);
        restaurantMenu.printMenu();

    }
}
