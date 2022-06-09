package manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import problemdomain.GeometricalShape;
import utility.*;

public class GeoShapeManager {
	private Scanner in;
	private GeometricalShape[] shapeArray;

	SortingShape sortArray = new SortingShape();

	private static final String FILE_PATH = "res/books.txt";

	public GeoShapeManager() {
		super();
		SortingShape sortArray = new SortingShape();
	}

	public void displayOption() {
		String option = "[Enter Your Option]";
		while (option != "E") {
			System.out.println("Welcome! What kind of sorting do you want to implement?");
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
				// height;
				break;
			}
			case "v": {
				// volume;
				break;
			}
			case "a": {
				// base area;
				break;
			}
			case "e": {
				// exit;
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

		for (int i = 0; i < size; ++i) {
			System.out.println(shapeArray[i] + " ");
		}

	}

	public void selectionSort() {
		sortArray.SelectionSort(shapeArray);
		int size = shapeArray.length;

		for (int i = 0; i < size; i++) {
			System.out.println(shapeArray[i] + " ");
		}
	}

	public void insertionSort() {
		sortArray.InsertionSort(shapeArray);
		int size = shapeArray.length;

		for (int i = 0; i < size; i++) {
			System.out.println(shapeArray[i] + " ");
		}
	}

	public void mergeSort() {
		sortArray.MergeSort(shapeArray);
		int size = shapeArray.length;

		for (int i = 0; i < size; i++) {
			System.out.println(shapeArray[i] + " ");
		}
	}

	public void quickSort() {

	}

	public void randomSort() {

	}

	

	/**
	 * reads file and passes
	 * @param fileName
	 */
	public void readFile(String fileName) {
		try (Scanner scanner = new Scanner(new File(fileName))) {
			
			int numberOfShapes = Integer.parseInt(scanner.next()); // stores the first element in the file
			shapeArray = new GeometricalShape[numberOfShapes]; // initialize array with the number of shapes
			
			shapeArray = populateArray(scanner, numberOfShapes); //method to do reflection and populate array

		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}catch (NoSuchMethodException e) {
			e.printStackTrace();
		}catch (SecurityException e) {
			e.printStackTrace();
		}catch(InstantiationException e) {
			e.printStackTrace();
		}catch(IllegalAccessException e) {
			e.printStackTrace();
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}catch(InvocationTargetException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method uses reflection to create specified shape from file 
	 * @param scanner
	 * @param arraySize
	 * @return shapeArray, an array of shapes created from a file
	 * @throws ClassNotFoundException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public GeometricalShape[] populateArray(Scanner scanner, int arraySize) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		GeometricalShape[] array = new GeometricalShape[arraySize];
		int i; // iterator i used to identify index in shapeArray
		Object shapeObject = null; // variable to hold each shape object
		
		// iterate through array the number of shapes times
		for (i = 0; i < arraySize; i++) {
			// get class name
			String className = "problemdomain." + scanner.next();
			// get parameters from file
			double[] parameters = new double[2];
			parameters[0] = Double.parseDouble(scanner.next());
			parameters[1] = Double.parseDouble(scanner.next());

			// Get class
			Class reflectedClass = Class.forName(className);

			// verify object class and create specified object
			if (className.compareTo("problemdomain.Cone") == 0) {
				// specify parameter types for the constructor
				Class parameterTypes[] = new Class[2];
				parameterTypes[0] = Double.TYPE;
				parameterTypes[1] = Double.TYPE;

				// get constructor
				Constructor shapeConstructor = reflectedClass.getConstructor(parameterTypes);

				// create object/instance of class and store in shapeObject
				shapeObject = shapeConstructor.newInstance(parameters);

			} else if (className.compareTo("problemdomain.Cylinder") == 0) {
				// specify parameter types for the constructor
				Class parameterTypes[] = new Class[2];
				parameterTypes[0] = Double.TYPE;
				parameterTypes[1] = Double.TYPE;

				// get constructor
				Constructor shapeConstructor = reflectedClass.getConstructor(parameterTypes);

				// create object/instance of class and store in shapeObject
				shapeObject = shapeConstructor.newInstance(parameters);

			} else if (className.compareTo("problemdomain.Pyramid") == 0) {
				// specify parameter types for the constructor
				Class parameterTypes[] = new Class[2];
				parameterTypes[0] = Double.TYPE;
				parameterTypes[1] = Double.TYPE;

				// get constructor
				Constructor shapeConstructor = reflectedClass.getConstructor(parameterTypes);

				// create object/instance of class and store in shapeObject
				shapeObject = shapeConstructor.newInstance(parameters);

			} else {
				// specify parameter types for the constructor
				Class parameterTypes[] = new Class[2];
				parameterTypes[0] = Double.TYPE;
				parameterTypes[1] = Double.TYPE;

				// get constructor
				Constructor shapeConstructor = reflectedClass.getConstructor(parameterTypes);

				// create object/instance of class and store in shapeObject
				shapeObject = shapeConstructor.newInstance(parameters);
			}

			// add shape to array
			// the i used as index here is used to keep track of what shape we just created
			// out of the amount in the file
			shapeArray[i] = (GeometricalShape) shapeObject;
		}

		return shapeArray;
	}

}
