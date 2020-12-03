package recaphomework.exception.annotations.functions.generics.io.firstrequest;

public interface iCatalog {

    /**
     * This method will add an item to a list of items;
     * @param name -> name of the item
     * @param description -> description of the item
     * @param price -> price of the item
     */
    void createItem (String name, String description, double price);

    /**
     * This method will add an item to a list of items;
     * @param name -> name of the item
     * @param description -> description of the item
     * @param price -> price of the item
     * @param sportType  -> define the type of item;
     */
    void createSportItem (String name, String description, double price, String sportType);

    /**
     * This method will list all the items from a list of items;
     */
    void read ();

    /**
     * This method will delete an item from a list of items based on index;
     * @param index -> the index of the item that needs to be deleted;
     */
    void delete (int index);

}
