package librarycatalogmodel;

public class Book {
    //Encapsulation
    private  String name;
    private int noOfPages;

    public  void setName (String newName){ name = newName;}
    public String getName () { return name;}
    public void setNoOfPages (int newNoofPages) { noOfPages = newNoofPages;}
    public int getNoOfPages () {return noOfPages;}

    public Book () {}

    public Book (String newName, int newNoOfPages) {
        name = newName;
        noOfPages = newNoOfPages;
    }

    public String toString () {
        return "Name of book is " + name + " and no. of pages= " + noOfPages;
    }

}
