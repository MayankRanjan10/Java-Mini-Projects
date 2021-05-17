
public class Demo2 {
	boolean palindromeCheck(String st) {
		if(st==null || st.equals(" "))
			return true;
		st= st.toLowerCase();
		int start=0, end=st.length()-1;
		while(start<=end) {
			if(st.charAt(start)!=st.charAt(end))
				return false;
			else {
				start++;
				end--;
			}
		}
		return true;
	}
}
