import java.util.Scanner;

/**
 * Laura Davis CIS 260 903
 * This program calculates either voltage, amps, or resistance of a circuit
 * based on user input using the formula v = i * r. The calculations are then displayed. 
 * A while loop is used to re-run the program. 
 *
 */

public class OhmsLaw 
{
	public static void main(String[] args)
	{
		//declare variables
		double voltage, amps, resistance;
		String again, input;
		
		again = "y";
		
		while (again.equalsIgnoreCase("y"))
		{
		
			Scanner keyboard = new Scanner(System.in);
		
			System.out.println("Which do you want to calculate? v = voltage i = amps r = resistance");
			input = keyboard.nextLine();

		
				if (input.equalsIgnoreCase("v"))
				{
					voltage();
				}
				else if (input.equalsIgnoreCase("i"))
				{
					amps();
				}
				else if (input.equalsIgnoreCase("r"))
				{
					resistance();
				}
				else 
				{
					System.out.println("Invalid character.");
				}
			
		
			System.out.println("Would you like to calculate more values? y/n");
			again = keyboard.nextLine();
		
		}
	}//end of main

	public static void voltage()
	{
		//declare variables
		double v, i, r;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter amps: ");
		i = keyboard.nextDouble();
		
		System.out.println("Enter resistance: ");
		r = keyboard.nextDouble();
		
		v = i * r;
		
		System.out.println("v = " + v + "\ni = " + i + "\nr = " + r);
	}//end of voltage
	
	public static void amps()
	{
		//declare variables
		double v, i, r;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter voltage: ");
		v = keyboard.nextDouble();
		
		System.out.println("Enter resistance: ");
		r = keyboard.nextDouble();
		
		i = v / r;
		
		System.out.println("v = " + v + "\ni = " + i + "\nr = " + r);
	}//end of amps
	
	public static void resistance()
	{
		//declare variables
		double v, i, r;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter amps: ");
		i = keyboard.nextDouble();
		
		System.out.println("Enter voltage: ");
		v = keyboard.nextDouble();
		
		r = v / i;
		
		System.out.println("v = " + v + "\ni = " + i + "\nr = " + r);
	}//end of resistance
	
}//end of class
