//Boilerplate imports
import java.util.Scanner;

public class HeapSort{
	private static int[] a;
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int size = Integer.parseInt(sn.next());
		a = new int[size];
		for(int i=0;i<size;i++){
			a[i] = sn.nextInt();
		}
		System.out.println("\n Here is your heap sort - sorted list :");

		for(int i=0;i<size;i++){
			System.out.println(a[i]);
		}

	}
}