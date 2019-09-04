/*Chloe Xu
 * August 29, 2019
 * Period 4
 * Group of Methods that perform math calculations (a library)
 */
public class Calculate {
	//a call to square returns the square of the value passed. The method accepts an integer and returns an integer//
	public static int square(int number) {
		int answer=0;
		answer = number*number;
		return answer;
	}
	//a call to cube returns the square of the value passed. The method accepts an integer and returns an integer//
		public static int cube(int number) {
			int answer=0;
			answer = number*number*number;
			return answer;
	}
	//a call to average returns the average of the value passed. The method accepts two doubles and returns a double//
			public static double average(double number1, double number2) {
				double answer=0;
				answer = (number1+number2/2);
				return answer;
	}
}