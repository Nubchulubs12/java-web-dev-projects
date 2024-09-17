package org.launchcode;


public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Dumplings", "very tasty", 7.00, "main course");
        MenuItem item2 = new MenuItem("Egg Rolls", "yum yum", 5.00, "dessert");
        MenuItem item3 = new MenuItem("General Tso's Chicken", "so good", 10.00, "main course");
        MenuItem item4 = new MenuItem("Drunken Noodles", "so good", 10.00, "main course");
        MenuItem item5 = new MenuItem("Chinese Donuts", "yum yum", 5.00, "dessert");
        MenuItem item6 = new MenuItem("Peanut Butter Rice Cakes", "yum yum", 5.00, "appetizer");





        Menu menu = new Menu();

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);
        menu.addItem(item6);

        System.out.println(menu);










    }
}
