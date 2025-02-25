import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Library {

    List<Book> books = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book.getISBN());
    }

    public void removeBook(String ISBN){
        System.out.print("Enter the ISBN for the book to be removed: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase(ISBN)){
            books.remove(ISBN);
        }
    }

    public void displayBooks(){
        for (Book book : books){
            //books.displayBook() //why would this not work?
            System.out.println(book);
        }
    }
}
