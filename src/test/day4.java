package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URL"})
	
	@Test
	public void webloginhomeloan(String uname)
	{
		System.out.println("webloginhome");
		System.out.println(uname);
	}
	
	@Test(groups= {"Smoke"})
	public void mobileloginhomeloan()
	{
		System.out.println("mobileloginhome");
	}
	
	@Test
	public void loginAPIhomeloan()
	{
		System.out.println("APIloginhome");
	}

}
