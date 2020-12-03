package recaphomework.exception.annotations.functions.generics.io.firstrequest;


import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Item implements iCatalog, Serializable {

    private String name;
    private String description;
    private double price;
    List<Item> itemList = new ArrayList<>();

    public Item(String name, String description, double price) {

        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Item() {
    }

    /**
     * {@inheritdoc}
     */
    @Override
    public void createItem(String name, String description, double price) {
        Item item = new Item(name, description, price);
        itemList.add(item);
    }

    /**
     * {@inheritdoc}
     */
    @Override
    public void createSportItem(String name, String description, double price, String sportType) {

    }

    /**
     * {@inheritdoc}
     */
    @Override
    public void read() {
        for (Item item : itemList) {

            System.out.println(item);
        }
    }

    /**
     * {@inheritdoc}
     */
    @Override
    public void delete(int index) {
        itemList.remove(index);
    }

    @Deprecated
    public void printMe() {

        System.out.println("This is my deprecated method");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
