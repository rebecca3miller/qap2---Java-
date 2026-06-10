public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public String toString() {
        return String.format("%s\n%s, %s %s", street, city, state, zipCode);
    }
}
