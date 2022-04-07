//day 35 Tasks Pizza Task
public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;
    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping (numberOfPepperoniTopping);
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium")
                || size.equalsIgnoreCase("large"))) return;
        this.size = size;
    }
    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }
    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if ("small".equalsIgnoreCase(getSize()) && numberOfCheeseTopping > 3
                || "medium".equalsIgnoreCase(getSize()) && numberOfCheeseTopping > 4
                || "large".equalsIgnoreCase(getSize()) && numberOfCheeseTopping > 5
                || numberOfCheeseTopping < 0) return;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }
    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }
    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if ("small".equalsIgnoreCase(getSize()) && numberOfPepperoniTopping > 4
                || "medium".equalsIgnoreCase(getSize()) && numberOfPepperoniTopping > 5
                || "large".equalsIgnoreCase(getSize()) && numberOfPepperoniTopping > 6
                || numberOfPepperoniTopping < 0) return;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public double calcCost(){
        int totaltop=getNumberOfCheeseTopping()+getNumberOfPepperoniTopping();
        return "small".equalsIgnoreCase(getSize())?10+2*(totaltop):
                "medium".equalsIgnoreCase(getSize())?12+2*(totaltop):
                        14+2*(totaltop);
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Pizza Cost is =" + calcCost() +
                '}';
    }
}
class Objects3{
    public static void main(String[] args) {
        Pizza small=new Pizza("small",2,3);
        Pizza smallInvalid=new Pizza("small",5,3);
        Pizza medium=new Pizza("medium",2,3);
        Pizza mediumInvalid=new Pizza("medium",2,7);
        Pizza large=new Pizza("large",2,3);
        Pizza largeInvalid=new Pizza("large",2,13);
        Pizza InvalidCommen=new Pizza("XXL",6,2);
        System.out.println(small);
        System.out.println(smallInvalid);
        System.out.println(medium);
        System.out.println(mediumInvalid);
        System.out.println(large);
        System.out.println(largeInvalid);
        System.out.println(InvalidCommen);
    }

}
