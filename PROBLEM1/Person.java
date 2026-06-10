public class Person {

    // Private instance variables.
    private String lastName;
    private String firstName;
    private Address home;

    // Constructor/
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // Method
    public String toString() {
        return String.format("%s, %s\n%s", lastName, firstName, home);
    }


}