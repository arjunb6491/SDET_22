package opportunityTest;

import org.testng.annotations.Test;

public class NewOppTest {
	@Test(groups = {"Regression","Smoke"})
	public void TC_01()
	{
	System.out.println("1st Opportunity test Script Running");
	}

	@Test(groups= {"Smoke","Regression"})
	public void TC_02()
	{
	System.out.println("2nd Opportunity test Script Running");
	}
	

	@Test(groups= "Smoke")
	public void TC_03()
	{
	System.out.println("2nd Opportunity test Script Running");
	}
	
	@Test(groups= "Regression")
	public void TC_04()
	{
	System.out.println("2nd Opportunity test Script Running");
	}
}
