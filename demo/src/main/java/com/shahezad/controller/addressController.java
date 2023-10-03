package com.shahezad.controller;

import java.util.List;
import com.shahezad.*;
import com.shahezad.entities.Address;
import com.shahezad.service.addressService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.shahezad.*;
@RestController
public class addressController {
	
	 @Autowired
	 addressService adrsrvc;
	 
	 @RequestMapping("/addresses")
	 public List<Address> getAdress() {
		  return adrsrvc.getAdress();
	  }
	  
	  @PostMapping("/addresses")
	  public Address createAddress(@RequestBody Address payload) {
		  return adrsrvc.createAddress(payload);
	  }

}
