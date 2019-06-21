package linkedlistexample;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multidimensional Arrays, usually consider 2D arrays
		// create a 2D array ints
		int[][] arr1 = new int[10][20];

		// really creating an array of arrays
		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 } };
		// traversing through an array

		for (int i = 0; i < arr2.length; i++) {// iterating over the rows
			for (int j = 0; j < arr2[i].length; j++) {// iterating the columns in row

				// i = j;
				//System.out.println(j);
				//System.out.println("i= " + i);
				//System.out.println("j= " + j);
				//System.out.println("arr2[i][j] = " + arr2[i][j]);
				
			}
		}
		System.out.println(ArraysDemo.largestElement(arr2));

	}

	/*
	 * Return the largest element in the provided array
	 */
	public static int largestElement(int[][] arr) {
		int largestElement = arr[0][0];
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
				
				if (largestElement > arr[x][y]) {
					largestElement = arr[x][y];
					
				}
			}
		}
		
		return largestElement;
	}

	/*
	 * add all the elements in the array
	 */
	public static int sumElements(int[][] arr) {
		int sum = 0;
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr[a].length; b++) {
				sum = sum + arr[a][b];

			}
		}
		return sum;
	}

	/*
	 * sort the array
	 */
	public static int[][] sortArray(int[][] arr) {
		return null;
	}
	/*
	 * 
	 */

}
