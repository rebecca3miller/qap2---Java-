// ADDRESS CLASS
// First set up scanner class.
public class Address {
    // Private instance variables.
    private String street; 
    private String city;
    private String state;
    private String zipCode;

    // parameterized constructor.
    public Address(String street, String city, String state, String zipCode) {
        this.street = street; // initialize instance variable street 
        this.city = city; // initialize instance variable city 
        this.state = state; // initialize instance variable state
        this.zipCode = zipCode; // initialize instance variable zipcode
    }

    // Method
    public String toString() {
        return String.format("%s\n%s, %s %s", street, city, state, zipCode);
    }
}
