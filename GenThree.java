/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args)
	{
		int a, b,tempmin, min, max;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		min = Math.min(a,b);
		max = Math.max(a,b);
		int randomNum1 = min + (int)(Math.random() * ((max - min) + 1));
		int randomNum2 = min + (int)(Math.random() * ((max - min) + 1));
		int randomNum3 = min + (int)(Math.random() * ((max - min) + 1));
		tempmin = Math.min(randomNum1,randomNum2);
		min = Math.min(randomNum3,tempmin);
		System.out.println(randomNum1);
		System.out.println(randomNum2);
		System.out.println(randomNum3);
		System.out.println("The minimal generated number was " +min);
	}
}
