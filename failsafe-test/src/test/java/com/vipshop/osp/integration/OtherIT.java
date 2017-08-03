package com.vipshop.osp.integration;

import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(OtherCategory.class)
public class OtherIT {
	@Test
	public void test1() {
		System.out.println("test1 in other category...");
	}
}
