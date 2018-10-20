public class Book extends Literature {

    Author author;

    Integer pages;

    public Book(String bookName, Author author, Double price, Integer pages) {
        this.name = bookName;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", pages=" + pages +
                '}';
    }
}
