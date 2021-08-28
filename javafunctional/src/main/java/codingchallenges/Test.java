package codingchallenges;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Test {

  public static void main (String[] args) {

    List<Flight> flights = new ArrayList<>();
    flights.add(new Flight("2021-01-01|10|DAL", "N001WN", LocalDateTime.parse("2021-01-01T10:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))));
    flights.add(new Flight("2021-01-01|20|MSY", "N002WN", LocalDateTime.parse("2021-01-01T11:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))));
    flights.add(new Flight("2021-01-01|20|AUS", "N002WN", LocalDateTime.parse("2021-01-01T12:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))));
    flights.add(new Flight("2021-01-01|10|HOU", "N001WN", LocalDateTime.parse("2021-01-01T09:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))));
    flights.add(new Flight("2021-01-01|20|FLL", "N002WN", LocalDateTime.parse("2021-01-01T09:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))));
    flights.add(new Flight("2021-01-01|30|SEA", "N003WN", LocalDateTime.parse("2021-01-01T15:00:00", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"))));

        
    printFlightsByAircrafts(flights);
    
  }

  private static void printFlightsByAircrafts(List<Flight> flights) {

    Map<String, List<Flight>> flightsByAircraft = 
          flights.stream().collect(Collectors.groupingBy(Flight::getAircraft));
    
   
    Map<String, List<String>> output = flightsByAircraft.entrySet().stream()
    		.collect(Collectors.toMap(
    				e -> e.getKey(),
    	            e -> e.getValue().stream()
    	            .sorted(( f1, f2) -> f1.getDeptTime().compareTo(f2.getDeptTime()))
    	            .map(x -> x.getId())
    	            .collect(Collectors.toList())));
    
    
    
    Map<String, List<String>> result2 = new LinkedHashMap<>();
    output.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .forEachOrdered(x -> result2.put(x.getKey(), x.getValue()));
    
    
    System.out.print(result2);

  }

  

}

class Flight {

    private String id;
    private String aircraft;
    private LocalDateTime deptTime;

    public Flight(String id, String aircraft, LocalDateTime deptTime) {
        this.id = id;
        this.aircraft = aircraft;
        this.deptTime = deptTime;
    }

    public String getId() {
      return this.id;
    }
    
    public String getAircraft() {
      return this.aircraft;
    }
    
    public LocalDateTime getDeptTime() {
      return this.deptTime;
    }


  }