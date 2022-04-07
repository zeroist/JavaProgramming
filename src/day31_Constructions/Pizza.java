package day31_Constructions;
public class Pizza {
    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;
    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
    }

    public double calcCost(){
        if(size=='S') return 10+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        else if(size=='M') return 12+2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        else return 14+2*(numberOfCheeseTopping+numberOfPepperoniTopping);



    }
}
