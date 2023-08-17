package MavPack.ProjMav;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	
	SoftAssert softassert = new SoftAssert();
	
  //@Test
  public void f() {
  }
  
  @Test(priority=1, groups="smoke")
  public void createUser() {
	  System.out.println("Hello World");
	  
	  System.out.println("Before assert");
	  Assert.assertTrue(4>3, "Verfifying condition");
	  
	  System.out.println("After assert-1");
	  
	  String expected = "abc";
	  String actual = "abc";
	  Assert.assertEquals(expected, actual);
	  
	  System.out.println("After assert-1");
	  
	  
  }
  
  //dependsonmethods indicate that the failure on createuser will skip this method
  
  @Test(priority=2, dependsOnMethods="createUser")
  public void editUser() {
	  System.out.println("Before assert-2");
	  softassert.assertTrue(4>3,"Verifying");
	  
	  System.out.println("After assert-2");
	  
	  
	  softassert.assertAll();
  }
  
  @Test(priority=3, dependsOnMethods="editUser")
  public void deleteUser() {
	  System.out.println("Before assert-3");
	  softassert.assertTrue(4>3, "Verifying");
	  
	  System.out.println("After assert-3");
	  
	  softassert.assertAll();
	  
	  
	  
	  
	  
	  
	  
  }
}
