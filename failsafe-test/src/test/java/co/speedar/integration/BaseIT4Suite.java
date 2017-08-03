package co.speedar.integration;

import org.junit.experimental.categories.Category;

@Category(ITInSuite.class)
public class BaseIT4Suite {
	public static void setup() {
		System.out.println("BaseIT4Suite before class...");
	}

	public static void teardown() {
		System.out.println("BaseIT4Suite after class...");
	}

	public void baseMethod() {
		System.out.println("running suite base method...");
	}
}
