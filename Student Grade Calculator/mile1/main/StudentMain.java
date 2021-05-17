package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student data[] = new Student[4];

    static {
        for (int i = 0; i < data.length; i++)
            data [i]= new Student();

        data [0] = new Student("Sekar", new int[] {35, 35, 35});
        data [1] = new Student(null, new int[] {11, 22, 33});
        data [2] = null;
        data [3] = new Student("Manoj", null);
    }
    
    public static void main(String[] args) {
    	StudentReport obj = new StudentReport();
    	String res=null;
    	System.out.println("Grades Calculation: ");
    	
    	for(var i: data)
    	{
    		try {
                res = obj.validate(i);
            } 
    		catch (NullNameException e) {
                res = "NullNameException occured";
    		}
            catch (NullMarksArrayException e) {
            	res = "NullMarksArrayException occured";
            } 
    		catch (NullStudentException e) {
            	res = "NullStudentException occured";
            }

            System.out.println("GRADE = " + res);
        }
    	
    	StudentService obj2 = new StudentService();
        System.out.println("Number of Objects with Marks array as null = " + obj2.findNumberOfNullMarks(data));
        System.out.println("Number of Objects with Name as null = " + obj2.findNumberOfNullNames(data));
        System.out.println("Number of Objects that are entierly null = " + obj2.findNumberOfNullObjects(data)); 	
    }
}
