/*Chloe Xu
 * August 29, 2019
 * Period 4
 * Call various math functions from the Calculate library
 * Client code
 */
public class DoMath {
	
	public static void main(String[]args) {
		System.out.println(Calculate.square(-12));
		System.out.println(Calculate.cube(-12));
		System.out.println(Calculate.average(3,4));
		System.out.println(Calculate.average(5,4,3));
		System.out.println(Calculate.toDegree(3));
		System.out.println(Calculate.toRadian(180));
		System.out.println(Calculate.toDiscriminant(3,2,1));
		System.out.println(Calculate.toImproperFrac(3,5,4));
		System.out.println(Calculate.toMixedNum(9,2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(9,3));
		System.out.println(Calculate.absValue(-3));
		System.out.println(Calculate.max(4,6));
		System.out.println(Calculate.max(4,5,9));
		System.out.println(Calculate.min(3,7));
		System.out.println(Calculate.exponent(2,2));
		System.out.println(Calculate.factorial(3));
		System.out.println(Calculate.isPrime(7));
		System.out.println(Calculate.gcf(3,9));
		System.out.println(Calculate.sqrt(4));
		System.out.println(Calculate.round2(-38.278));
		System.out.println(Calculate.quadForm(3,4,5));

	}

}
