package com.company;



public class Reservation {
	private String pickupDate;
	private String returnDate;
	private String rentalModality;
	private String id;
	private BranchOffice rBOpickup;
	private BranchOffice rBOreturn;
	private Category rCa;
	private Pickup rP;
	private Customer rCu;

	public Reservation(String id, String pickupDate, String returnDate, String rentalModality) {
		this.id=id;
		this.pickupDate = pickupDate;
		this.returnDate = returnDate;
		this.rentalModality = rentalModality;
	}



	private VehicleRental rVR;
	public VehicleRental getrVR() {
		return rVR;
	}
	public void setrVR(VehicleRental rVR) {
		this.rVR = rVR;
	}

	public BranchOffice getrBOpickup() {
		return rBOpickup;
	}
	public void setrBOpickup(BranchOffice rBOpickup) {
		this.rBOpickup = rBOpickup;
	}
	public BranchOffice getrBOreturn() {
		return rBOreturn;
	}
	public void setrBOreturn(BranchOffice rBOreturn) {
		this.rBOreturn = rBOreturn;
	}
	public Pickup getrP() {
		return rP;
	}
	public void setrP(Pickup rP) {
		this.rP = rP;
	}
	public Customer getrCu() {
		return rCu;
	}
	public void setrCu(Customer rCu) {
		this.rCu = rCu;
	}
	public Category getrCa() {
		return rCa;
	}
	public void setrCa(Category rCa) {
		this.rCa = rCa;
	}
	public String getPickupDate() {
		return pickupDate;
	}
	public void setPickupDate(String pickupDate) {
		this.pickupDate = pickupDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getRentalModality() {
		return rentalModality;
	}
	public void setRentalModality(String rentalModality) {
		this.rentalModality = rentalModality;
	}

}
