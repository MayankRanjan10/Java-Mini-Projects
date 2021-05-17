package com.automobile;

import fourWheeler.ford;
import fourWheeler.logan;

public class test4wheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ford ford = new ford("Ford Mustang GT", "4861MBC61H", "XYZ", 237);
		System.out.println(ford.getModelName());
		System.out.println(ford.getOwnerName());
		System.out.println(ford.getRegistrationNumber());
		System.out.println(ford.speed()+" kmph");
		ford.tempControl();
		
		System.out.println();
		
		logan logan = new logan("Mahindra Logan 1.5DLS", "6897MQL49L", "ABC", 150);
		System.out.println(logan.getModelName());
		System.out.println(logan.getOwnerName());
		System.out.println(logan.getRegistrationNumber());
		System.out.println(logan.speed()+" kmph");
		logan.gps();
	}
}
