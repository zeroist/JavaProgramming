public class Carpet {
    private double width, length, unitPrice;
    private boolean isPersian;
    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width<0) return;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if (length<0) return;
        this.length = length;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        if (unitPrice<0) return;
        this.unitPrice = unitPrice;
    }
    public boolean getIsPersian() {
        return isPersian;
    }
    public void setPersian(boolean isPersian) {
        this.isPersian = isPersian;
    }
    public double calcCost(){
        double price=width*length*unitPrice;
        if (isPersian) price+=200;
        return price;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + calcCost() +
                '}';
    }
}
class Objects{
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(10,20,30,true);
        Carpet carpet2=new Carpet(5,15,25,false);
        System.out.println(carpet1);
        System.out.println(carpet2);
        carpet1.setWidth(-200);
        carpet2.setPersian(true);
        System.out.println(carpet1);
        System.out.println(carpet2);
    }


}
