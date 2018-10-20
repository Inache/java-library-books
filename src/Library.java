import java.util.ArrayList;
import java.util.Scanner;


public class Library {
    private static LibraryDemo libraryDemo;
    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "Library{" +
                "libraryDemo=" + libraryDemo +
                '}';
    }

    public Library(LibraryDemo libraryDemo) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Journal> journals = new ArrayList<>();

    }

    public void findBooksByTheAuthorsSurname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter authors surname: ");
        String input = scanner.nextLine();
        for (int i = 0; i < libraryDemo.books.size(); i++) {
            if (input.equals(libraryDemo.books.get(i).author.getSurname())) {
                System.out.println(libraryDemo.books.get(i));
            }
        }
    }

    public void findBooksByTheTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title of the name: ");
        String input = scanner.nextLine();
        for (int i = 0; i < libraryDemo.books.size(); i++) {
            if (input.equals(libraryDemo.books.get(i).author.getName())) {
                System.out.println(libraryDemo.books.get(i));
            }
        }
    }

    public void findJournalByPublisher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter publishers name: ");
        String input = scanner.nextLine();
        for (int i = 0; i < libraryDemo.journals.size(); i++) {
            if (input.equals(libraryDemo.journals.get(i).getPublisher())) {
                System.out.println(libraryDemo.books.get(i));
            }
        }
    }

    public void findJournalByTitle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter title of the journal: ");
        String input = scanner.nextLine();
        for (int i = 0; i < libraryDemo.journals.size(); i++) {
            if (input.equals(libraryDemo.journals.get(i).getName())) {
                System.out.println(libraryDemo.journals.get(i));
            }
        }
    }

    public void printWholeLibrary() {
        System.out.println(libraryDemo);
    }

    public void searchForBooksInPriceRange() {
        Integer min;
        Integer max;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter min price (from): ");
        min = scanner.nextInt();
        System.out.println("Enter max price (to): ");
        max = scanner.nextInt();
        for (int i = 0; i < libraryDemo.books.size(); i++) {
            if (libraryDemo.books.get(i).price > min && libraryDemo.books.get(i).price < max) {
                System.out.println(libraryDemo.books.get(i));
            }
        }
    }

    public static void startLibraryWork() {
        System.out.println("What u want to do? \nEnter a number of action: \n" +
                "1. Find books by the authors surname.\n" +
                "2. Find books by its title.\n" +
                "3. Find journal by its publisher.\n" +
                "4. Find journal by its title.\n" +
                "5. Show all books that are stored in library.\n" +
                "6. Show books in price range (from - to): ");

        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Journal> journals = new ArrayList<>();
        libraryDemo = new LibraryDemo(books, journals);
        Library library = new Library(libraryDemo);
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        switch (input) {
            case 1:
                library.findBooksByTheAuthorsSurname();
                break;
            case 2:
                library.findBooksByTheTitle();
                break;
            case 3:
                library.findJournalByPublisher();
                break;
            case 4:
                library.findJournalByTitle();
                break;
            case 5:
                library.printWholeLibrary();
                break;
            case 6:
                library.searchForBooksInPriceRange();
                break;
            default:
                System.out.println("Something went wrong");
                break;

        }
    }


    public static void main(String[] args) {
        startLibraryWork();


    }


}
