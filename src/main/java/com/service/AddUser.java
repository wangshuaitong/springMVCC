package com.service;

import com.entity.Pet;

public class AddUser implements AddUserImpl {

    Pet pet = new Pet();
    @Override
    public Pet addCustomer() {
        return pet;
    }
}
