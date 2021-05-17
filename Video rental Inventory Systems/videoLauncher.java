package oops;
import java.util.*;

public class videoLauncher {
	public static void main(String[] args) throws StoreEmptyException {
	Scanner sc = new Scanner(System.in);
	videoStore vs = new videoStore();
	
	int a=0;	
	while(a!=6)
	{
		System.out.println("\n1. Add Videos: "+"\n"+"2. Check Out Video : "+"\n"+"3. Return Video : "+"\n"+"4. Receive Rating : "+"\n"+"5. List Inventory : "+"\n"+"6. Exit : ");
		System.out.println("Enter Your Choice (1..6) : ");
		a=sc.nextInt();
		String name;
		sc.nextLine();
		switch(a) {			
		case 1:
			System.out.println("Enter the name of video you want to add: ");
			name= sc.nextLine();
			vs.addVideo(name);
			System.out.println("Video \""+ name+"\" added successfully. ");
			break;
			
		case 2:
			System.out.print("Enter the name of video you want to check out: ");
			name= sc.nextLine();
			vs.doCheckout(name);
			System.out.println("Video \""+ name +"\" checked out successfully. ");
			break;
			
		case 3:
			System.out.print("Enter the name of video you want to return: ");
			name= sc.nextLine();
			vs.doReturn(name);
			System.out.println("Video \""+ name +"\" returned successfully. ");
			break;
			
		case 4:
			System.out.print("Enter the name of video you want to rate: ");
			name = sc.nextLine();
			if(!vs.checkIfExists(name)) {
				System.out.print("Video does not exist");
			}
			else {
				System.out.print("Enter the rating for this video: ");
				int rate = sc.nextInt();
				vs.receiveRating(name, rate);
				System.out.println("Rating \""+ rate +"\" has been mapped to the Video \""+name+"\".");
			}
			break;
		case 5:
			vs.listInventory();
			break;
		case 6:
			System.out.println("Exiting...!! Thanks for using the application.");
		}
	}
	}
}
