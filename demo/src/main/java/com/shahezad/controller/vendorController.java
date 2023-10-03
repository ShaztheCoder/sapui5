package com.shahezad.controller;

import com.shahezad.*;
import com.shahezad.entities.Vendor;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
public class vendorController {

@Autowired
com.shahezad.service.vendorService vendorService;

@RequestMapping("/vendor")
public List<Vendor> getAllVendor(){
	return (List<Vendor>) vendorService.readAllVendor();
	
}

  @RequestMapping("/vendor/search")
  public List<Vendor> searchByCompany(@RequestParam String company){
	  return vendorService.searchByCompanyName(company);
  }
  
  @RequestMapping("/vendor/lookup")
  public List<Vendor> lookupByGstNo(@RequestParam String GstNo){
	  return vendorService.lookupVendorByGSTNo(GstNo);
	  
  }
  
@RequestMapping("/vendor/{vendorCode}")
public Vendor getVendorById(@PathVariable("vendorCode") Long code) {
	 Optional<Vendor> searchResult = vendorService.getSingleVendor(code);
	 if(!searchResult.isPresent()) {
		return new Vendor();
	 }
	 return searchResult.get();
	
}

@RequestMapping(method = RequestMethod.POST, value="/vendor")
public Vendor createVendor(@RequestBody Vendor myPostBody) {
	return vendorService.createVendor(myPostBody);
}

@RequestMapping(method = RequestMethod.PUT, value="vendor")
public Vendor changeVendor(@RequestBody Vendor myBody) {
	return vendorService.changeVendor(myBody);
	}
}