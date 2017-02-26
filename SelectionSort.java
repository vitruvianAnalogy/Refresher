//Boilerplate imports
import java.util.Scanner;

public class SelectionSort{
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int size = Integer.parseInt(sn.next());
		int[] array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = sn.nextInt();
		}
		System.out.println("\n Here is your sorted list :");
		array = selectionSort(array);

		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}

	}

	public static int[] selectionSort(int[] array){
		int min = 0;
		for(int j = 0; j<array.length-1;j++){
			min = j;
			for(int i = j; i<array.length-1; i++){
				if(array[min]>array[i+1]){
					min = i+1;
				}
			}
			int temp = array[min];
			array[min] = array[j];
			array[j] = temp;
		}
		return array;
	}
}