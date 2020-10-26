package librarycatalogmodel;

//Inheritance
public class Album extends Book {
    private String paperQuality;

    public void setPaperQuality (String newPaperQuality) {paperQuality = newPaperQuality;}
    public String getPaperQuality () {return paperQuality;}

    public Album () {}

    public Album (String newName, int newNoOfPages, String newPaperQuality){
        setName(newName);
        setNoOfPages(newNoOfPages);
        paperQuality = newPaperQuality;
    }

    public String toString () {

        return "Name of book is " + getName() + " no. of pages= " + getNoOfPages() + " and paper quality is " + paperQuality;
    }

}
