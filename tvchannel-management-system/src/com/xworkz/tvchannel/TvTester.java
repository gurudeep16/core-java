package com.xworkz.tvchannel;

import com.xworkz.tvchannel.dto.TvChannelDTO;

public class TvTester {
	public static void main(String[] args) {
		TvChannelDTO tv = new TvChannelDTO();
		tv.setChannelName("TV9");
		tv.setLanguage("kannada");
		tv.setStartedIn(2006);
		tv.setType("news channel");

		System.out.println(tv.getChannelName() + " " + tv.getLanguage() + " " + tv.getStartedIn() + " " + tv.getType());
	}

}
