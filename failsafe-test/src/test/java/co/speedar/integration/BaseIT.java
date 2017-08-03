package co.speedar.integration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;
@Category(ITNotInSuite.class)
public class BaseIT {
	@BeforeClass
	public static void setup() {
		System.out.println("BaseIT before class...");
	}

	@AfterClass
	public static void teardown() {
		System.out.println("BaseIT after class...");
	}
	
	public void baseMethod() {
		System.out.println("running base method...");
	}
}
