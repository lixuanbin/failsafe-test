package co.speedar.integration;

import org.junit.Test;
import org.junit.experimental.categories.Category;
@Category(ITInSuite.class)
public class SuiteIT extends BaseIT4Suite {
	@Test
	public void normal2() {
		System.out.println("suite 1...");
		baseMethod();
	}
}
