public class Journal extends Literature{

    // tut netu avtora
    // pe4atnoe izdanie

    String publisher;



    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "pe4atnoeIzdanie='" + publisher + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Journal(String name, String publisher, Double price) {
        this.name = name;
        this.publisher = publisher;
        this.price = price;

    }

}
