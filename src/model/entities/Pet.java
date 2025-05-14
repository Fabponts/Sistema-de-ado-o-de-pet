package model.entities;

public class Pet {
    //Pet class attributes
    private String name;
    private Integer age;
    private Double weight;
    private String breed;
    private PetGender gender;
    private PetSpecie specie;

    //Pet class constructors
    public Pet() {
    }

    public Pet(String name, Integer age, Double weight, String breed, PetGender gender, PetSpecie specie) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.gender = gender;
        this.specie = specie;
    }

    //Pet class getters and setters
    private Address address;

    public Address getAdress() {
        return address;
    }

    public void setAdress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public PetGender getGender() {
        return gender;
    }

    public void setGender(PetGender gender) {
        this.gender = gender;
    }

    public PetSpecie getSpecie() {
        return specie;
    }

    public void setSpecie(PetSpecie specie) {
        this.specie = specie;
    }
}
