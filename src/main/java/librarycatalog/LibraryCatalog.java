package librarycatalog;

import librarycatalogmodel.Album;
import librarycatalogmodel.Book;
import librarycatalogmodel.Novel;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    static ArrayList<Book> books; //= new ArrayList<Book>();

    public LibraryCatalog () {
        books = new ArrayList<Book>();
    }

    public static void addBooks (Book book) {
        books.add(book);
    }

    public static void listBooks () {
        //Polymorphism
        for(Book b : books) {
            System.out.println(b.toString());
        }
    }

    public static void deleteBooks (Book book) {
        books.remove(book);
    }


    public static void main (String [] Arg) {
        //Abstraction
        LibraryCatalog libraryCatalog = new LibraryCatalog();
        Book bookOne = new Book ("Cartea a", 100);
        Book bookTwo = new Book ("Cartea b", 200);
        Book bookThree = new Book ("Cartea c", 300);
        Album albumOne = new Album ("Album 1", 10, "High");
        Album albumTwo = new Album ("Album 2", 20, "Low");
        Novel novelOne = new Novel("Novel 1", 500, "Horror");
        libraryCatalog.addBooks(bookOne);
        libraryCatalog.addBooks(bookTwo);
        libraryCatalog.addBooks(bookThree);
        libraryCatalog.addBooks(albumOne);
        libraryCatalog.addBooks(novelOne);
        libraryCatalog.addBooks(albumTwo);
        libraryCatalog.listBooks();
        System.out.println ("------------------------------");
        libraryCatalog.deleteBooks(bookTwo);
        libraryCatalog.deleteBooks(albumTwo);
        libraryCatalog.listBooks();
    }

}
