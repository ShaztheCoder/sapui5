package com.shahezad.service;
import com.shahezad.*;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shahezad.entities.Vendor;
@Component
public class vendorService {
    @Autowired
   iVendorPersistance vendor;	
	public List<Vendor> readAllVendor(){
        
		return vendor.findAll();
	}
	
	
	public Vendor createVendor(Vendor vendorObj) {
		//vendor.code = "New";
		return vendor.save(vendorObj);
	}
	
	public List<Vendor> searchByCompanyName(String companyName){
		return vendor.findByCompanyName(companyName);
	}
    
	public List<Vendor> lookupVendorByGSTNo(String gstNo){
		return vendor.lookupVendorByGST(gstNo);
	}
	
	public Optional<Vendor> getSingleVendor(Long id){
		return vendor.findById(id);
	}
	
	public Vendor changeVendor(Vendor payload) {
		Optional<Vendor> myVendor = vendor.findById(payload.getID());
		if(!myVendor.isPresent()) {
		return new Vendor();	
		}
		return vendor.save(payload);		
	}
}
