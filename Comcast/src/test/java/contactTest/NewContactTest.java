package contactTest;

import org.testng.annotations.Test;

public class NewContactTest {
@Test(groups= "Smoke")
public void TC_01()
{
System.out.println("1st Contact test Script Running");
}

@Test(groups= "Regression")
public void TC_02()
{
System.out.println("2nd Contact test Script Running");
}
}
