package com.ths;

 class Item {
	
	public boolean valSet = false;
	public int val;
	
	synchronized void putItem(int i)
	{
		try {
		
			if(valSet)
			{
				wait();
			}
			
			val = i;
			
			System.out.print("producer produced one item --> "+val);
			
			notify();
			
			valSet = true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	synchronized void getItem()
	{
		try
		{
			if(!valSet)
			{
				wait();
			}
			
			System.out.println(" :: consumer consumed one item --> "+val);
			
			notify();
			
			valSet = false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
class Producer extends Thread
{
	Item item;
	int i;
	
	public Producer(Item item)
	{
		this.item = item;
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				item.putItem(++i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Consumer extends Thread
{
	Item item;
	
	public Consumer(Item item)
	{
		this.item = item;
	}
	
	public void run()
	{
		try
		{
			while(true)
			{
				item.getItem();
				Thread.sleep(500);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class ITCDemo
{
	public static void main(String[] args) {
		
		Item item = new Item();
		
		Producer p = new Producer(item);
		Consumer c = new Consumer(item);
		
		p.start();
		c.start();
		
	}
}
