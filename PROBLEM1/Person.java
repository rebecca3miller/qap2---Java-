public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    public String toString() {
        return String.format("%s, %s\n%s", lastName, firstName, home);
    }


}