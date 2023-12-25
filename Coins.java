/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args)
	{
		int a; //quarter
		int b; //cent
		//int temp;
		int input = Integer.parseInt(args[0]);
		a = input/25;
		//temp = input%25;
		b = input%25;
		//System.out.println("Use"+" "+ a +" "+ "quarters and" +" "+ b +" "+ "cents");
		//System.out.println("Use"+" "+ a +" "+ "quarters"+" "+"and" +" "+ b +" "+ "cents");
		System.out.println("Use" + " " + a + " " + "quarters" + " " + "and" + " " + b +" " + "cents");
		//Use 5 quarters and 7 cents
	}
}
