package com.ths;

class Exp3
{
	public void dataInc()
	{
		for(int i = 0; i<= 10; i++)
		{
			System.out.println(i);
			
		}
	}
	
	public void dataDec() {
		
		for(int i = 10; i>= 0; i--)
		{
			System.out.println(i);
		}
	}
}

public class Exp2 implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			Exp3 e = new Exp3();
			e.dataInc();
			Thread.sleep(3000);
			e.dataDec();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		Exp2 t1 = new Exp2();
		
		Thread t2 = new Thread(t1);
		
		t2.start();
		
	}
}
