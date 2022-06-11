package utility;

import java.lang.reflect.Array;
import java.util.Vector;

import manager.BaseAreaCompare;
import manager.VolumeCompare;
import problemdomain.GeometricalShape;

public class SortingShape {

	public static void BubbleSort(double[] shapeArr) {
		//grab current time at start
		int size = shapeArr.length;

		for (int i = 0; i < size - 1; ++i) {
			for (int j = 0; j < size - i - 1; ++j) {
				if (shapeArr[j + 1] < shapeArr[j]) {
					double temp = shapeArr[j];
					shapeArr[j] = shapeArr[j + 1];
					shapeArr[j + 1] = temp;

				}
			}
		}
		//grab current time at end
	}

	public static void SelectionSort(double[] shapeArr) {
		//grab current time at start
		int size = shapeArr.length;
		
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (shapeArr[i] > shapeArr[j]) {
					double temp = shapeArr[i];
					shapeArr[i] = shapeArr[j];
					shapeArr[j] = temp;
				}
			}
		}
		//grab current time at end

	}

	public static void InsertionSort(GeometricalShape[] shapeArr) {
		//grab current time at start
		int size = shapeArr.length;

		for (int i = 0; i < size; i++) {
			GeometricalShape temp = shapeArr[i];
			int j = i - 1;

			while (j > -1 && (shapeArr[j] > temp)) { //the > operator cannot compare two objects, must use compare or compareTo method
				shapeArr[j + 1] = shapeArr[j];
				j--;
			}
			shapeArr[j + 1] = temp;
		}
		//grab current time at end
	}

	public static void MergeSort(double[] shapeArr) {
		//grab current time at start
		int size = shapeArr.length;

		if (size > 2) {
			return;
		}

		int mid = size / 2;
		double[] left = new double[mid];
		double[] right = new double[size - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = shapeArr[i];

		}

		for (int i = mid; i < size; i++) {
			right[i - mid] = shapeArr[i];
		}

		MergeSort(left);
		MergeSort(right);
		
		Merge(shapeArr, left, right, mid, size - mid);
		//grab current time at end
	}

	private static void Merge(double[] shapeArr, double[] left, double[] right, int l, int r) {
		//grab current time at start
		int i = 0, j = 0, k = 0;
		
		while (i < l && j < r) {
			if(left[i] <= right[j]) {
				shapeArr[k++] = left[i++];
			} else {
				shapeArr[k++] = right[j++];
			}
		}
		while(i < l) {
			shapeArr[k++] = left[i++];
		}
		while(j < r) {
			shapeArr[k++] = right[j++];
		}
		//grab current time at end
	}

	//---------------------------------------------------QUICK SORT BEGINS--------------------------------------------------------------------------------//
	/**
	 * sorts the array in descending order using the quick sort algorithm
	 * @param shapeArr
	 * @param compareType
	 */
	public static void quickSort(GeometricalShape[] shapeArr, String compareType) {
		//grab current time at start
		
		quickSort(shapeArr, 0, shapeArr.length-1, compareType); // will call partition method
		
		//grab current time at end
	}
	public static void quickSort(GeometricalShape[] shapeArr, int left, int right, String compareType) {
		if (left >= right) {//check bounds
			return;
		}
		
		GeometricalShape pivot = shapeArr[(left + right) / 2]; // pick a shape as pivot close to the middle index
		int index = 0; //holds the index which divides a partition; returned by a partition method
		
		//call specific method based on specified compare type
		switch (compareType){
		case "h": index = partitionHeight(shapeArr, left, right, pivot);//call quickSort with height comparison
			break;
		case "v": index = partitionVolume(shapeArr, left, right, pivot);//call quickSort with volume comparison
			break;
		default: index = partitionBaseArea(shapeArr, left, right, pivot);//call quickSort with area comparison
			break;
		}
		
	 	quickSort(shapeArr, left, index-1, compareType); //recursively call quick sort on the left partition
	 	quickSort(shapeArr,index, right, compareType); //recursively call quick sort on the right partition
	}	
		
	public static int partitionHeight(GeometricalShape[] shapeArr, int left, int right, GeometricalShape pivot) {
		while (left <= right) { // loop while the left index is less than or equal to the right index
			while (shapeArr[left].compareTo(pivot) == 1) { //if the element at index left is greater than the pivot, then its already in the right place, skip it
				left++; // move from left to right
			}
			while (shapeArr[right].compareTo(pivot) == -1) { // if element at index right is less than the pivot then its in the right place, skip it
				right--; //move from right to left
			}
			if(left <= right) { //after the left and right iterators land on 2 elements out of place, then check if left index is still less than right index
				swap(shapeArr, left, right); //switch the two elements so they are in descending order
				left++;
				right--;
			}
		}
		
		return left; //left is going to be the partition point at the end of each partition
	}
	
	public static int partitionVolume(GeometricalShape[] shapeArr, int left, int right, GeometricalShape pivot) {
		VolumeCompare volumeCompare = new VolumeCompare();
		while (left <= right) { // loop while the left index is less than or equal to the right index
			while (volumeCompare.compare(shapeArr[left], pivot) == 100) { //if the element at index left is greater than the pivot, then its alredy in the right place, skip it
				left++; // move from left to right
			}
			while (volumeCompare.compare(shapeArr[left], pivot) == -100) { // if element at index right is less than the pivot then its in the right place, skip it
				right--; //move from right to left
			}
			if(left <= right) { // if after the left and right iterators land on 2 elements out of place, then check if left index is still less than right index
				swap(shapeArr, left, right); //switch the two elements so they are in descending order
				left++;
				right--;
			}
		}
		
		return left; //left is going to be the partition point at the end of each partition
	}
	
	public static int partitionBaseArea(GeometricalShape[] shapeArr, int left, int right, GeometricalShape pivot) {
		BaseAreaCompare areaCompare = new BaseAreaCompare();
		while (left <= right) { // loop while the left index is less than or equal to the right index
			while (areaCompare.compare(shapeArr[left], pivot) == 100) { //if the element at index left is greater than the pivot, then its alredy in the right place, skip it
				left++; // move from left to right
			}
			while (areaCompare.compare(shapeArr[left], pivot) == -100) { // if element at index right is less than the pivot then its in the right place, skip it
				right--; //move from right to left
			}
			if(left <= right) { // if after the left and right iterators land on 2 elements out of place, then check if left index is still less than right index
				swap(shapeArr, left, right); //switch the two elements so they are in descending order
				left++;
				right--;
			}
		}
		
		return left; //left is going to be the partition point at the end of each partition
	}
	
	/**
	 * swaps elements at index left, and right
	 * @param shapeArr
	 * @param left
	 * @param right
	 */z
	public static void swap(GeometricalShape[] shapeArr, int left, int right) {
		GeometricalShape temp = shapeArr[left];
		shapeArr[left] = shapeArr[right];
		shapeArr[right] = temp;
		
	}
	//-----------------------------------------QUICK SORT ENDS--------------------------------------------------------------------------------------------//
	 /**
	  * the algorithm sorts a list of GeometricalShape Objects by comparing their height, baseArea, or volume
	  * it divides each shape by one of these metrics into a bucket with a range of values that it accepts (there are
	  * as many buckets as there are objects in the array). so that shape will go into the bucket with a range that covers what ever metric its being measured by.
	  * When all the objects are separated into buckets, each bucket is sorted individually by a recursive bucket sort, or any other sorting algorithm.
	  * when each bucket is sorted, append the values of each bucket to the array in the order that will cause it to be sorted.
	  * @param shapeArr
	  * @param compareType
	  */
	public static void bucketSort(GeometricalShape[] shapeArr, String compareType) {
		int size = shapeArr.length;
		
		if(size <= 0) //if array is empty or in the negatives then no sorting is required
			return;
		
		//create size amount of buckets
		GeometricalShape[][] buckets = new GeometricalShape[size];
		
		for (int i = 0; i < size; i++) {
			buckets[i] = new GeometricalShape[1];
		
		
		//put shape objects from shapeArr into each bucket
		for(int i = 0; i < size; i++) {
			double idx = shapeArr[i].getHeight();
			buckets[(int)idx] = shapeArr[i]; //get the integer value of the height of that specific shape and set it as the range for the bucket
		}
		
		//sort individual buckets
		for (int i = 0; i < size; i++) {
			quickSort(buckets[i], compareType);
		}
		
		//concatenate all buckets back into the array; they will be sorted 
		int index = 0;
		for(int i = 0; i < size; i++) {
			for (int j = 0; j< buckets[i].size(); j++) {
				shapeArr[index++] = buckets[i].get(j);
			}
		}
	}
	
	

}
