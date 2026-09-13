package com.demo;

public class Garbagecollector {
  protected void finalized() {
        System.out.println("object destroyed!!");
    }

  	void message() {
  		System.out.println("object cleared");
  	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nullyfing the objects
        Garbagecollector gc1 = new Garbagecollector();
        Garbagecollector gc2 = new Garbagecollector();
        
        gc1=null;
        gc2=null;
        System.gc();
        
        System.out.println(gc1);
        System.out.println(gc2);

        
        //reassigining the objects
        Garbagecollector gc3 = new Garbagecollector();
        Garbagecollector gc4 = new Garbagecollector();
        
        gc4=gc3;
        
        
        //ananomous object
        
        new Garbagecollector().message();
        System.gc();
        
        System.out.println("garbage cleared");
        
	}

}
