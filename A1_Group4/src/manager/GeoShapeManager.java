package manager;

import java.util.*;

import utility.*;

public class GeoShapeManager {
	private Scanner in;
	private double[] shapeArray;
	SortingShape sortArray = new SortingShape();
	
	private static final String FILE_PATH = "res/books.txt";

	public GeoShapeManager() {
		super();
		SortingShape sortArray = new SortingShape();
	}
	
	public void displayOption() {
		String option = "[Enter Your Option]";
		while (option != "E") {
			System.out.println("Welcome! What kind of sorting you wanting to implement?");
			System.out.println("t\tCompare Type");
			System.out.println("f\tTesting Program");
			
			System.out.print("\nEnter option: ");
			option = this.in.toString();

			switch (option) {
			case "t": {
				CompareType();
				break;
			}
			case "f": {
				TestingProgram();
				break;
			}
			case "e": {
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid option!");
				break;
			}
			}
		}
		
		
	}
	
	
	public void CompareType() {
		
		String option = "[Enter Your Option]";
		while (option != "e") {
			System.out.println("Welcome! What kind of sorting you wanting to implement?");
			
			System.out.println("h\tHeight");
			System.out.println("v\tVolume");
			System.out.println("a\tBase Area");
			System.out.println("e\tExit");
			System.out.print("\nEnter option: ");
			option = this.in.toString();

			switch (option) {
			case "h": {
				//height;
				break;
			}
			case "v": {
				//volume;
				break;
			}
			case "a": {
				//base area;
				break;
			}
			case "e": {
				//exit;
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid option!");
				break;
			}
			}
		}
		
	}
	
	public void TestingProgram() {
		
		String option = "[Enter Your Option]";
		while (option != "E") {
			System.out.println("Welcome! What kind of sorting you wanting to implement?");
			
			System.out.println("h\tHeight");
			System.out.println("v\tVolume");
			System.out.println("a\tBase Area");
			System.out.println("b\tBubble Sort");
			System.out.println("s\tSelection Sort");
			System.out.println("i\tInsertion Sort");
			System.out.println("m\tMerge Sort");
			System.out.println("q\tQuick Sort");
			System.out.println("z\tRandom Sort");
			System.out.print("\nEnter option: ");
			option = this.in.toString();

			switch (option) {
			case "b": {
				bubbleSort();
				break;
			}
			case "s": {
				selectionSort();
				break;
			}
			case "i": {
				insertionSort();
				break;
			}
			case "m": {
				mergeSort();
				break;
			}
			case "q": {
				quickSort();
				break;
			}
			case "z": {
				randomSort();
				break;
			}
			case "e": {
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Invalid option!");
				break;
			}
			}
		}
		
	}
	
	public void bubbleSort() {
		sortArray.BubbleSort(shapeArray);
		int size = shapeArray.length;
		
		for(int i = 0; i < size; ++i) {
			System.out.println(shapeArray[i] + " ");
		}
		
	}
	
	public void selectionSort() {
		sortArray.SelectionSort(shapeArray);
		int size = shapeArray.length;
		
		for(int i = 0; i < size; i++) {
			System.out.println(shapeArray[i] + " ");
		}
	}
	
	public void insertionSort() {
		sortArray.InsertionSort(shapeArray);
		int size = shapeArray.length;
		
		for(int i = 0; i < size; i++) {
			System.out.println(shapeArray[i] + " ");
		}
	}
	
	public void mergeSort() {
		sortArray.MergeSort(shapeArray);
		int size = shapeArray.length;
		
		for(int i = 0; i < size; i++) {
			System.out.println(shapeArray[i] + " ");
		}
	}
	
	public void quickSort() {
		
	}
	
	
	
	public void randomSort() {
		
	}

}
