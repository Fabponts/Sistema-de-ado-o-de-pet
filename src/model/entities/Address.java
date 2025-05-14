package model.entities;

public class Address {
    // Address class Attributes
    private Integer number;
    private String city;
    private String street;

    //Address class Constructors
    public Address(){
    }
    public Address(Integer number, String city, String street){
        this.number = number;
        this.city = city;
        this.street = street;
    }

    //Address class getters and setters
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    //Address class method toString
    @Override
    public String toString(){
        String format = String.format("Street %s Number %d %s",getStreet(),getNumber(),getCity());
        return format;
    }
}
