package com.entity;

public class Master {

    private int id;
    private String name;

    private Pet petName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPetName() {
        return petName;
    }

    public void setPetName(Pet petName) {
        this.petName = petName;
    }
}
