package stepanPackage.practice1;
import java.lang.*;

public class Libre {
    int pageQuantity;
    String name;
    String Author;

    public Libre(int pageNumber, String bookName, String bookAuthor) {
        this.pageQuantity = pageNumber;
        this.name = bookName;
        this.Author = bookAuthor;
    }

    public Libre(int pageNumber, String bookName) {
        this.pageQuantity = pageNumber;
        this.name = bookName;
        this.Author = "Unknown";
    }

    public Libre(int pageNumber) {
        this.pageQuantity = pageNumber;
        this.name = "Unnamed";
        this.Author = "Unknown";
    }

    public void setPageQuantity(int pageQuantity) {
        this.pageQuantity = pageQuantity;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String ToString(){
        return "Book's name is "+this.name+", Author is "+this.Author+", number of pages "+this.pageQuantity;
    }
}
