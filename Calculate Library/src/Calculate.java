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
	//another average method that accepts three doubles and returns a double//
	public static double average(double number1, double number2, double number3) {
		double answer=0;
		answer = (number1+number2+number3/3);
		return answer;
	}
	//a call to toDegrees converts an angle measure given in radians into degrees. The method accepts a double and returns a double//
	public static double toDegree(double number) {
		double answer=0;
		answer = (number*(180/3.14159));
		return answer;
	}
	//a call toRadians converts an angle measure given in degrees into radians. The method accepts a double and returns a double.
	public static double toRadian(int number) {
		double answer=0;
		answer = (number*(3.14159/180));
		return answer;
	}
	//a call to discriminant provides the coefficients of a quadratic equation in standard form (a, b, and c) and returns the value of the discriminant
	public static double toDiscriminant(double number1, double number2, double number3) {
		double answer=0;
		answer = ((number2*number2)+(-4*number1*number3));
		return answer;
	}
	//a call toImproperFrac converts mixed number (with its pieces provided separately in the whole number, numeratpr, then denominator) into an improper fraction. The method accepts a three integers and returns a String.
	public static String toImproperFrac (int whole, int num, int den) {
		int answer=0; 
		answer = ((whole*den)+num);
		return answer + "//" + den;
	}
	//a call toMixedNum converts an improper fraction (with its pieces provided separately in the order numerator then denominator)into a mixed number. The method accepts a two integers and returns a String.
	public static String toMixedNum(int num, int den) {
		int whole = num/den;
		int rem =  num%den;
		return whole + "_" + rem + "//" + den;
	}
	//a call to foil converts a binomial multiplication of the form (ax + b)(cx+d) into quadratic equation of the form ax^2 + bx + c. The method accepts a four integers and a String and then returns a String.
	public static String foil(int a, int b, int c, int d, String var) {
		int A = a*c;
		int B = (a*d)+(b*c);
		int C = b*d;
		return A + var + "^2" + " " + "+" + " " + B + "n" + " " + "+" + " " + C;
	}
	//a call to isDivisibleBy determines whether or not one integer is evenly divisible by another. The method accepts two integers and returns a boolean.
	public static boolean isDivisibleBy(int number1, int number2) {
		if(number1%number2==0) {
			return true;
		} else {
			return false;
		}
	}
	//a call to absValue returns the absolute value of the number passed. The method accepts a double and returns a double.
	public static double absValue(double number1) {
		if (number1<0) { 
			return number1*-1;
		} else {
			return number1;
		}
	}
	//a call to max returns the larger of the values passed. The method accepts two doubles and returns a double.
	public static double max(double number1, double number2) {
		if (number1>=number2) {
			return number1;
		} else {
			return number2;
		}
	}
	//overload of max method. This one accepts three doubles and returns a double 
	public static double max(double number1, double number2, double number3) {
		if (number1>=number2 && number1>=number3) {
			return number1;
		} else if (number2>=number1 && number2>=number3) {
			return number2;
		} else {
			return number3;
		}
	}
	//a call to min returns the smaller of the values passed. The method accepts two integers and returns an int.
	public static int min(int number1, int number2) {
		if (number1<=number2) {
			return number1;
		} else {
			return number2;
		}
	}
	//a call to round2 rounds a double correctly to 2 decimal places and returns a double
	public static double round2(double decimal) {
		double number;
		number = absValue(decimal);
		number = number*100;
		number = number+0.5;
		number = (int)number;
		number =  number/100;
		return number;
	}
		
}