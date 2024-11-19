
public class PAssign07 {
	public static void main(String[] args) {
		
		double sum = 0.0;
		double average = 0.0;
		
		double[] tanks = { 1, 2, 3, 4, 5, 6, 7 };
		
		/* average needs to be computed and then values assigned
		 * to each element of the array. how to do this?
		 * 
		 *  calculate and store sum, store sum doubleo each array element as the
		 *  array is iterated through
		 *  */
		
		for (int i = 0; i < tanks.length; i++) {
		    sum += tanks[i];
		    average = sum / tanks.length;
		}
		
		for (int i = 0; i < tanks.length; i++) {
			tanks[i] = average;
			System.out.println(tanks[i]);
		}
		
		
		
		
		
	}	

}
