import java.util.Scanner;
public class BMI_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		double feet;
		double inches;
		double pounds;
		double bmi;
		double meters;
		double kg;
		
		System.out.println("What is your height in #1) feet and #2) inches?");
		System.out.println("-----------------------------------------------");
		
		System.out.println("1) Feet");
		feet = in.nextDouble();
		
		System.out.println("2) Remaining Inches");
		inches = in.nextDouble();
		
		System.out.println("What is your weight in pounds?");
		pounds = in.nextDouble();
		
		meters = ((feet + (inches / 12)) * 0.3048);
		kg = pounds / 2.205;
		bmi = kg / (meters * meters);
		
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
