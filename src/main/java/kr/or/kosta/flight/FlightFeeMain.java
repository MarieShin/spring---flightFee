package kr.or.kosta.flight;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.or.kosta.flight.service.FlightFeeImpl;
import kr.or.kosta.flight.service.FlightFeeService;

public class FlightFeeMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		FlightFeeService service = new FlightFeeImpl();
		
		int flightFee = service.calcFlightFee(3, 1, 0, 50000);
		
		String result = NumberFormat.getCurrencyInstance().format(flightFee);
		
		System.out.println(result);
	}
}
