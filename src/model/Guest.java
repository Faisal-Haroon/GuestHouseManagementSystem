package model;
public class Guest {

    private Name name;
    private Address addressDetails;

    public Guest(Name name, Address addressDetails) {
        this.name = name;
        this.addressDetails = addressDetails;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Address getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(Address addressDetails) {
        this.addressDetails = addressDetails;
    }

    public void create() {
        System.out.println("Guest Created");
    }

}
