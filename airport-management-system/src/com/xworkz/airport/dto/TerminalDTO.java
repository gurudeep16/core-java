package com.xworkz.airport.dto;

import lombok.Data;

@Data
public class TerminalDTO {
	
	private int id;
	private String type;
	private String airportName;
	private int noOfEntry;
	private int noOfExit;

}
