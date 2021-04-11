package com.test;

public class Pravalia {
	
	public static void main(String[] args) {
		
		try
		{
		String str = "java";
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		
		System.out.println(str.charAt(5));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		catch(Throwable tt)
		{
			tt.getStackTrace();
		}
	}
}
