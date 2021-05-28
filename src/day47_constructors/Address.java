package day47_constructors;

public class Address {

        private String street;
        private String city;
        private String state;
        private String zipcode;
        private String country = "USA";
        // constructor
        public Address() {
            System.out.println("Address constructor");
            street = "123 Unknown Street";
            city = "Unknown City";
            state = "Unknown State";
            zipcode = "00000";
        }
        // second constructor, overloaded constructor --> provides shortcut to initialize variables
        public Address(String street, String city, String state, String zipcode){
            this.street = street;
            this.city = city;
            this.state = state;
            this.zipcode = zipcode;

        }


    public String toString() {
        return street + ", " + city + ", " + state + " " + zipcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}

