/*Chloe Xu
 * August 29, 2019
 * Period 4
 * Group of Methods that perform math calculations (a library)
 */
public class Calculate {
	// a call to square returns the square of the value passed
	public static int square(int number) {
		int answer=0;
		answer = number*number;
		return answer;
	}
	//a call to cube returns the square of the value passed
	public static int cube(int number) {
		int answer=0;
		answer = number*number*number;
		return answer;
	}
	//a call to average returns the average of the value passed
	public static double average(double number1, double number2) {
		double answer=0;
		answer = (number1+number2/2);
		return answer;
	}
	//another average method that accepts three doubles and returns a double
	public static double average(double number1, double number2, double number3) {
		double answer=0;
		answer = (number1+number2+number3/3);
		return answer;
	}
	//a call to toDegrees converts an angle measure given in radians into degrees
	public static double toDegree(double number) {
		double answer=0;
		answer = (number*(180/3.14159));
		return answer;
	}
	//a call toRadians converts an angle measure given in degrees into radians
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
	//a call toImproperFrac converts mixed number (with its pieces provided separately in the whole number, numeratpr, then denominator) into an improper fraction
	public static String toImproperFrac (int whole, int num, int den) {
		int answer=0; 
		answer = ((whole*den)+num);
		return answer + "//" + den;
	}
	//a call toMixedNum converts an improper fraction (with its pieces provided separately in the order numerator then denominator)into a mixed number
	public static String toMixedNum(int num, int den) {
		int whole = num/den;
		int rem =  num%den;
		return whole + "_" + rem + "//" + den;
	}
	//a call to foil converts a binomial multiplication of the form (ax + b)(cx+d) into quadratic equation of the form ax^2 + bx + c, accepts a four integers and a String and then returns a String.
	public static String foil(int a, int b, int c, int d, String var) {
		int A = a*c;
		int B = (a*d)+(b*c);
		int C = b*d;
		return A + var + "^2" + " " + "+" + " " + B + "n" + " " + "+" + " " + C;
	}
	//a call to isDivisibleBy determines whether or not one integer is evenly divisible by another, accepts two integers and returns a boolean.
	public static boolean isDivisibleBy(int number1, int number2) {
		if(number1%number2==0) {
			return true;
		} else {
			return false;
		}
	}
	//a call to absValue returns the absolute value of the number passed, method accepts a double and returns a double.
	public static double absValue(double number1) {
		if (number1<0) { 
			return number1*-1;
		} else {
			return number1;
		}
	}
	//a call to max returns the larger of the values passed, accepts two doubles and returns a double.
	public static double max(double number1, double number2) {
		if (number1>=number2) {
			return number1;
		} else {
			return number2;
		}
	}
	//overload of max method, accepts three doubles and returns a double 
	public static double max(double number1, double number2, double number3) {
		if (number1>=number2 && number1>=number3) {
			return number1;
		} else if (number2>=number1 && number2>=number3) {
			return number2;
		} else {
			return number3;
		}
	}
	//a call to min returns the smaller of the values passed, accepts two integers and returns an int.
	public static double min(double number1, double number2) {
		if (number1<=number2) {
			return number1;
		} else {
			return number2;
		}
	}
	//a call to round2 rounds a double correctly to 2 decimal places and returns a double
	public static double round2(double decimal) {
		double number=decimal;
		number = number *100;
		if (decimal>0) {
			number = number+0.5;
		} else {  
		number = number-0.5;
		}
		number = (int)number;
		number =  number/100;
		return number;
	}
	//a call to exponent raises a value to a positive integer power, accepts a double and an integer and returns a double, exponent is positive 
	public static double exponent(double value, int exp) {
		double answer = value;
		if (exp<0) {
			throw new ArithmeticException("Invalid Argument");
		}
			for (int i = 0; i < exp - 1; i++) {
				answer *= value;
			} return answer;
	}
	//a call to factorial returns the factorial of the value passed, accepts an integer and returns an integer, exponent is positive
	public static int factorial(int num1) {
		int result = 1;
			for (int i=1; i<=num1; i++) {
				result*= i;
			}
		return result;
	}
	//a call to isPrime determines whether or not an integer is prime, accepts an integer and returns a boolean
	public static boolean isPrime(int num) {
		for (int i=2; i <num; i++) {
			if (isDivisibleBy(num,i)) {
				return false;
			}
		}
	return true;
	}
	//a call to gcf finds greatest common factor of two integers, accepts two positive integers and returns an integer
	public static int gcf(int num1, int num2) {
		int output = 1;
		for(int i = 1; i <=num1; i+=1) {
			if(isDivisibleBy(num1, i) && isDivisibleBy (num2,i)) {
				output = i;
			}
		}
		return output;
	}
	//a call to sqrt returns an approximation of the square root, accepts a double and returns a double, rounds to hundredth place
	public static double sqrt(double num) {
		if(num<0) {
			throw new ArithmeticException("Invalid Argument");
		}
		double output = 1;
		while(!(absValue(num - output*output) < 0.005)){
			output = 0.5*(num/output + output);
		}
		return round2(output);
	}
	//uses coefficients of a quadratic equation in standard form, uses quadratic formula to approximate real roots, accepts three integers, returns a String
	public static String quadForm( int a, int b, int c) {
		double discriminant = toDiscriminant(a, b, c);
		if(discriminant < 0){
			return "no real roots";
		} else if(discriminant == 0){
			return round2(-b/2*a) + "";
		} else {
			double root1 = round2((-b+sqrt(discriminant))/(2.0*a));
			double root2 = round2((-b-sqrt(discriminant))/(2.0*a));
			return min(root1,root2) + " and " + max(root1,root2);
		}
	}
}