package sportsTask;
public class Football extends Sport {
    public Football(String name) {
        super(name, 11, 3, "just be fair");
    }

    public String toString() {
        return "Football{" +
                "name='" + name + '\'' +
                ", numbersOfPlayers=" + numbersOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
