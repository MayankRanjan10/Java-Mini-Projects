package fourWheeler;

import com.automobile.vehicle;

public class logan extends vehicle {

	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	public logan(String modelName, String registrationNumber, String ownerName, int speed) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
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
	
	public int speed() {
		return speed;
	}
	
	public void gps() {
		System.out.println("Accessing GPS");
	}

}
