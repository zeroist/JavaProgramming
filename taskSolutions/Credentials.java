//Credentials task day 35
public class Credentials {
    private String username, password;
    public Credentials(String username, String password) {
        setUsername(username);
        setPassword(password);
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (!isStrongPassWord(password)) {
            System.out.println("weak password.now pragram is exiting");
            System.exit(0);
        }
        this.password = password;
    }
    public boolean isStrongPassWord(String password) {
        int countLetter = 0;
        int countDigit = 0;
        int countSpecial = 0;
        if (password.length() > 8 && !password.contains(" ")) {
            char[] array = password.toCharArray();
            for (char c : array) {
                if (Character.isLetter(c)) countLetter++;
                else if (Character.isDigit(c)) countDigit++;
                else countSpecial++;
            }
            return (countDigit > 0 && countLetter > 0 && countSpecial > 0);
        } else return false;
    }
    public String toString() {
        return "Credentials{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", weak or strong='" + (isStrongPassWord(password) ? "Strong pass." : null) + '\'' +
                '}';
    }
}
class Object4 {
    public static void main(String[] args) {
        Credentials pass1 = new Credentials("Yusuf", "krröffweqrrf4?");
        System.out.println(pass1);
    }
}