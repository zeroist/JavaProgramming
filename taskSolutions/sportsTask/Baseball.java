package sportsTask;
public class Baseball extends Sport {
    public Baseball(String name, int numbersOfPlayers, int numberOfReferre, String rules) {
        super(name, numbersOfPlayers, numberOfReferre, rules);
    }

    public String toString() {
        return "Baseball{" +
                "name='" + name + '\'' +
                ", numbersOfPlayers=" + numbersOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
