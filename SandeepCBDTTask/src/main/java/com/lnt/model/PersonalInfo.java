package com.lnt.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "PersonalInfo")
@XmlType(propOrder = {"name", "address", "pan","dob","aYear","income","tds","taxDeducted"})

public class PersonalInfo {

	

	

	
	private String name;
	
	private String address;
	
	private String pan;
	
	
	private Date dob;


	private int aYear;
	
	private double income;
	
	private double tds;
	
	private double taxDeducted;

	public PersonalInfo() {
		super();
	}

	public PersonalInfo( String name, String address, String pan, Date dob, int aYear, double income, double tds,
			double taxDeducted) {
		super();
		
		this.name = name;
		this.address = address;
		this.pan = pan;
		this.dob = dob;
		this.aYear = aYear;
		this.income = income;
		this.tds = tds;
		this.taxDeducted = taxDeducted;
	}

	@Override
	public String toString() {
		return "Person [" + " name=" + name + ", address=" + address + ", pan=" + pan + ", dob=" + dob
				+ ", aYear=" + aYear + ", income=" + income + ", tds=" + tds + ", taxDeducted=" + taxDeducted + "]";
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getaYear() {
		return aYear;
	}

	public void setaYear(int aYear) {
		this.aYear = aYear;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getTds() {
		return tds;
	}

	public void setTds(double tds) {
		this.tds = tds;
	}

	public double getTaxDeducted() {
		return taxDeducted;
	}

	public void setTaxDeducted(double taxDeducted) {
		this.taxDeducted = taxDeducted;
	}
}
