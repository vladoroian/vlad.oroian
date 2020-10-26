package librarycatalogmodel;

//Inheritance
public class Novel extends Book {
    private String type;

    public void setType (String newType) {type = newType;}
    public String getType () {return type;}

    public Novel () {}

    public Novel (String newName, int newNoOfPages, String newType){
        setName(newName);
        setNoOfPages(newNoOfPages);
        type = newType;
    }

    public String toString () {

        return "Name of book is " + getName() + " no. of pages= " + getNoOfPages() + " and Novel type is " + type;
    }
}
