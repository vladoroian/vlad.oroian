package recaphomework.exception.annotations.functions.generics.io.firstrequest;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class SportItem extends Item {

    private String sportType;

    public SportItem(String name, String description, double price, String sportType) {

        super(name, description, price);
        this.sportType = sportType;

    }

    public SportItem (){}

    /**
     * {@inheritdoc}
     */
    @Override
    public  void createSportItem(String name, String description, double price, String sportType) {

        SportItem sportItem = new SportItem(name, description , price, sportType);
        itemList.add(sportItem);
    }

    public String toString () {

        return "name=" + getName() + ", description=" + getDescription() + ", price=" + getPrice() + ", sporType=" + sportType;
    }
}
