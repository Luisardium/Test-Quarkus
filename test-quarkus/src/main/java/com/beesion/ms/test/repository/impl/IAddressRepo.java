package com.beesion.ms.test.repository.impl;

import com.beesion.ms.model.Address;
import java.util.List;

public interface IAddressRepo {
    void save(Address address);
    List<Address> findAll();
}
