package com.vipshop.osp.integration;

import org.junit.Test;
import org.junit.experimental.categories.Category;
@Category(ITInSuite.class)
public class SuiteIT2 extends BaseIT4Suite {
	@Test
	public void normal2() {
		System.out.println("suite 2...");
		baseMethod();
	}
}
