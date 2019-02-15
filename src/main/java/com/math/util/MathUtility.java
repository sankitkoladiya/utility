package com.math.util;

public class MathUtility {

	public static double pearsonCorrelationCoefficient(double[] x, double[] y) 
	{
		double sqrtOfSumOfDeviationSquareOfXY = Math.sqrt(sumOfDeviationSquare(x) * sumOfDeviationSquare(y));
		double r = sumOfDeviationXY(x, y) / sqrtOfSumOfDeviationSquareOfXY;
		return r;
	}

	private static double sumOfDeviationXY(double[] x, double[] y) {
		double meanOfX = meanOf(x);
		double meanOfY = meanOf(y);
		double sumOfDeviationXY=0.0;
		for(int index=0; index<x.length; index++)
		{
			sumOfDeviationXY += (deviation(x[index], meanOfX) * deviation(y[index], meanOfY));
		}
		return sumOfDeviationXY;
	}
	
	public static double sumOf(double[] numbers)
	{
		double finalValue = 0.0;
		for (double d : numbers) {
			finalValue += d;
		}		
		return finalValue;
	}
	
	public static double meanOf(double[] numbers)
	{
		return sumOf(numbers)/numbers.length;
	}
	
	public static double deviation(double number, double meanOfNumbers)
	{
		return number - meanOfNumbers;
	}
	
	public static double deviationSquare(double number, double meanOfNumbers)
	{
		double deviationOfNumber = deviation(number, meanOfNumbers);
		return deviationOfNumber * deviationOfNumber;
	}
	
    public static double sumOfDeviationSquare(double[] numbers)
    {
    	double sumOfDaviationSqareOfNumbers = 0.0;
    	double meanOfNumbers = meanOf(numbers);
    	for (double number : numbers) {
    		sumOfDaviationSqareOfNumbers += deviationSquare(number, meanOfNumbers);
		}    	
    	return sumOfDaviationSqareOfNumbers;
    }
    
    public static void main(String[] args)
    {
    	double[] x = {175,154,146,178,165,180};
    	double[] y = {10,9,11,11,7,10};
    	pearsonCorrelationCoefficient(x,y);
    }
}
