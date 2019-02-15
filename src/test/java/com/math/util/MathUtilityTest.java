package com.math.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathUtilityTest {

	double[] xCordinate = {175,154,146,178,165,180}; 
	double[] yCordinate = {10,9,11,11,7,10};
	
	@Before
	public void setUp() throws Exception {
		
	}
		
	@Test
	public void sumOf() {
		
		assertEquals(MathUtility.sumOf(xCordinate), 998.00, 0.02);
		assertEquals(MathUtility.sumOf(yCordinate), 58.00, 0.02);
	}
	
	@Test
	public void meanOf() {		    	
		
    	assertEquals(MathUtility.meanOf(xCordinate), 166.33, 0.02);
    	assertEquals(MathUtility.meanOf(yCordinate), 9.66, 0.02);
	}
	
	
	@Test
	public void deviation() {		
    	
    	assertEquals(MathUtility.deviation(xCordinate[0], MathUtility.meanOf(xCordinate)),8.66,0.02);
    	assertEquals(MathUtility.deviation(yCordinate[0], MathUtility.meanOf(yCordinate)),0.33,0.02);    	
	}
	
	@Test
	public void sumOfDeviationSquare() {
		    	
    	assertEquals(MathUtility.sumOfDeviationSquare(xCordinate),965.33,0.02);
    	assertEquals(MathUtility.sumOfDeviationSquare(yCordinate),11.33,0.02);
    	assertEquals(MathUtility.pearsonCorrelationCoefficient(xCordinate,yCordinate),0.0733,0.02);
	}
	
	@Test
	public void pearsonCorrelationCoefficient() {
		
    	assertEquals(MathUtility.pearsonCorrelationCoefficient(xCordinate,yCordinate),0.0733,0.02);
	}			
	
}
