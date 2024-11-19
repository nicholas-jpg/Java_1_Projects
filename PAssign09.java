/**
* File: PAssign09.java
* Class: CSCI 1301
* Author: Nicholas Hubbard
* Created on: November 12, 2024
* Last Modified: November 12, 2024
* Description: Using a formula, determines properties to kept and donated.
* Prints descriptive statistics for properties before and after donations.
*/


public class PAssign09 {
	public static void main(String[] args) {

		// Both arrays in USD
		double[] aptCost = { 21500, 29275, 37250, 35322, 19757, 24625, 30300, 18759, 15217, 27090, 12439, 22005 };
		double[] aptRevenue = { 26752, 21421, 39759, 24783, 15297, 25264, 32159, 16157, 21705, 19420, 18275, 21350 };

		// Running totals of costs and revenues
		double sumCost = 0;
		double sumRevenue = 0;

		// Running total of costs after determining donations
		double sumCostAfterDonation = 0;
		double sumRevenueAfterDonation = 0;
		double sumDonatedIncome = 0;

		// Array to store results from keepProperty method
		boolean[] propertyDecision = new boolean[aptCost.length];

		// Use for loop to pass array values through method and tabulate sums.

		for (int i = 0; i < aptCost.length; i++) {
			boolean decision = keepProperty(aptCost[i], aptRevenue[i]);
			propertyDecision[i] = decision;
			sumCost += aptCost[i];
			sumRevenue += aptRevenue[i];
			
			// Store cost and revenue of kept properties. Store sum of value of donated properties.
			if (propertyDecision[i] == true) {
				sumCostAfterDonation += aptCost[i];
				sumRevenueAfterDonation += aptRevenue[i];
			} else {
				sumDonatedIncome += aptRevenue[i];
			}

		}

		System.out.printf(
			    "Total maintenance/renovation before donation: $%,.2f%n" +
			    "Total rental income before donation: $%,.2f%n%n" +
			    "Total maintenance/renovation after donation: $%,.2f%n" +
			    "Total rental income after donation: $%,.2f%n%n" +
			    "Total Donated Rental Income: $%,.2f%n%n",
			    sumCost, sumRevenue, sumCostAfterDonation, sumRevenueAfterDonation, sumDonatedIncome
			);

		// Pass decision array to be printed
		printDecisions(propertyDecision);

	}

	// Takes annual property revenue and cost, returns true to keep and false to
	// donate.
	public static boolean keepProperty(double yearlyCost, double yearlyRevenue) {

		boolean doKeepProperty = false;

		// Property is donated if the costs over 4.75 years < 1/2 of 10.25 yearly
		// revenue
		if (yearlyCost * 4.75 < yearlyRevenue * 10.25 * 1 / 2) {
			doKeepProperty = true;
			return doKeepProperty;

		} else {
			return doKeepProperty;
		}
	}

	public static void printDecisions(boolean[] decision) {

		for (int i = 0; i < decision.length; i++) {
			if (decision[i] == true) {
				System.out.printf("Property %d - keep%n", i);
			} else {
				System.out.printf("Property %d - donate%n", i);
			}

		}

	}
}
