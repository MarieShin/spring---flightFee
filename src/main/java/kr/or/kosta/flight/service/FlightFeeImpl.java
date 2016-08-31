package kr.or.kosta.flight.service;

public class FlightFeeImpl implements FlightFeeService {

	@Override
	public int calcFlightFee(int adults, int kids, int infants, int fee) {

		FlightPassenger passenger = new FlightPassenger(adults, kids, infants, fee);

		int numOfAdults = passenger.getNumOfAdults();
		int numOfKids = passenger.getNumOfKids();
		int numOfInfants = passenger.getNumOfInfants();
		int flightFee = passenger.getFlightFee();

		int resultFee = (numOfAdults + numOfKids + numOfInfants) * flightFee ;

		return resultFee;
	}

}
