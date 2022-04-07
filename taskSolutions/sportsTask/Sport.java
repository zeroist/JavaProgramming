package sportsTask;
public class Sport {
    public String name;
    public int numbersOfPlayers;
    public int numberOfReferre;
    public String rules;
    public Sport(String name, int numbersOfPlayers, int numberOfReferre, String rules) {
        this.name = name;
        this.numbersOfPlayers = numbersOfPlayers;
        this.numberOfReferre = numberOfReferre;
        this.rules = rules;
    }
    public void play(String player){
        System.out.println(player+" is playing"+ name);
    }
    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numbersOfPlayers=" + numbersOfPlayers +
                ", numberOfReferre=" + numberOfReferre +
                ", rules='" + rules + '\'' +
                '}';
    }
}
