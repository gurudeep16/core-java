package com.xworkz.ipl;

import com.xworkz.ipl.dto.IplDTO;

class IplTester{
	public static void main(String[] args) {
		IplDTO ip = new IplDTO();
		ip.setGameOf("Cricket");
		ip.setManagedBy("BCCI");
		ip.setSponser("TATA");
		ip.setTeams(8);
		ip.setType("Domestic");
		
		System.out.println(ip.getGameOf()+" "+ip.getManagedBy()+" "+ip.getSponser()+" "+ip.getTeams()+" "+ip.getType());
	}
}
