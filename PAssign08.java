
import java.util.Scanner;

public class PAssign08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Input number of elements for array: ");
		int userArraySize = input.nextInt();

		int[] userArray = new int[userArraySize];
		int maximum = userArray[0];
		int minimum = userArray[0];
		int sum = 0;

		for (int i = 0; i < userArray.length; i++) {
			System.out.printf("Input an element for array, element %d of %d:\n", i, userArray.length);
			userArray[i] = input.nextInt();
			
			if (userArray[i] > maximum) {
				maximum = userArray[i];
			}
			
			if (userArray[i] < minimum) {
				minimum = userArray[i];
			}
			
		}
		
		System.out.printf("The minimum is %d and the maximum is %d", minimum, maximum);

	}
}
