package array;

public class MissingArray {
	 public static void main(String[] args) {

	        int[] arr = {1, 2, 4, 3, 6};

	        int n = arr.length + 1;

	        int totalSum = n * (n + 1) / 2;

	        int arraySum = 0;

	        for (int i = 0; i < arr.length; i++) {
	            arraySum += arr[i];
	        }

	        int missingNumber = totalSum - arraySum;

	        System.out.println("Missing Number: " + missingNumber);
	    }
}
