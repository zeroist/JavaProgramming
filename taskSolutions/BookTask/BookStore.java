package BookTask;
public class BookStore {
    public static void main(String[] args) {
        AudioBook killBill=new AudioBook("Kill Bill","crime","Unknown",30,45,"someone else");
        System.out.println(killBill);
        Ebook ebook=new Ebook("The king of the ring","fantastic","someone",89,"long",800);
        System.out.println(ebook);
    }


}
