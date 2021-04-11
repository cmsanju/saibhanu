package p2;

import p1.Data;

public class Exp3 {
	
	Data d = new Data();
	
	public void disp()
	{
		//System.out.println(d.pin);
		//System.out.println(d.wifiP);
		//System.out.println(d.city);
		System.out.println(d.state);
	}
}

class Exp4 extends Data
{
	public void disp()
	{
		//System.out.println(pin);
		//System.out.println(wifiP);
		System.out.println(city);
		System.out.println(state);
	}
}

