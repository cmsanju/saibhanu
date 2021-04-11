package com.test;

class Super extends Exception
{
	 public void someMethod()
	    {
	        Super thing = new Sub();
	        try
	        {
	            thing.someMethod();
	        }
	        catch(Exception ex)
	        {
	            System.out.println("Exception caught: " + ex.getMessage());
	        }
	    }
}

public class Sub extends Super {
 public void someMethod() //throws Exception          
   { 
	 System.out.println("child class"); 
   }

 public static void main(String[] args)
 {
  try {
   Super s=new Sub();
   s.someMethod();
   }
 // catch(Sub e){}
  //catch(Super s) {}
  catch (Exception e) {
	
}
 }
}
