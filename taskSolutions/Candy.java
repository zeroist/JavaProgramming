//Candies
import java.util.ArrayList;
import java.util.Arrays;
public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;
    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity <= 0) return;
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) return;
        this.price = price;
    }
    public boolean isHasPeanuts() {
        return hasPeanuts;
    }
    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }
    public String toString() {
        return "Candies{" +
                "brand='" + getBrand() + '\'' +
                ", quantity=" + quantity +
                ", price=" + (price == 0 ? "Free" : "$" + price) +
                ", hasPeanuts=" + (hasPeanuts ? brand + " inculudes peanuts" : "Sorry no nuts") +
                '}';}}
class CandyFactory {
    public static void main(String[] args) {
        ArrayList<Candy> candiesList = new ArrayList<>();
        Candy candy1 = new Candy("Bubble Gum", 3, 50, true);
        Candy candy2 = new Candy("Candy Corn", 13, 20, false);
        Candy candy3 = new Candy("Candy Props", 10, 25, false);
        Candy candy4 = new Candy("Cotton Candy", 50, 5, false);
        Candy candy5 = new Candy("Kosher Candy", 200, 0, true);
        candiesList.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));
        for (Candy candy : candiesList) {
            System.out.println(candy.getBrand()+ ":"+ (candy.getPrice()==0?"Free":"$"+candy.getPrice()) );
        }}}