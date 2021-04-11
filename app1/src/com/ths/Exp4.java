package com.ths;

public class Exp4 implements Runnable
{
		@Override
		public void run()
		{
			System.out.println("i am from run()");
		}
		
		public static void main(String[] args) {
			
			Runnable t1 = new Exp4();
			
			//t2.start();
			
			ThreadGroup tg = new ThreadGroup("Bank");
			
			Thread t2 = new Thread(tg, t1, "Transfer");
			Thread t3 = new Thread(tg, t1, "Withdraw");
			Thread t4 = new Thread(tg, t1, "credit");
			
			ThreadGroup tg1 = new ThreadGroup("maths");
			
			Thread t5 = new Thread(tg1, t1, "add" );
			Thread t6 = new Thread(tg1, t1, "sub");
			Thread t7 = new Thread(tg1, t1, "div");
			
			t2.start();
			t4.start();
			System.out.println("Bank group : "+tg.activeCount());
			t6.start();
			t7.start();
			System.out.println("Maths group : "+tg1.activeCount());
			
			System.out.println(tg);
			
		}
}
