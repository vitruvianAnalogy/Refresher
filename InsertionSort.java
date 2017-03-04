//Boilerplate imports
import java.util.Scanner;

public class InsertionSort{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int size = Integer.parseInt(sn.next());
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = sn.nextInt();
		}
		System.out.println("\n Here is your insertion sorted list :");
		array = insertionSort(array);

		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}

	}

	public static int[] insertionSort(int[]a){
		for(int i=1; i<a.length; i++){
			int temp = a[i];
			for(int j=i-1;j>=0;j--){
				if(temp < a[j]){
					a[j+1] = a[j];
					a[j]=temp;
				}
			}
		}
		return a;
	}
}