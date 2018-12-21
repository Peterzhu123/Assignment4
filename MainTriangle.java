// Created by Peter
// Created on Dec
// This is a program about Triangle

import java.util.Scanner;

public class MainTriangle {

	public static void main(String[] args) {
		
		System.out.println("This is a programe about Triangle. You can only choose  options below and give values \n ");
		System.out.println("(SSS SAS SSA ASA AAS )\n");
		
		// Get type 
		System.out.println("Which one do you want to choose? ");
		Scanner scannerType = new Scanner(System.in);
		String userType = scannerType.nextLine();
		
		// Get first info
		System.out.println("Enter the value of the first information ");
		Scanner scannerFirstInfo = new Scanner(System.in);
		double userFirstInfo = scannerFirstInfo.nextDouble();
		
		// Get second info
		System.out.println("Enter the value of the second information ");
		Scanner scannerSecondInfo = new Scanner(System.in);
		double userSecondInfo = scannerSecondInfo.nextDouble();
				
		// Get third info
		System.out.println("Enter the value of the third information ");
		Scanner scannerThirdInfo = new Scanner(System.in);
		double userThirdInfo = scannerThirdInfo.nextDouble();		
		
		Triangle triangle = new Triangle(userType, userFirstInfo, userSecondInfo, userThirdInfo);
		System.out.println("The triangle perimeter is " + triangle.perimeter());
		System.out.println("The triangle area is " + triangle.area());
		System.out.println("The triangle height is " + triangle.height());
		System.out.println("The triangle inscribedCircleRadius is " + triangle.inscribedCircleRadius());
		System.out.println("The triangle areaOfTheCircumcircle is " + triangle.areaOfTheCircumcircle());

	}

}
