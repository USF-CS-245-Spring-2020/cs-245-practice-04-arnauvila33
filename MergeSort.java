import java.util.*;

public class MergeSort implements SortingAlgorithm{
	
	public void sort(int[] a){
		if(a.length<=1)
			return;
		int leftside=a.length/2;
		int[] left=new int[leftside];
		int[] right=new int[a.length-leftside];
		int k=0;
		for(int i=0;i<a.length;++i){
			if(i<leftside)
				left[i]=a[i];
			else{
				right[k]=a[i];
				k=k+1;
			}

		}
		sort(left);
		sort(right);

		merge(left,right,a);

	}	
	public void merge(int[] left,int[] right,int[] target){
		int indexL=0;
		int indexR=0;
		int indexT=0;
		while(indexL<left.length&&indexR<right.length){
			if(left[indexL]<=right[indexR])
				target[indexT++]=left[indexL++];
			else
				target[indexT++]=right[indexR++];

		}
		
		while(indexL<left.length)
			target[indexT++]=left[indexL++];
		while(indexR<right.length)
			target[indexT++]=right[indexR++];
	

	}


}
