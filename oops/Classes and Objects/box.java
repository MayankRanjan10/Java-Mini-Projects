import java.util.*;
class box{
	int width, height, depth;
	
	box(int l, int b, int h){
		width=l;
		height=h;
		depth=b;
	}

	public int volumeCalculator(){
		return width*height*depth;
	}

	public static void main(String[] args) {
		box obj = new box(10,20,30);
		System.out.print(obj.volumeCalculator());
	}
}