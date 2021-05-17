package pjp;
import java.sql.*;
import java.io.*;
public class emp {
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); //for IDEs
		String st= br.readLine();
		String[] arr= st.split(" ");
		int id = Integer.parseInt(arr[arr.length-1]);
//		int id = Integer.parseInt(args[0]);   //for command prompt
		try {
			Class.forName("java.sql.Driver");
			String UID = "root";
			String PWD = "1234";
			String DB_URL = "jdbc:mysql://localhost:3306/db";
			Connection conn = DriverManager.getConnection(DB_URL,UID,PWD);
			Statement stmt = conn.createStatement();
			String query;
			query="Select *from emp, designation where emp.designationCode=designation.DesignationCode;";
			ResultSet rs = stmt.executeQuery(query);
			Boolean flag=false;
			int count=0;
			while(rs.next()) {
				int Eid = rs.getInt("eno");
				if(Eid==id) {
					if (count==0) {
						System.out.println("Emp No.    Emp Name    Department    Designation    Salary");
						count++;
					}
					System.out.printf("%5d    ",rs.getInt("eno"));
					System.out.printf("%8s    ",rs.getString("ename"));
					System.out.printf("%10s    ",rs.getString("department"));
					System.out.printf("%11s     ",rs.getString("Designation"));
					int da=rs.getInt("DA");
					int basic=rs.getInt("basic");
					int hra=rs.getInt("hra");
					int it = rs.getInt("it");
					int salary=basic+hra+da-it;
					System.out.printf("%6d\n",salary);
					flag=true;
				}
			}
			rs.close();
			stmt.close();
			conn.close();
			if(!flag)
					System.out.println("There is no employee with empid : "+id);
		}
		catch(Exception e) {
			System.out.print(e);
		}
	}
}
