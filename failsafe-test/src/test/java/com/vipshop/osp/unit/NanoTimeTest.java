package com.vipshop.osp.unit;

import java.util.concurrent.TimeUnit;

public class NanoTimeTest {
	public static long nano1;
	public static long nano2;

	public static void main(String[] args) throws Exception {
		new Thread(new Runnable() {
			@Override
			public void run() {
				nano1 = System.nanoTime();
			}
		}).start();
		// System.in.read();
		TimeUnit.SECONDS.sleep(20);
		new Thread(new Runnable() {
			@Override
			public void run() {
				nano2 = System.nanoTime();
			}
		}).start();
		System.out.println("first nano time: " + nano1);
		System.out.println("second nano time: " + nano2);
		System.out.println("time elapsed in nanos: " + (nano2 - nano1));
		System.out.println("time elapsed in millis: " + ((nano2 - nano1) / 1000000));
	}
}
