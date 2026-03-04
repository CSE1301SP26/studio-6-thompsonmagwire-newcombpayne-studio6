package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
		if(n==0) {
			return 0;
		} else {
			return Math.pow(.5,n)+ geometricSum(n-1);
		}
			// FIXME compute the geometric sum for the first n terms recursively
			
		
	}

	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius, double radiusMinimumDrawingThreshold) {
		if (radius <= radiusMinimumDrawingThreshold) {
			return;
		} else {
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter, yCenter-radius,radius/3,radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter, yCenter+radius,radius/3,radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter-radius, yCenter,radius/3,radiusMinimumDrawingThreshold);
			circlesUponCircles(xCenter+radius, yCenter,radius/3,radiusMinimumDrawingThreshold);
		}
		// FIXME complete the recursive drawing
	}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int index =0;
		int[] reversed = new int[array.length];
		return helperToReversed(array, reversed, index);
			// FIXME create a helper method that can recursively reverse the given array
			
		
	}

	public static int[] helperToReversed(int[] array, int[] reversed, int index) {
		
		
		int lastIndex = array.length-1;
		if (index == (array.length+1)/2) {
			return reversed;
		} else {
			int mirrorIndex= lastIndex-index;
			reversed[index]= array[mirrorIndex];
			reversed[mirrorIndex]= array[index];
			return helperToReversed(array, reversed, index+1);
		}
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (q==0) {
			return p;
		} else {
			int temp =q;
			q =p%q;
			p=temp;
			return gcd(p,q);
		}
			// FIXME compute the gcd of p and q using recursion
			
		
	}


}