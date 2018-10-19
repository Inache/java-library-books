import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books;
    ArrayList<Journal> journals;
    Library(ArrayList<Book> books, ArrayList<Journal> journals){
        this.books = addAllBooks(books);
        this.journals = addAllJournals(journals);
    }

    private ArrayList<Journal> addAllJournals(ArrayList<Journal> journals) {
        journals.add(new Journal("XAKEP1","Gameland"));
        journals.add(new Journal("XAKEP2","Gameland"));
        journals.add(new Journal("XAKEP3","Gameland"));
        journals.add(new Journal("XAKEP4","Gameland"));
        journals.add(new Journal("XAKEP5","Gameland"));
        journals.add(new Journal("XAKEP6","Gameland"));
        journals.add(new Journal("XAKEP7","Gameland"));
        return journals;

    }

    private ArrayList<Book> addAllBooks(ArrayList<Book> books){
        books.add(new Book("Voina i mir1",new Author("Lev","tolstoy"),20.00,450));
        books.add(new Book("Voina i mir2",new Author("Lev","tolstoy"),20.00,450));
        books.add(new Book("Voina i mir3",new Author("Lev","tolstoy"),20.00,450));
        books.add(new Book("Voina i mir4",new Author("Lev","tolstoy"),20.00,450));
        books.add(new Book("Voina i mir5",new Author("Lev","tolstoy"),20.00,450));
        books.add(new Book("Voina i mir6",new Author("Lev","tolstoy"),20.00,450));
        books.add(new Book("Voina i mir7",new Author("Lev","tolstoy"),20.00,450));
        return books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                ", journals=" + journals +
                '}';
    }
    public void findBookByName(ArrayList<Book> books){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < books.size(); i++){
            System.out.println(books.get(i));
        }
    }

}
