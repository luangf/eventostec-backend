package com.example.demo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.address.Address;

public interface AddressRepository extends JpaRepository<Address, UUID> {

}
