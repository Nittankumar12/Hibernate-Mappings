package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Date;
//@Entity

//FOR INHERITANCE 1: TABLE PER HIERARCHY
//@DiscriminatorValue("address")

//FOR INHERITANCE 2: TABLE PER CLASS
//@Table(name = "address")
//@AttributeOverrides({
//        @AttributeOverride(name="id", column = @Column(name = "id")),
//        @AttributeOverride(name = "name", column = @Column(name="name")),
//        @AttributeOverride(name = "city", column = @Column(name = "city"))
//})
public class Address {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "address_id")
//    private int addressId;
    @Column(length = 50,name = "STREET")
    private String street;
//    @Column(length = 50,name = "ADDRESS_CITY")
//    private String address_city;
    @Column(name = "IS_OPEN")
    private boolean isOpen;
    @Transient
    private double x;
    @Column(name = "ADDED_DATE")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte[] image;

    public Address() {
        super();
    }

    public Address(int addressId, String street, boolean isOpen, double x, Date addedDate, byte[] image) {
//        this.addressId = addressId;
        this.street = street;
//        this.address_city = address_city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

//    public int getAddressId() {
//        return addressId;
//    }

//    public void setAddressId(int addressId) {
//        this.addressId = addressId;
//    }/**/

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

//    public String getAddress_city() {
//        return address_city;
//    }

//    public void setAddress_city(String address_city) {
//        this.address_city = address_city;
//    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
//                "addressId=" + addressId +
                ", street='" + street + '\''  +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addedDate=" + addedDate +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
