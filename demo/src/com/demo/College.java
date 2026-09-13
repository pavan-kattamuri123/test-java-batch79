package com.demo;

public class College {
	static String collegename ="Vcube";
	static String collegeloc="kphb";
	int studentid;
	String studentname;
	String branch;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College ob1=new College();
		ob1.studentid=1;
		ob1.studentname="pavan";
		ob1.branch="IT";
		
		College ob2=new College();
		ob2.studentid=2;
		ob2.studentname="akhil";
		ob2.branch="IT";
		
		College ob3=new College();
		ob3.studentid=3;
		ob3.studentname="sai";
		ob3.branch="IT";
		
		College ob4=new College();
		ob4.studentid=4;
		ob4.studentname="siva";
		ob4.branch="IT";
		
		College ob5=new College();
		ob5.studentid=5;
		ob5.studentname="phani";
		ob5.branch="IT";
		
		System.out.println("collegename: " +collegename);
		System.out.println("collegeloc:  "  +collegeloc);
		System.out.println("studentid: "+ob1.studentid + " studentname: "+ob1.studentname + " Branch:" + ob1.branch);
		System.out.println("studentid: "+ob2.studentid + " studentname: "+ob2.studentname + " Branch:" + ob2.branch);
		System.out.println("studentid: "+ob3.studentid + " studentname: "+ob3.studentname + " Branch:" + ob3.branch);
		System.out.println("studentid: "+ob4.studentid + " studentname: "+ob4.studentname + " Branch:" + ob4.branch);
		System.out.println("studentid: "+ob5.studentid + " studentname: "+ob5.studentname + " Branch:" + ob5.branch);
		

	}

}
