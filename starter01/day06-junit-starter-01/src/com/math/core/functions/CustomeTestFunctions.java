package com.math.core.functions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomeTestFunctions {

	@Test
	public void testCustomeAddFun()
	{
		customeAdd ad=new customeAdd();
		int res=ad.addUs(new int[]{1,2,3});

		int expectedAdd= 6;
		
		assertEquals(expectedAdd,res);
	}
	
	@Test
	public void validInputAddFun()
	{
		int[] n=new int[] {1,2,3};
		assertArrayEquals(new int[]{1,2,3},n);
		
		// or check boolean 
		boolean letscheck= true;
		assertTrue(letscheck);

		boolean letscheck1= false;
		assertFalse(letscheck1);
	}
	
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	// Some other annotations
	
	@BeforeAll 
	public static void beforeAllThings()
	{
		System.out.println("beforeAll");
	}

	@BeforeEach 
	public void beforeEachThings()
	{
		System.out.println("beforeEach");
	}
	
	@Test
	public void someTest()
	{
		System.out.println("hahha...");
	}
	
	@AfterEach 
	public void afterEachThings()
	{
		System.out.println("afterEach");
	}
	
	@AfterAll 
	public static void afterAllThings()
	{
		System.out.println("afterAll");
	}
	
}
