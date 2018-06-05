package model;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
