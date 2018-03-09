package co.speedar.unit;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

import org.junit.Test;

public class QueueTest {
	@Test
	public void testPollQueueAddList() {
		Deque<Object> jobs = new LinkedBlockingDeque<Object>(1024);
		for (int i = 0; i < 5; i++) {
			jobs.add(i);
		}
		List<Object> list = new ArrayList<Object>();
		Object obj;
		while ((obj = jobs.poll()) != null) {
			list.add(obj);
		}
		for (Object o : list) {
			System.out.println(o);
		}
	}
	
	@Test
	public void testLong() {
		System.out.println(99999999999999999l);
	}
}
