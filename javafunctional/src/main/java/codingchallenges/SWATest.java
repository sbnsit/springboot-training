package codingchallenges;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SWATest {
	
	public static void main(String[] args) {
		
		List<Flight> flightList = new ArrayList<>();
		
		
		
		Map<String, List<String>> output = new HashMap<>();
		
		output = getScheduleForAircraft(flightList);
		
		
	}
	
	public static Map<String,List<String>> getScheduleForAircraft(List<Flight> flights) {
		return null;
		
	}
	
	
	

}


//class Flight {
//	private String id;
//	private String aircraft;
//	private LocalDate departureTime;
//	
//	
//	public Flight(String id, String aircraft, LocalDate departureTime) {
//		
//		this.id = id;
//		this.aircraft = aircraft;
//		this.departureTime = departureTime;
//	}
//
//
//	public String getId() {
//		return id;
//	}
//
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//
//	public String getAircraft() {
//		return aircraft;
//	}
//
//
//	public void setAircraft(String aircraft) {
//		this.aircraft = aircraft;
//	}
//
//
//	public LocalDate getDepartureTime() {
//		return departureTime;
//	}
//
//
//	public void setDepartureTime(LocalDate departureTime) {
//		this.departureTime = departureTime;
//	}
//	
//	
//	
//	
//}