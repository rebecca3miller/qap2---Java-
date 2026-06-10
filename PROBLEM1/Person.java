public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    public String toString() {
        return String.format("%s, %s\n%s", lastName, firstName, home);
    }


}