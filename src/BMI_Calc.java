import java.util.Scanner;
public class BMI_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		//variables
		double feet;
		double inches;
		double pounds;
		double bmi;
		double meters;
		double kg;
		
		// This prompts the user for the height
		System.out.println("What is your height in #1) feet and #2) inches?");
		System.out.println("-----------------------------------------------");
		
		//asks for feet
		System.out.println("1) Feet");
		feet = in.nextDouble();
		
		//asks for the inches left over
		System.out.println("2) Remaining Inches");
		inches = in.nextDouble();
		
		//asks for weight
		System.out.println("What is your weight in pounds?");
		pounds = in.nextDouble();
		
		//metric conversions
		meters = ((feet + (inches / 12)) * 0.3048);
		kg = pounds / 2.205;
		
		//bmi calculation
		bmi = kg / (meters * meters);
		
		
		// if/else to give different answers based on the bmi calculated
		if (0 < bmi && bmi < 19) {
			
			System.out.println("Your BMI is " +String.format("%.1f", bmi)+ ". This is classified as underweight.");	
			
		} else if (19 <= bmi && bmi <= 24.9) {
			
			System.out.println("Your BMI is " +String.format("%.1f", bmi)+ ". This is classified as normal/healthy weight.");
			
		} else if (25 <= bmi && bmi <= 29.9) {
			
			System.out.println("Your BMI is " +String.format("%.1f", bmi)+ ". This is classified as overweight.");
			
		} else if (30 <= bmi && bmi <= 39.9) {
			
			System.out.println("Your BMI is " +String.format("%.1f", bmi)+ ". This is classified as obese.");
			
		} else if (40 <= bmi) {
			
			System.out.println("Your BMI is " +String.format("%.1f", bmi)+ ". This is classified as extremely obese.");
			
		}
		

	}

}
