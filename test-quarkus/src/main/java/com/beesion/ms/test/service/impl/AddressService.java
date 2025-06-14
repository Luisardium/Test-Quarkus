package com.beesion.ms.test.service.impl;

import com.beesion.ms.model.Address;
import com.beesion.ms.test.repository.impl.IAddressRepo;
import com.beesion.ms.test.repository.impl.IPersonRepo;
import com.beesion.ms.test.service.IAddressService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class AddressService implements IAddressService {
    @Inject
    IAddressRepo addressRepo;

    @Inject
    IPersonRepo personRepo;

    @Override
    public void save(Address address) {
        Long personId = address.getPerson().getId();
        if (!personRepo.existsById(personId)) {
            throw new IllegalArgumentException("Persona con ID " + personId + " no existe");
        }

        addressRepo.save(address);
    }

    @Override
    public List<Address> findAll() {
        return addressRepo.findAll();
    }
}
