// day 35 Tasks- Item Task
import java.util.ArrayList;
import java.util.Arrays;
public class Item {
    private String name;
    private double unitPrice;
    private int quantity;
    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!isNameProper(name)) return;
        this.name = name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) return;
        this.unitPrice = unitPrice;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity < 0 || "Toilet Paper".equalsIgnoreCase(getName()) && quantity > 1) return;
        this.quantity = quantity;
    }
    public boolean isNameProper(String name) {
        String name3 = name.replaceAll(" ", "");
        ArrayList<String> name2 = new ArrayList<>(Arrays.asList(name3.split("")));
        name2.removeIf(p -> (Character.isLetterOrDigit(p.charAt(0))));
        return !(name.isBlank() || name.isEmpty() || !name2.isEmpty() || !Character.isLetter(name.charAt(0)));
    }
    public double calcCost() {
        return unitPrice * quantity;
    }
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}
class Objects2 {
    public static void main(String[] args) {
        Item pencil = new Item("pencil", 5, 3);
        Item phone = new Item("phone", 2000, 2);
        Item toiletPaperInvalid = new Item("toilet paper", 30, 3);
        Item toiletPaperValid = new Item("toilet paper", 30, 1);
        Item invalid = new Item("12Penci", 78, 5);
        Item invalid2 = new Item("book@", 22, 12);
        System.out.println(pencil);
        System.out.println(phone);
        System.out.println(toiletPaperInvalid);
        System.out.println(toiletPaperValid);
        System.out.println(invalid);
        System.out.println(invalid2);
    }
}
