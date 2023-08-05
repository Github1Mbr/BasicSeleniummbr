package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency10 {
@Test
public void createCustomer()
{
	//purposefully fail the test script
	Assert.fail();//assert(class name for validation)//purposefully need to fail it will used for analysis the failours  
	System.out.println("Create new Customer");
	}
@Test(dependsOnMethods = "createCustomer")//modify is depended on create
public void modifyCustomer()
{
	System.out.println("Customer Modification");
	}
@Test
public void deleteCustomer()
{
	System.out.println("Delete Customer");
	}
}


