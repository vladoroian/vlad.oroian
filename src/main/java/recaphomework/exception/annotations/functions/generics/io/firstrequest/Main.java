package recaphomework.exception.annotations.functions.generics.io.firstrequest;

import java.io.*;
import java.util.List;

public class Main {

    public static void main  (String... args) {

        iCatalog iCatalog = new SportItem() ;
        iCatalog.createSportItem("Shoes", "Football shoes", 300, SportType.FOT.getName());
        iCatalog.read();
        iCatalog.delete(0);
        iCatalog.read();


        Reader reader = null;
        try {

            reader = new FileReader("items.csv");

            ItemsCSVParser itemsCSVParser = new ItemsCSVParser();

            List<SportItem> sportItemList = itemsCSVParser.readFromFile(reader);

            System.out.println(sportItemList.size());

            for (SportItem sportItem : sportItemList) {

                    System.out.println(sportItem);
            }

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.obj"));
            objectOutputStream.writeObject(sportItemList);
            objectOutputStream.flush();
            objectOutputStream.close();

            System.out.println(" ");
            System.out.println("Deserialized");
            System.out.println(" ");

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test.obj"));
            Object objectValue = objectInputStream.readObject();
            List<SportItem> sportItemDeserialized = (List<SportItem> ) objectValue;
            for (SportItem sportItem : sportItemDeserialized) {

                System.out.println(sportItem);
            }
            objectInputStream.close();


        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}


}
