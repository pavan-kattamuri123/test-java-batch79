package com.demo;

public class Institute {
	
	static String Trainername1="vishwanath";
	static String Trainername2="Srikanth";
	String Empname;
	int Empid;
	String Employeedesignation;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Institute i1 = new Institute();
		
		i1.Empname="pavan";
		i1.Empid=1;
		i1.Employeedesignation="jfs dev";
		
		Institute i2 = new Institute();
		i2.Empname="Siva";
		i2.Empid=2;
		i2.Employeedesignation="pfs dev";
		
		Institute i3 = new Institute();
		i3.Empname="Sai";
		i3.Empid=3;
		i3.Employeedesignation="devops eng";
		
		Institute i4 = new Institute();
		i4.Empname="pooja";
		i4.Empid=4;
		i4.Employeedesignation="jfs dev";
		
		Institute i5 = new Institute();
		i5.Empname="vasu";
		i5.Empid=5;
		i5.Employeedesignation="cloud eng";
		
		System.out.println("Trainername1:" +Trainername1);
		System.out.println("Trainername2:" +Trainername2);
		System.out.println("Empname: "+i1.Empname +" Empid: "+i1.Empid +" Employeedesignation: "+i1.Employeedesignation);
		System.out.println("Empname: "+i2.Empname +" Empid: "+i2.Empid +" Employeedesignation: "+i2.Employeedesignation);
		System.out.println("Empname: "+i3.Empname +" Empid: "+i3.Empid +" Employeedesignation: "+i3.Employeedesignation);
		System.out.println("Empname: "+i4.Empname +" Empid: "+i4.Empid +" Employeedesignation: "+i4.Employeedesignation);
		System.out.println("Empname: "+i5.Empname +" Empid: "+i5.Empid +" Employeedesignation: "+i5.Employeedesignation);
		
		
		
		

	}

}
