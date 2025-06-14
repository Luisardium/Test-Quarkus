package com.beesion.ms.test.repository;

import com.beesion.ms.model.Address;
import com.beesion.ms.test.repository.impl.IAddressRepo;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class AddressRepo implements IAddressRepo {
    @Inject
    EntityManager em;

    @Override
    @Transactional
    public void save(Address address) {
        em.persist(address);
    }

    @Override
    public List<Address> findAll() {
        TypedQuery<Address> query = em.createQuery("SELECT a FROM Address a", Address.class);
        return query.getResultList();
    }
}
