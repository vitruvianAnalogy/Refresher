//BubbleSort pushes the largest element to the end, without specifically looking
//for it. Selection sort, specifically looks for the smallest element and pushes it
//to the front. 
import java.util.Scanner;

public class BubbleSort{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int size = Integer.parseInt(sn.next());
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = sn.nextInt();
		}
		System.out.println("\n Here is your sorted list :");
		array = bubbleSort1(array);

		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}

	}

	public static int[] bubbleSort2(int[] a){
		int iterator = a.length-1;
		for(int j=0;j<a.length;j++){
			// We can run this loop for one less step with each pass
			//for(int i=0;i<a.length-1;i++){
			//	if(a[i]>a[i+1]){
			//		int temp = a[i];
			//		a[i] = a[i+1];
			//		a[i+1] = temp;
			//	}
			//}

			//Alternative approach
			for(int i=0;i<iterator;i++){
				if(a[i]>a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}			
			iterator--;
		}
		return a;

	}

	public static int[] bubbleSort1(int[] a){
		for(int j=0;j<a.length;j++){
			//Main approach
			for(int i=0;i<a.length-1;i++){
				if(a[i]>a[i+1]){
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		return a;

	}

}