package com.example.designpatterns._02_structuralpatterns._03_composite.before;

public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item healPotion = new Item("체력 물약", 50);

        Bag bag = new Bag();
        bag.add(doranBlade);
        bag.add(healPotion);

        Client client = new Client();
        client.printItem(doranBlade);
        client.printPrice(bag);
    }

    private void printPrice(Bag bag) {
        int sum = bag.getItems().stream().mapToInt(Item::getPrice).sum();
        System.out.println(sum);
    }

    private void printItem(Item item) {
        System.out.println(item.getPrice());
    }
}
