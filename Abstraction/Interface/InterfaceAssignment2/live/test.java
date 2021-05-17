package live;

import music.playable;
import music.string.veena;
import music.wind.saxophone;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		veena obj1= new veena();
		obj1.play();
		saxophone obj2 = new saxophone();
		obj2.play();
		
		playable vObj = new veena();
		playable sObj = new saxophone();
		vObj.play();
		sObj.play();
	}
}
