/*
 * LOGOS It Academy home work 23
 * Task 1
 * 
 * */

package ua.lgs.homeworkRada;

import java.util.Scanner;

/**
 * This program demonstrates how to use Stream and Lambda expressions.
 * All methods with Streams are created in Class - FactionStream.
 * @author Oleksandr
 * 
 * */

public class MainStream {

	public static void main(String[] args) {
	
		RadaStream rada = RadaStream.getInstance("Rada I");
			
		Scanner number = new Scanner(System.in);
				 
		while(true) {

			menu();

			switch(number.nextInt()) {

			case 1:{
				System.out.println("Enter fraction to add in Rada:");
				Scanner fraction1 = new Scanner(System.in);
				String fractionName = fraction1.nextLine();

				int numberOfDeputy = 5 +(int)(Math.random()*10);
				int count = 0;
				for(int i = 0; i < numberOfDeputy; i++) {
					rada.addDataStream(fractionName);
					count++;
				}
				System.out.println("The fraction consist of " + count + " deputes\n");
				break;
			}
			case 2:{
				rada.createStream();			
				break;
			}			
			case 3:{
				System.out.println("Enter the faction name to show all deputes: ");
				Scanner fraction2 = new Scanner(System.in);	
				String fr2 = fraction2.nextLine();
				
				rada.showFractionStream(fr2);				
				break;
			}		
			case 4:{
				System.out.println("The list of briber deputy:\n");
				rada.showBribersStream();
				break;			
			}			
			case 5:{
				System.out.println("The biggest bribery is:\n");
				rada.showBiggestBriberStream();
				break;
			}			
			case 6:{
				System.out.println("The remove deputies from the fraction.");
				System.out.println("Input name:");
				Scanner deputyName2 = new Scanner(System.in);
				String str = deputyName2.nextLine();
				System.out.println("Please input the fraction:");
				Scanner fraction5 = new Scanner(System.in);
				String str2 = fraction5.nextLine();

				rada.removeDeputyStream(str, str2);					
				break;
			}		
			case 7:{
				System.out.println("Enter the fraction name to remove: ");
				Scanner fraction2 = new Scanner(System.in);
				String frac2 = fraction2.nextLine();
				
				rada.removeFractionStream(frac2);				
				break;
			}			
			case 8:{
				System.exit(0);	
				break;
			}
			default:{
				System.out.println("Enter the number from 1 to 8");
			}
		
			}		
		}	
	}
	
		
	static void menu() {
		System.out.println("Enter 1 to add a faction"); 
		System.out.println("Enter 2 to present all Fraction");
		System.out.println("Enter 3 to present specific Fraction");
		System.out.println("Enter 4 to display the list of bribers");
		System.out.println("Enter 5 to display the bigest bribers");
		System.out.println("Enter 6 to remove the deputy from the faction");	
		System.out.println("Enter 7 to remove the faction");		
		System.out.println("Enter 8 to log out the program");

	}	

}
