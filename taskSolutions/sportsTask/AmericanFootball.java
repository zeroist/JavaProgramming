package sportsTask;
public class AmericanFootball extends Sport {
    public AmericanFootball(String name, int numbersOfPlayers, int numberOfReferre, String rules) {
        super(name, numbersOfPlayers, numberOfReferre, rules);
    }

    public String toString() {
        return "AmericanFootball{" +
                "name='" + name + '\'' +
                ", numbersOfPlayers=" + numbersOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
