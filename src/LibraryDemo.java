import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class LibraryDemo {
    ArrayList<Book> books;
    ArrayList<Journal> journals;
    public LibraryDemo(ArrayList<Book> books, ArrayList<Journal> journals){
        this.books = addAllBooks(books);
        this.journals = addAllJournals(journals);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Journal> getJournals() {
        return journals;
    }

    public ArrayList<Journal> addAllJournals(ArrayList<Journal> journals) {
        journals.add(new Journal("XAKEP","Gameland",8.40));
        journals.add(new Journal("Cosmopolitan","Hearst Corporation", 12.00));
        journals.add(new Journal("National Geographic","National geographic socciety", 11.00));
        journals.add(new Journal("Vogue","Conde Nast", 13.60));
        journals.add(new Journal("Glamour","Conde Nast", 12.70));
        journals.add(new Journal("People","Time, Inc", 8.40));
        journals.add(new Journal("Scientific American","Holtzbrinck", 7.35));
        return journals;

    }

    public ArrayList<Book> addAllBooks(ArrayList<Book> books){
        books.add(new Book("Voina i mir",new Author("Lev","Tolstoy"),30.00,630));
        books.add(new Book("Anna Karenina",new Author("Lev","Tolstoy"),25.00,850));
        books.add(new Book("Tri smerti",new Author("Lev","Tolstoy"),15.00,650));
        books.add(new Book("Taras bulba",new Author("Nikolai","Gogol"),14.00,100));
        books.add(new Book("Viy",new Author("Nikolai","Gogol"),20.00,65));
        books.add(new Book("Mertvie dushi",new Author("Nikolai","Gogol"),19.00,352));
        books.add(new Book("Prestuplenie i nakazanie",new Author("Fedor","Dostoevsky"),13.20,273));
        books.add(new Book("Idiot",new Author("Fedor","Dostoevsky"),12.20,470));
        books.add(new Book("Besi",new Author("Fedor","Dostoevsky"),15.00,302));
        books.add(new Book("Zapiski ohotnika",new Author("Ivan","Turgenev"),11.00,250));
        books.add(new Book("Ispoved huligana",new Author("Sergei","Esenin"),6.70,370));
        books.add(new Book("Fight club",new Author("Chuck","Palahniuk"),22.00,340));
        books.add(new Book("Invisible monsters",new Author("Chuck","Palahniuk"),14.30,340));
        books.add(new Book("Snuff",new Author("Chuck","Palahniuk"),8.50, 190));
        books.add(new Book("Haunted",new Author("Chuck","Palahniuk"),9.90,232));
        books.add(new Book("Trainspotting",new Author("Irvine","Welsh"),21.20,390));
        books.add(new Book("Filth",new Author("Irvine","Welsh"),16.40,280));
        books.add(new Book("Glue",new Author("Irvine","Welsh"),14.50,367));
        books.add(new Book("Porno",new Author("Irvine","Welsh"),12.10,198));
        books.add(new Book("Notes of a Dirty Old Man",new Author("Charles","Bukowski"),14.50,322));
        books.add(new Book("Erections, Ejaculations, Exhibitions, and General Tales of Ordinary Madness",new Author("Charles","Bukowski"),21.00,251));
        books.add(new Book("Filth",new Author("Charles","Bukowski"),12.00,1800));
        books.add(new Book("Pulp",new Author("Charles","Bukowski"),19.00,200));
        return books;
    }

    @Override
    public String toString() {
        return "LibraryDemo{" +
                "books=" + books +
                ", journals=" + journals +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryDemo that = (LibraryDemo) o;
        return Objects.equals(books, that.books) &&
                Objects.equals(journals, that.journals);
    }

    @Override
    public int hashCode() {

        return Objects.hash(books, journals);
    }
}
