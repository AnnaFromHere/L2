package Address;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Address {

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", city=" + city +
                ", street=" + street +
                ", building=" + building +
                ", floor=" + floor +
                ", apartment=" + apartment + '\'' +
                '}';
    }

    @JsonIgnore
    public String country;
    public String city;
    public String street;
    public int building;
    public int floor;
    public int apartment;

    public Address(String country, String city, String street,
                   int building, int floor, int apartment)
    {
        this.country = country;
        this.city = city;
        this.street = street;
        this.building = building;
        this.floor = floor;
        this.apartment = apartment;
    }
}


