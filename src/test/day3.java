package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before executing any methods in the class");
	}
	
	@Parameters({"URL","APIKey/usrname"})
	
	@Test
	public void weblogincarloan(String urlname, String key)
	{
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("I will execute before every method in day3 class");
	}
	
	@AfterMethod
	public void afterevery()
	{
		System.out.println("I will execute after every method in day3 class");
	}
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("after executing all the methods in the class");
	}
	
	@Test(groups= {"Smoke"})
	public void mobilelogincarloan()
	{
		System.out.println("mobilelogincar");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	
	@Test(enabled=false)
	public void mobilesignincarloan()
	{
		System.out.println("mobilesignincar");
	}
	
	@Test(dataProvider="getData")
	public void mobilesignoutcarloan(String username,String password)
	{
		System.out.println("mobilesignoutcar");
		System.out.println(username);
		System.out.println(password);
		
		
	}
	
	@Test(dependsOnMethods= {"weblogincarloan"})
	public void APIcarloan()
	{
		System.out.println("APIlogincar");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}

}
