//Boilerplate imports
import java.util.Scanner;

public class HeapSort{
	private static int[] array;
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int size = Integer.parseInt(sn.next());
		array = new int[size];
		for(int i=0;i<size;i++){
			array[i] = sn.nextInt();
		}
		System.out.println("\n Here is your heap sort - sorted list :");
		heapSort(size);
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}

	}

	public static void heapify(int n, int size){
		for(int index = n/2-1; index>=0 ; index--){
			if(array[index]<array[(index*2)+1]){
				int temp = array[index];
				array[index]=array[(index*2)+1];
				array[(index*2)+1]=temp;
			}
			if(array[index]<array[(index*2)+2] && ((index*2)+2)<size ){
				int temp = array[index];
				array[index]=array[(index*2)+2];
				array[(index*2)+2]=temp;
			}
		}
	}

	public static void heapSort(int n){
		int size = n;
		while(n>1){
			heapify(n,size);
			int max = array[0];
			array[0] = array[n-1];
			array[n-1]=max;
			n--;
			size--;
		}
	}
}