package com.vipshop.microscope.stats.counters;

import java.util.concurrent.atomic.AtomicLong;

/**
 * A Counter simply keeps track of how many times an event occurred.
 * All operations are atomic and thread-safe.
 * 
 * @author Xu Fei
 * @version 1.0
 */
public class Counter {
	
	private AtomicLong atomicLong;
	
	public Counter() {
		this.atomicLong = new AtomicLong(0);
	}
	
	public long incr() {
		return this.atomicLong.incrementAndGet();
	}
	
	public long incr(int n) {
		return this.atomicLong.addAndGet(n);
	}
	
	public long get() {
		return this.atomicLong.get();
	}
	
	public void update(long n) {
		this.atomicLong.set(n);
	}
	
	public void reset() {
		update(0);
	}
	
	@Override
	public String toString() {
		return "Counter " + atomicLong.get();
	}
}
