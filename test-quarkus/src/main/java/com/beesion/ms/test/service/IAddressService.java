package com.beesion.ms.test.service;

import com.beesion.ms.model.Address;

import java.util.List;

public interface IAddressService {
    void save(Address address);
    List<Address> findAll();
}
