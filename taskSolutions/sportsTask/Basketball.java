package sportsTask;
public class Basketball extends Sport {
    public Basketball(String name, int numbersOfPlayers, int numberOfReferre, String rules) {
        super(name, numbersOfPlayers, numberOfReferre, rules);
    }

    public String toString() {
        return "Basketball{" +
                "name='" + name + '\'' +
                ", numbersOfPlayers=" + numbersOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
