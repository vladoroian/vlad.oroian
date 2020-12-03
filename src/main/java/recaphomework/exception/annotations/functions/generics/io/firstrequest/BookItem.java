package recaphomework.exception.annotations.functions.generics.io.firstrequest;

public class BookItem extends Item {

    private String genre;


    public BookItem(String name, String description, double price, String genre) {
        super(name, description, price);
        this.genre = genre;
    }
}
