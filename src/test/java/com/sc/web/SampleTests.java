package com.sc.web;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class SampleTests {
	@Test
	public void testA() {
		System.out.println("A");
	}
	@Test
	public void testB() {
		System.out.println("B");
	}
	@Test
	public void testC() {
		System.out.println("C");
	}
}
