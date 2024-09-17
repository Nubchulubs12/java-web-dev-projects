package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;


public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
private LocalDate lastUpdated;


public ArrayList<MenuItem> getMenuItems() {
    return menuItems;
}


@Override
    public String toString() {
    StringBuilder appetizers = new StringBuilder();
    for (MenuItem item : menuItems) {
        if (item.getCategory().equals("appetizer")) {
            appetizers.append("\n").append(item.toString()).append("\n");
        }
    }
    StringBuilder mainCourse = new StringBuilder();
    for (MenuItem item : menuItems) {
        if (item.getCategory().equals("main course")) {
            mainCourse.append("\n").append(item.toString()).append("\n");
        }
    }
    StringBuilder dessert = new StringBuilder();
    for (MenuItem item : menuItems) {
        if (item.getCategory().equals("dessert")) {
            dessert.append("\n").append(item.toString()).append("\n");
        }
    }
    return "\nPanda Hut Menu\n" + "\n" +
            "Appetizers" + appetizers.toString() + "\n" +
            "Main Course" + mainCourse.toString() + "\n" +
            "Desserts" + dessert.toString() + "\n";
}

void  addItem(MenuItem newitem) {
    String message = "That item is already on the menu.";
    if (menuItems.contains(newitem)) {
        System.out.println(message);
        return;
    }
    for (MenuItem item : menuItems) {
        if (item.equals(newitem)) {
            System.out.println(message);
            return;
        }

    }

    menuItems.add(newitem);
    lastUpdated= LocalDate.now();
}
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }

}


