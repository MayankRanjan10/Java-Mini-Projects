package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
	public int findNumberOfNullMarks(Student data[]) {
		int cnt=0;
		for(var i:data) {
			try {
                i.getMarks();
            } 
			catch (Exception e) {
             	cnt++;
			}
		}
		return cnt;
	}
	
	public int findNumberOfNullNames(Student data[]) {
		int cnt=0;
		for(var i:data) {
			try {
                i.getName();
            } 
			catch (Exception e) {
             	cnt++;
			}			
		}
		return cnt;
	}
	
	public int findNumberOfNullObjects(Student data[]) {
		int cnt=0;
		for(var i:data) {
			cnt+= (i==null)? 1:0;			
		}
		return cnt;
	}
}
