package oops;

public class videoStore {
	video[] store;
	
	public void addVideo(String name) {
		int size;
		video obj = new video(name);
		try {
			size=store.length;
		}
		catch(Exception e) {
			size=0;
		}
		video[] temp= new video[size+1];
		temp[size++]=obj;
		store = temp;
	}
	
	public void doCheckout(String name) throws StoreEmptyException {
		try {
			 for(var x : store) {
				 if(x.getName().equals(name))
					 x.doCheckout();
			 }
		}
		catch(Exception e) {
			throw new StoreEmptyException();
		}			
	}
	
	public void doReturn(String name) throws StoreEmptyException {
		try {
			 for(var x : store) {
				 if(x.getName().equals(name))
					 x.doReturn();
			 }
		}
		catch(Exception e) {
			throw new StoreEmptyException();
		}			
	}
	
	public boolean checkIfExists(String name) {
		for(var x: store) {
			if(x.getName().equals(name))
				return true;
		}
		return false;
	}
	
	public void receiveRating(String name, int rating) throws StoreEmptyException {
		try {
			 for(var x : store) {
				 if(x.getName().equals(name))
					 x.receiveRating(rating);
			 }
		}
		catch(Exception e) {
			throw new StoreEmptyException();
		}			
	}
	
	public void listInventory() throws StoreEmptyException {
		try {
			for (var x : store) {
				for(int i=0;i<=100;i++) {System.out.print("-");}
				System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", "Video Name","Checkout Status","Rating");
				System.out.printf("\n\t%-20s\t|\t%-10s\t|\t%-15s\n", x.getName(), x.getCheckout(), x.getRating());
				for(int i=0;i<=100;i++) {System.out.print("-");}
			}
		}
		catch(Exception e) {
			throw new StoreEmptyException();
		}			
	}
}
