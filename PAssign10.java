/**
* File: PAssign10.java
* Class: CSCI 1301
* Author: Nicholas Hubbard
* Created on: November 19, 2024
* Last Modified: November 19, 2024
* Description: Calculates volume from array of shipping container dimensions.
* Determines whether or not container will be shipped based on weight.
*/

public class PAssign10 {
	public static void main(String[] args) {

		// Dimensions measured in centimeters
		double[][] shippingContainers = { { 47.19, 39.19, 36.50 }, { 59.25, 59.25, 54.50 }, { 47.25, 29.25, 29.50 },
				{ 23.19, 19.20, 19.50 }, { 17.33, 17.33, 17.50 }, { 83.19, 47.25, 42.50 }, { 23.33, 19.33, 19.50 },
				{ 31.25, 23.25, 23.50 }, { 29.33, 29.33, 24.50 }, { 23.19, 23.19, 23.19 }, { 35.19, 35.19, 30.50 },
				{ 47.19, 44.19, 29.50 }, { 40.19, 27.88, 20.00 }, { 59.19, 47.19, 42.50 }, { 47.19, 47.19, 22.50 },
				{ 39.33, 39.33, 34.50 }, { 47.25, 29.25, 29.50 }, { 35.19, 21.19, 16.50 }, { 11.33, 11.33, 11.50 },
				{ 47.19, 39.19, 29.50 }, { 47.19, 47.19, 42.50 }, { 66.19, 29.20, 25.00 }, { 57.19, 41.19, 40.50 },
				{ 59.25, 59.25, 42.50 }, { 71.25, 47.25, 42.50 } };

		printShippable(shippingContainers);

	}

	public static void printShippable(double[][] array) {

		// Declare single dimension array to eventually store volume calculation
		double[] containerVolumeInches = new double[array.length];
		
		// Conversion factor for centimeters to inches
		double inchConversion = 0.3937007874;

		// Convert centimeters into inches, calculate volume, store result into declared
		// array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] *= inchConversion;
				containerVolumeInches[i] = array[i][0] * array[i][1] * array[i][2];
			}
		}
		
		// Iterate through volume array, determine if conditions are met and index
		for (int i = 0; i < containerVolumeInches.length; i++) {

			if (containerVolumeInches[i] >= 2000 && containerVolumeInches[i] <= 7000) {
				System.out.printf("Container %d (%,.2f in^3) can be shipped%n", i, containerVolumeInches[i]);
			}

		}
	}
}
