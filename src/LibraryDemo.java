import java.util.ArrayList;
import java.util.Scanner;

public class LibraryDemo {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Journal> journals = new ArrayList<>();
        Library library = new Library(books,journals);
        System.out.println(library);
        searchForBookByBookName(books);
        //library.addAllBooks(books);
       // System.out.println(books);

    }
    public static void searchForBookByBookName(ArrayList<Book> books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bookname: ");
        String input = scanner.nextLine();

        for (int i = 0; i < books.size();i++){
            if (input.equals(books.get(i).bookName)){
                System.out.println(books.get(i));
            }
        }
    }
}
