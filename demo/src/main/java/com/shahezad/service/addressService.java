package com.shahezad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shahezad.*;
import com.shahezad.entities.Address;
@Component
public class addressService {
  @Autowired
  iAddressPersistence address;
  

	 public List<Address> getAdress() {
		  return address.findAll();
	  }
	  

	  public Address createAddress(Address payload) {
		  return address.save(payload);
	  }

  
}
