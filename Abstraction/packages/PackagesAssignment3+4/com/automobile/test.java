package com.automobile;

import twoWheeler.Hero;
import twoWheeler.honda;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero = new Hero("Hero Glamour", "XYZ48615AB", "XYZ", 110);
		System.out.println(hero.getModelName());
		System.out.println(hero.getRegistrationNumber());
		System.out.println(hero.getOwnerName());
		System.out.println(hero.getSpeed()+" kmph");
		hero.radio();
		
		System.out.println();
		
		honda honda = new honda("Honda Shine", "XYZ248473C", "XYZ", 90);
		System.out.println(honda.getModelName());
		System.out.println(honda.getRegistrationNumber());
		System.out.println(honda.getOwnerName());
		System.out.println(honda.getSpeed()+" kmph");
		honda.cdplayer();	
	}

}
