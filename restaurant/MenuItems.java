package restaurant;

import java.util.Objects;

public class MenuItems {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItems(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    // getter and setter

    public void setPrice(double price) {this.price = price;}

    public double getPrice() {return price;}

    public void setDescription(String description) {this.description = description;}

    public String getDescription() {return description;}

    public void setCategory(String category) {this.category = category;}

    public String getCategory() {return category;}

    public void setNew(boolean isNew) {this.isNew = isNew;}

    public boolean isNew() {return isNew;}

    public String isItemNew() {
        if (this.isNew){
            return "This is a new item";
        } else {
            return "This is not a new item";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItems menuItems = (MenuItems) o;
        return Double.compare(menuItems.price, price) == 0 && isNew == menuItems.isNew && description.equals(menuItems.description) && category.equals(menuItems.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, isNew);
    }
}


