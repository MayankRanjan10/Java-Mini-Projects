package twoWheeler;

import com.automobile.vehicle;

public class honda extends vehicle {
	
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	public honda(String modelName, String registrationNumber, String ownerName, int speed) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	public honda() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return modelName;
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return registrationNumber;
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return ownerName;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void cdplayer() {
		System.out.println("Controlling CD Player");
	}
}
