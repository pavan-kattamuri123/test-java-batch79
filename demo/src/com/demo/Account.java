package com.demo;

public class Account {
int Accountno;
String name;
int Salary;
static int Accountnumbergenerator=1500;
{
    Accountnumbergenerator++;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Account ob1=new Account();
    Account ob2=new Account();
    Account ob3=new Account();
    
    ob1.Accountno=Accountnumbergenerator;



System.out.println("Account number: "+ob1.Accountno);
	}

}