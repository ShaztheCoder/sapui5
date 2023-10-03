package com.shahezad.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shahezad.entities.Address;
import com.shahezad.*;
public interface iAddressPersistence extends JpaRepository<Address, Long> {

}
