import java.util.*;
import java.io.*;

class IOassignment3 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(new File(args[0])));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(args[1])));

		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		String st;
		while((st=br.readLine())!=null){
			st= st.trim();
			String[] arr = st.split(" +");
			
			for(String i:arr){
				map.put(i, map.get(i)==null? 1: map.get(i)+1);
			}
		}

		for(Map.Entry<String, Integer> e: map.entrySet()){
			bw.write(e.getKey()+" : "+ e.getValue()+"\n");
		}

		br.close();
		bw.close();
	}
}