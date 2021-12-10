package stepanPackage.practice12to15.task2;

public class Address {
    private String country, region, city, street, house, building, flat;

    public Address(String fullAddress, String delimeter) {
        String[] dividedAddress = fullAddress.split(delimeter + " ");
        country = dividedAddress[0];
        region = dividedAddress[1];
        city = dividedAddress[2];
        street = dividedAddress[3];
        house = dividedAddress[4];
        building = dividedAddress[5];
        flat = dividedAddress[6];
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }
}
