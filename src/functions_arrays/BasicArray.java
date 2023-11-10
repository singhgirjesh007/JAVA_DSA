package functions_arrays;

public class BasicArray {

	public static void main(String[] args) {

		int[] arr;

		arr = new int[3];

		arr[0] = 33;
		arr[1] = 51;
		arr[2] = 53;

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int[] arr2 = arr;

		arr2[1] = 1000;

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr2[i] + " ");
		}
		
		arr[1] = 5000;
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr2[i] + " ");
		}

}
}
