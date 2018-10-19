public class Book {
    String bookName;
    Author author;
    Double price;
    Integer pages;

    public Book(String bookName, Author author, Double price, Integer pages) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", pages=" + pages +
                '}';
    }
}
