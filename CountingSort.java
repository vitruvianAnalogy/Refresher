import java.util.Scanner;
public class CountingSort{
	private static int[] array;
	public static void main(String[] args){
		//Input number of numbers
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		array = new int[n];

		//Input elements
		for(int i=0;i<n;i++){
			array[i] = sn.nextInt();
		}

		System.out.println("Here is the sorted array using counting sort");
		sort(n);
		for(int i=0;i<n;i++){
			System.out.println(array[i]);
		}
	}

	public static void sort(int n){
		int [] temp = new int[10];
		//Count the frequency of elements
		for(int i=0; i<n;i++){
			temp[array[i]] = temp[array[i]]+1;
		}

		//Count the cumulative frequency
		for(int i=1;i<10;i++){
			temp[i]=temp[i]+temp[i-1];
		}

		//Put numbers back their own place;
		for(int i=0;i<n;i++){
			array[temp[i]]=0;
			temp[i]--;
		}
	}
}