package com.shahezad.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.shahezad.entities.Vendor;

@RepositoryRestResource(collectionResourceRel="vendor",path="newVendor")
public interface ivendorNewController extends JpaRepository<Vendor, Long> {

}
