package com.emp;

public class ValidateSal {
	
	public void checkSal(double sal)throws PositiveSalException, NsalException
	{
		if(sal > 0)
		{
			PositiveSalException pe = new PositiveSalException("positive sal");
			
			throw(pe);
		}
		else
		{
			NsalException ne = new NsalException("invalid salary");
			
			throw(ne);
		}
	}

}
