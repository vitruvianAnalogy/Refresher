import java.util.Scanner;
public class RadixSort{
	private int[] array;
	private int[] newArray;
	public static void main(String[] args){
		//Enter number of elements
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		array = new int[n];

		//Input elements
		for(int i=0;i<n;i++){
			array[i] = sn.nextInt();
		}

		System.out.println("Here is the sorted array using radix sort");
		sort(n);
		for(int i=0;i<n;i++){
			System.out.println(newArray[i]);
		}
	}

	public static int findMax(int n){
		int max = 0;
		for(int i=0; i<n; i++){
			if(max<array[i]){
				max = array[i];
			}
		}
		return max;
	}

	public static void countingSort(int n, int exp){
		int [] temp = new int[10];
		newArray = new int[n];

	}

	public static void sort(int n){
		int max = findMax(n);
		//Run loop n number of times where n is the number of digits in max
		for(int i = 1; max/i>0; i*10){
			countingSort(n,i);
		}
	}
}