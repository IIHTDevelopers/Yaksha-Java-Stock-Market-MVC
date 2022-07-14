package com.iiht.stockExchange.exceptionTestCases;
import static com.iiht.stockExchange.UtilTestClass.TestUtils.currentTest;
import static com.iiht.stockExchange.UtilTestClass.TestUtils.exceptionTestFile;
import static com.iiht.stockExchange.UtilTestClass.TestUtils.yakshaAssert;

import org.junit.Test;

public class ExceptionTest 
{
	
	@Test
	public void testException() throws Exception {
		
			
			yakshaAssert(currentTest(), true , exceptionTestFile);
		
	    
	}
}