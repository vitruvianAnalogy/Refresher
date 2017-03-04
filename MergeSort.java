//Boilerplate imports
import java.util.Scanner;

public class MergeSort{
	private static int[] a;
	public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		int size = Integer.parseInt(sn.next());
		a = new int[size];
		for(int i=0;i<size;i++){
			a[i] = sn.nextInt();
		}
		System.out.println("\n Here is your merge sort - sorted list :");
		
		int l = 0;
		int r = a.length;
		split(l, r-1);

		for(int i=0;i<size;i++){
			System.out.println(a[i]);
		}

	}

	public static void split(int l, int r){
		if(l==r)
			return;
		int mid = (l+r)/2;
		split(l,mid);
		split(mid+1,r);
		merge(l,mid,r);
	}

	public static void merge(int l, int mid, int r){
		int tempL = l;
		int tempM = mid+1;
		int[] tempA = new int[r-l+1];
		int c = 0;

		while(tempL<=mid && tempM<=r){
			if(a[tempL]<a[tempM]){
				tempA[c] = a[tempL];
				tempL++;
			}else if(a[tempL]>a[tempM]){
				tempA[c] = a[tempM];
				tempM++;
			}
			c++;
		}

		if(tempL>mid){
			while(tempM<=r){
				tempA[c] = a[tempM];
				tempM++;
				c++;
			}
		}else if(tempM>r){
			while(tempL<=mid){
				tempA[c] = a[tempL];
				tempL++;
				c++;
			}
		}

		int counter = 0;
		while(l<=r){
			a[l] = tempA[counter];
			l++;
			counter++;
		}
	}

}
