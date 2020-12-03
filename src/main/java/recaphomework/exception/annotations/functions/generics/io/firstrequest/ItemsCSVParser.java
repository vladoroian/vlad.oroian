package recaphomework.exception.annotations.functions.generics.io.firstrequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class ItemsCSVParser {

    public List<SportItem> readFromFile (Reader reader) throws IOException {

        List<SportItem> sportItemList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();
        while (line != null) {

            String [] tokens = line.split(",");
            SportItem sportItem = new SportItem(tokens[0], tokens [1], Double.parseDouble(tokens[2]), tokens [3]);
            sportItemList.add (sportItem);

            line = bufferedReader.readLine();

        }

        return sportItemList;
    }

}
