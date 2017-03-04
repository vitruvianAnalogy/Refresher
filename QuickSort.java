//Boilerplate imports
import java.util.Scanner;

public class QuickSort{
	private static int[] a;
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int size = Integer.parseInt(sn.next());
		a = new int[size];
		for(int i=0;i<size;i++){
			a[i] = sn.nextInt();
		}
		System.out.println("\n Here is your quick sort - sorted list :");
		quickSort(0,size-1);

		for(int i=0;i<size;i++){
			System.out.println(a[i]);
		}

	}

	public static void quickSort(int l, int h){
		if(l<h){
			int pivot = partition(l,h);
			quickSort(l,pivot-1);
			quickSort(pivot+1,h);			
		}
	}

	public static int partition(int l,int h){
		//'i' doesn't increment if a[j] is greater than pivot. This keeps track
		//of where the larger element is, and once we find another smaller element
		//we swap larger element with the smaller element. Let's rename i as larger
		int larger = l-1;
		int pivot = h;
		for(int j=l;j<h;j++){
			if(a[j]<a[pivot]){
				larger++;
				swap(larger,j);
			}
		}
		swap(larger+1,pivot);
		return larger+1;
	}

	public static void swap(int i, int j){
		if(i!=j){
			// a[i]=a[i]-a[j];
			// a[j]=a[j]+a[i];
			// a[i]=a[j]-a[i];
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}