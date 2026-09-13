package com.demo;

public class Employees {
	int empid;
	String empname;
	int salary;
	static String companyname="amazon";

    static{
        System.out.println("companyname:"+companyname);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employees e1=new Employees();
    e1.empid=1;
    e1.empname="suresh";
    e1.salary=30000;


    Employees e2=new Employees();
    e2.empid=2;
    e2.empname="naresh";
    e2.salary=26000;


    Employees e3=new Employees();
    e3.empid=3;
    e2.empname="pavan";
    e3.salary=40000;
		

System.out.println("empid:"+e1.empid+"empname:"+e1.empname+"salary:"+e1.salary);
System.out.println("empid:"+e2.empid+"empname:"+e2.empname+"salary:"+e2.salary);
System.out.println("empid:"+e3.empid+"empname:"+e3.empname+"salary:"+e3.salary);

	}

}
