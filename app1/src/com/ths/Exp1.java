package com.ths;

public class Exp1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("i am from run()");
	}
	
	public static void main(String[] args) {
		
		Exp1 t1 = new Exp1();
		Exp1 t2 = new Exp1();
		Exp1 t3 = new Exp1();
		
		System.out.println("default thread priority : "+t1.getPriority());
		System.out.println("default thread priority : "+t2.getPriority());
		System.out.println("default thread priority : "+t3.getPriority());
		
		System.out.println("default thread name : "+t1.getName());
		System.out.println("default thread name : "+t2.getName());
		System.out.println("default thread name : "+t3.getName());
		
		t1.setName("transfer");
		t2.setName("withdraw");
		t3.setName("credit");
		
		System.out.println(MAX_PRIORITY);
		System.out.println(NORM_PRIORITY);
		System.out.println(MIN_PRIORITY);
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		
		
		System.out.println("after setting thread name : "+t1.getName());
		System.out.println("after setting thread name : "+t2.getName());
		System.out.println("after setting thread name : "+t3.getName());
		
		System.out.println("after setting thread priority : "+t1.getPriority());
		System.out.println("after setting thread priority : "+t2.getPriority());
		System.out.println("after setting thread priority : "+t3.getPriority());
		
		
	}

}
