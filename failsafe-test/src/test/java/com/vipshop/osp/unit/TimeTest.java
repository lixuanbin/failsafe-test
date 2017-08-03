package com.vipshop.osp.unit;

public class TimeTest {
	private static final int ONE_MILLION = 1000000;
	private static final int HALF_MILLION = 499999;

	public static void main(String[] args) {
		long start = System.nanoTime();
		long base = System.currentTimeMillis() - (start / ONE_MILLION);

		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// Don't care if we're interrupted
			}
			long now = System.nanoTime();
			long drift = System.currentTimeMillis() - (now / ONE_MILLION) - base;
			long interval = (now - start + HALF_MILLION) / ONE_MILLION;
			System.out.println(
					"Clock drift " + drift + " ms after " + interval + " ms = " + (drift * 1000 / interval) + " ms/s");
		}
	}
}