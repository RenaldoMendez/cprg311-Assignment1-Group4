package utility;

public class SortingShape {

	public static void BubbleSort(double[] shapeArr) {
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
	}

	public static void SelectionSort(double[] shapeArr) {
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

	}

	public static void InsertionSort(double[] shapeArr) {
		int size = shapeArr.length;

		for (int i = 0; i < size; i++) {
			double temp = shapeArr[i];
			int j = i - 1;

			while (j > -1 && (shapeArr[j] > temp)) {
				shapeArr[j + 1] = shapeArr[j];
				j--;
			}
			shapeArr[j + 1] = temp;
		}

	}

	public static void MergeSort(double[] shapeArr) {
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

	}

	private static void Merge(double[] shapeArr, double[] left, double[] right, int l, int r) {
		
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
	}

	public static void QuickSort(double[] shapeArr) {
		int size = shapeArr.length;

	}
	
	private int partition(double[] shapeArr, int begin, int end) {
		double pivot = shapeArr[end];
		int i = (begin - 1);
		
		for(int j = begin; j < end; j++) {
			if(shapeArr[j] <= pivot) {
				i++;
				
				double temp = shapeArr[i];
				shapeArr[i] = shapeArr[j];
				shapeArr[j] = temp;
			}
		}
		
		double temp = shapeArr[i+1];
		shapeArr[i+1] = shapeArr[end];
		shapeArr[end] = temp;
		
		return i + 1;
	}

	public static void RandomSort(double[] shapeArr) {
		int size = shapeArr.length;

	}

}
