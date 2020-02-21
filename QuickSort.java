import java.util.Arrays;

public class QuickSort implements SortingAlgorithm{
	
	public void sort(int[] a){
		qs(a,0,a.length-1);
	}

	public int partition(int[] a, int start,int end){
		int pivot=end;
		int left=start-1;
		for(int j=start;j<=end;j++){
			if(a[j]<a[pivot]){
				left++;
				swap(a,left,j);
			}
		}
		swap(a,left+1,end);
		return left+1;

	}

	public void qs(int []a,int start,int end){
		if(start<end){
			int p=partition(a,start,end);
			qs(a,start,p-1);
			qs(a,p+1,end);
		}
	}

	public void swap(int[] a,int right,int pivot){
		int temp=a[right];
		a[right]=a[pivot];
		a[pivot]=temp;
	}


}
