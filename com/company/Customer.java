package com.company;

import java.util.HashMap;

public class Customer {
	private String id;
	private String name;
	private String address;
	private String city;
	private int postalCode;
	private String dateDriverLicense;
	private long digitsCC;
	private int monthCC;
	private int yearCC;
	private int cvcCC;
	private String typeCC;

	public Customer(String id, String name, String address, String city, int postalCode,
					String dateDriverLicense, long digitsCC, int monthCC, int cvcCC, int yearCC, String typeCC) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.dateDriverLicense = dateDriverLicense;
		this.digitsCC = digitsCC;
		this.monthCC = monthCC;
		this.cvcCC = cvcCC;
		this.yearCC = yearCC;
		this.typeCC = typeCC;
	}

	private VehicleRental cuVr;

	public VehicleRental getCuVr() {return cuVr;}
	public void setCuVr(VehicleRental cuVr) {this.cuVr = cuVr;	}

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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getDateDriverLicense() {
		return dateDriverLicense;
	}
	public void setDateDriverLicense(String dateDriverLicense) {
		this.dateDriverLicense = dateDriverLicense;
	}
	public long getDigitsCC() {
		return digitsCC;
	}
	public void setDigitsCC(long digitsCC) {
		this.digitsCC = digitsCC;
	}
	public int getMonthCC() {
		return monthCC;
	}
	public void setMonthCC(int monthCC) {
		this.monthCC = monthCC;
	}
	public int getYearCC() {
		return yearCC;
	}
	public void setYearCC(int yearCC) {
		this.yearCC = yearCC;
	}
	public int getCvcCC() {
		return cvcCC;
	}
	public void setCvcCC(int cvcCC) {
		this.cvcCC = cvcCC;
	}
	public String getTypeCC() {
		return typeCC;
	}
	public void setTypeCC(String typeCC) {
		this.typeCC = typeCC;
	}

	private HashMap<String, Reservation> colcuR = new HashMap<String, Reservation>();
	public Reservation getReservation(String identifier_Reservation){
		return colcuR.get(identifier_Reservation);
	}
	public void add_Reservation(String nombre_res,Reservation o){
		colcuR.put(nombre_res, o);
	}
	public void remove_Reservation(String identifier_Reservation) {
		colcuR.remove(identifier_Reservation);
	}
}
