package kr.or.kosta.flight.service;

public class FlightPassenger {

	private int numOfAdults;
	private int numOfKids;
	private int numOfInfants;
	private int flightFee;
	
	public FlightPassenger() {}

	public FlightPassenger(int numOfAdults, int numOfKids, int numOfInfants, int flightFee) {
		super();
		this.numOfAdults = numOfAdults;
		this.numOfKids = numOfKids;
		this.numOfInfants = numOfInfants;
		this.flightFee = flightFee;
	}

	public int getNumOfAdults() {
		return numOfAdults;
	}

	public void setNumOfAdults(int numOfAdults) {
		this.numOfAdults = numOfAdults;
	}

	public int getNumOfKids() {
		return numOfKids;
	}

	public void setNumOfKids(int numOfKids) {
		this.numOfKids = numOfKids;
	}

	public int getNumOfInfants() {
		return numOfInfants;
	}

	public void setNumOfInfants(int numOfInfants) {
		this.numOfInfants = numOfInfants;
	}

	public int getFlightFee() {
		return flightFee;
	}

	public void setFlightFee(int flightFee) {
		this.flightFee = flightFee;
	}

}
