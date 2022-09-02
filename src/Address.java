public class Address implements Comparable<Address> {
    private String name;
    private String street;
    private String city;
    private int zipCode;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                ", country='" + country + '\'' +
                '}';
    }
    @Override
    public int compareTo(Address address) {
        //cast to Address

            if(address != null) {
                if (this.zipCode == address.zipCode) {
                    return 0;
                } else if (this.zipCode > address.zipCode) {
                    return 1;
                } else {
                    return -1;
                }
            }
            return 1;



    }


}
