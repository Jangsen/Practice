package testclass03;

public class insertionSortExample {
	    public static void main(String[] args) {
	        int[] arr = {4, 3, 2, 1};
	        insertionSort(arr);
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	    }

	    public static void insertionSort(int[] array) {
	        for (int i = 1; i < array.length; i++) {
	            int key = array[i];
	            int j = i - 1;
	            while (j >= 0 && array[j] > key) {
	                array[j + 1] = array[j];
	                j = j - 1;
	            }
	            array[j + 1] = key;
	        }
	    }

}
