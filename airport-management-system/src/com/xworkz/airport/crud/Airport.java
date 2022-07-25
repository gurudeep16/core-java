package com.xworkz.airport.crud;

import com.xworkz.airport.dto.TerminalDTO;

public interface Airport {
	public void getTerminalDetails();
	public boolean updateNamesById(int id,String airportName);
	public boolean deleteByType(String type);
	public boolean deleteByAirportName(String airportName);
	public boolean createTerminals(TerminalDTO td);
}
