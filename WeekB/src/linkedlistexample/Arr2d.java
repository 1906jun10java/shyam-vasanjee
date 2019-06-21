package linkedlistexample;

public class Arr2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// System.out.println(Arr2d.largestElement(arr2));
		// System.out.println(Arr2d.sumElements(arr2));
		// System.out.println(Arr2d.smallestNumber(arr2));
		// System.out.println(Arr2d.mean(arr2));
		int[] arr1 = { 7, 54, 32, 86, 5, 12 };
		Arr2d.bubbleSort(arr2);
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[i][j] + " ");
			System.out.println();
			}
		}
		// Arr2d.printArr(arr1);

	}

	public static int largestElement(int[][] arr) {
		int largestElement = arr[0][0];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {

				if (arr[row][col] > largestElement) {
					largestElement = arr[row][col];

				}
			}
		}

		return largestElement;
	}
	public static int[] sortArray(int[] arr) {
		int n = arr.length;
		int temp;
		for(int i =0; i<n;i++) {
			for(int j=0;j < n -(i+1);j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		return arr;
	}

	public static int[][] bubbleSort(int[][] arr) {
		int rowL = arr[0].length - 1;
		boolean sorted = false;
		
		while (!sorted) {
			sorted = true;

			for (int i = 0; i < arr.length; i++) {
				if (i < arr.length - 1 && (arr[i][rowL] < arr[i + 1][0])) {// checks the jump
					sorted = false;										  // first entry of next row
					int temp1;
					temp1 = arr[i][rowL];
					arr[i][rowL] = arr[i + 1][0];
					arr[i + 1][0] = temp1;
				}

				for (int j = 0; j < arr[i].length- 1; j++) {// compares each row

					if (arr[i][j] < arr[i][j + 1]) {
						sorted = false;
						int temp;
						temp = arr[i][j];
						arr[i][j] = arr[i][j + 1];
						arr[i][j + 1] = temp;
					}

				}

			}
		}
		return arr;

	}

	public static int sumElements(int[][] arr) {
		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				sum = sum + arr[row][col];
			}
		}
		return sum;
	}

	public static int smallestNumber(int[][] arr) {
		int min = arr[0][0];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] < min) {
					min = arr[row][col];
				}
			}
		}
		return min;
	}

	public static int sum(int[][] arr) {
		int sum = 0;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr.length; col++) {
				sum = sum + arr[row][col];
			}
		}

		return sum;
	}

	public static int mean(int[][] arr) {
		int mean = Arr2d.sum(arr) / arr.length;
		return mean;
	}

}
