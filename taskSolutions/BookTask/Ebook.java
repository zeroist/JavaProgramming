package BookTask;
public class Ebook extends Book {
        public String size;
        public int pages;
    public Ebook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }
    public void readBook(String reader){
        System.out.println(reader+" is reading "+title+". pages are : "+ pages);
    }

    public String toString() {
        return "Ebook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
