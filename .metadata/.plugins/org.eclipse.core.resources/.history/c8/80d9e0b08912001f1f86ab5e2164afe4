package Shop;

public class Address {
    private String houseNumber;
    private String postcode;
    private String city;

    public Address(String houseNumber, String postcode, String city) {
        if (houseNumber == null || postcode == null || city == null) {
            throw new IllegalArgumentException("Address fields cannot be null");
        }
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", houseNumber, postcode, city);
    }
}
