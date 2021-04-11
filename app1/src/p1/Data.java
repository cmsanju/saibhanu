package p1;

public class Data {
	
	private int pin = 1010;
	
	        int wifiP = 2345;
	        
   protected String city = "mpl";
   
   public String state = "ap";
   
   public void disp()
   {
	   System.out.println(pin);
	   System.out.println(wifiP);
	   System.out.println(city);
	   System.out.println(state);
   }
   
}

class Exp2 extends Data
{
	public void disp()
	{
		//System.out.println(pin);
		System.out.println(wifiP);
		System.out.println(city);
		System.out.println(state);
	}
}
