package application;

import java.util.*;

import manager.GeoShapeManager;

public class GeoShapeDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GeoShapeManager manager = new GeoShapeManager();
		System.out.println("Enter user input: ");
		String userInput = scan.nextLine(); //accept string of user input
		
		//parse user input for commands
		
		//call method to read the file make the object, and store them
		manager.readFile("String holding the file path");
		//call the sorting method that was specified in user input
		
			//pass sort type and compare type into a method that selects the sort type by user input and which overloaded method to use based on compare type
		

		
		
		
//--------------------------------------------------------------------------------------------------------
//		double radius = 0;
//		double height = 0;
//		double side_length = 0;
//		
//		System.out.println("Please enter three geometrical shape dimensions: ");
//		radius = scan.nextDouble();
//		height = scan.nextDouble();
//		side_length = scan.nextDouble();

	}

}
