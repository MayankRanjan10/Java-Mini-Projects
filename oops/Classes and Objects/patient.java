import java.util.*;
import java.text.*;
class patient{
	String patientName;
	double height, weight;

	patient(String patientName, double height, double weight){
		this.patientName = patientName;
		this.height= height;
		this.weight=weight;
	}

	public double computeBMI(){
		return weight/(Math.pow(height,2));
	}

	private static DecimalFormat df = new DecimalFormat("0.0");
	
	public static void main(String[] args) {
		patient obj = new patient("Sunny", 1.74, 85);
		System.out.println(df.format(obj.computeBMI()));
	}
}