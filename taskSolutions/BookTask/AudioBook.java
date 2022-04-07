package BookTask;
public class AudioBook extends Book {
    public double length;
    public String narrator;
    public AudioBook(String title, String type, String author, double price, double length, String narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }
    public void listen(String name){
        System.out.println(name+" is listening "+narrator);
    }
    public String toString() {
        return "Ebook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
