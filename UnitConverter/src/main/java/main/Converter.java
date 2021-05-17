package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		int menuSelection = 0;
		Scanner scanner = new Scanner(System.in);
		while (menuSelection != 4) {
			System.out.println("Please select a single number option:\r\n"
					+ "1. Cups to Teaspoons\r\n"
					+ "2. Miles to Kilometers\r\n"
					+ "3. US Gallons to Imperial Gallons\r\n"
					+ "4. Quit\r\n");
			
			menuSelection = scanner.nextInt();
			
			System.out.println("You have selected option: " + menuSelection);
			
			switch (menuSelection) {
		    case 1:
		    	System.out.println("Cups to Teaspoons\r\n");
		    	System.out.println("Enter the value to be converted\r\n");
				int cups = scanner.nextInt();
				int cupsToTeaspoon = cups * 48;
				System.out.println(cups + " Cups equals " + cupsToTeaspoon + " Teaspoons\r\n");
		    	break;
		    case 2:
				System.out.println("Miles to Kilometer\r\n");
		    	System.out.println("Enter the value to be converted\r\n");
				int miles = scanner.nextInt();
				double milesToKilometer = miles * 1.60934;
				System.out.println(miles + " Miles equals " + milesToKilometer + " Kilometers\r\n");
		    	break;
		    case 3:
				System.out.println("US Gallons to Imperial Gallons\r\n");
		    	System.out.println("Enter the value to be converted\r\n");
				int usGallons = scanner.nextInt();
				double usGallonsToImperialGallons = usGallons * 0.832674;
				System.out.println(usGallons + " US Gallons equals " + usGallonsToImperialGallons + " Imperial Gallons\r\n");
		    	break;
		    case 4:
				System.out.println("Quiting Program\r\n");
				break;
			default:
				System.out.println("This is not a menu option\r\n");
				break;
			}
		}
		scanner.close();
	}
}
