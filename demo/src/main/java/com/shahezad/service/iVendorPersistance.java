package com.shahezad.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shahezad.entities.Vendor;
import com.shahezad.*;
public interface iVendorPersistance extends JpaRepository<Vendor, Long> {
      List <Vendor> findByCompanyName(String companyName); 
      
      @Query(nativeQuery=true,
    		   value="SELECT * FROM public.vendor where lower(GST_NO) like %?1% ")
      List<Vendor> lookupVendorByGST(String gstNo);
}
