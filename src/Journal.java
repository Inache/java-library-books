public class Journal {

    // tut netu avtora
    // pe4atnoe izdanie
    String name;
    String publisher;



    @Override
    public String toString() {
        return "Journal{" +
                "pe4atnoeIzdanie='" + publisher + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Journal(String name, String publisher) {
        this.name = name;
        this.publisher = publisher;

    }

}
