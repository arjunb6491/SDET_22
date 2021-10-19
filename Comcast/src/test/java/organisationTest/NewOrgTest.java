package organisationTest;

import org.testng.annotations.Test;

public class NewOrgTest {
	@Test(groups= {"Regression"})
	public void TC_01()
	{
	System.out.println("1st Organization test Script Running");
	}

	@Test(groups= {"Smoke"})
	public void TC_02()
	{
	System.out.println("2nd Organization test Script Running");
	}
}
