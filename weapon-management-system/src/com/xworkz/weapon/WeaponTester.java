package com.xworkz.weapon;

import com.xworkz.weapon.dto.WeaponDTO;

public class WeaponTester {
	public static void main(String[] args) {
		WeaponDTO wp = new WeaponDTO();
		wp.setName("351 magnum");
		wp.setOrigin("Germany");
		wp.setRange(100);
		wp.setType("Gun");

		System.out.println(wp.getName() + " " + wp.getOrigin() + " " + wp.getRange() + " " + wp.getType());
	}

}
