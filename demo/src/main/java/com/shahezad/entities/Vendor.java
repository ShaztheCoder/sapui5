package com.shahezad.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.shahezad.entities.*;

@Entity
@Table(name="VENDOR")
public class Vendor {
	
@Id
@Column(nullable=false,name="ID")
@GeneratedValue(strategy=GenerationType.AUTO)
public Long ID;
@Column(nullable=false,name="COMPANY_NAME")
public String companyName;
@Column(nullable=false,name="CONTACT")
public String contact;
@Column(nullable=false,name="FIRST_NAME")
public String firstname;
@Column(nullable=false,name="LAST_NAME")
public String lastname;
@Column(nullable=false,name="GST_NO")
public String gstNo;
@Column(nullable=false,name="REG_DATE")
public String regData;

@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
@JoinColumn(name="vendor",referencedColumnName="ID")
private List<Address> Addresses = new ArrayList<>();

public List<Address> getAddresses() {
	return Addresses;
}


public void setAddresses(List<Address> addresses) {
	Addresses = addresses;
}



  
  
  public Vendor() { 
super(); 
  ID = ID; this.companyName = companyName;
  this.contact = contact; this.firstname = firstname; this.lastname = lastname;
  this.gstNo = gstNo; this.regData = regData; }
 

public Long getID() {
	return ID;
}


public void setID(Long iD) {
	ID = iD;
}


public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getGstNo() {
	return gstNo;
}
public void setGstNo(String gstNo) {
	this.gstNo = gstNo;
}
public String getRegData() {
	return regData;
}
public void setRegData(String regData) {
	this.regData = regData;
}

}
