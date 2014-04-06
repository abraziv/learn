package ch1;

public class Hello {

	public static void main(String[] args) {	

		int[] arr = new int[10];
//		int[] brr = {1, 20, 34, 30, 2, 1, 5};
				
		for(int i = 0; i < arr.length; i++) {
			arr[i] =(int) (Math.random() * 100);
		}
				
		int maxIdx = 0;
		int minIdx = 0;
		int max = arr[maxIdx];
		int min = arr[minIdx];
		
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIdx = i;
			}
			if (min > arr[i]) {
				min = arr[i];
				minIdx = i;
			}
		}
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		arr[maxIdx] = min;
		arr[minIdx] = max;
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}

}
