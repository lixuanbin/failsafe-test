package co.speedar.integration;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SuiteIT.class, SuiteIT2.class })
public class ITSuite extends BaseIT4Suite {
	@BeforeClass
	public static void beforeClass() throws IOException {
		System.out.println("test suite before class...");
		BaseIT4Suite.setup();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("test suite after class...");
		BaseIT4Suite.teardown();
	}
}
