////Address Day 33
package address;
public class Address {
    public String city, state, zipCode;
    public int street;
    public static String country = "USA";
    public static String planet = "World";
    public Address(int street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String toString() {
        return street + " " + city + "\n" +
                state + ", " + zipCode;
    }
}
class ObjectOfAdress {
    public static void main(String[] args) {
        Address adress1 = new Address(1571, "CENTRAL PARK", "NEW YORK", "10024-7603");
        System.out.println(adress1);
    }
}

