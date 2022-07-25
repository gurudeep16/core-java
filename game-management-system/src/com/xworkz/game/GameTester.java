package com.xworkz.game;

import com.xworkz.game.dto.GameDTO;

public class GameTester {

	public static void main(String[] args) {
		GameDTO gm = new GameDTO();
		gm.setName("BGMI");
		gm.setType("online");
		gm.setTotalPlayers(100);
		gm.setOrigin("South Korea");
		gm.pubg();

		System.out.println(gm.getName() + ":" + gm.getType() + ":" + gm.getTotalPlayers() + ":" + gm.getOrigin());
	}

}
