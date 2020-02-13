/* Java Binary Search implementation in recursive. BSearch used to accomodate implementation of Practice03Search*/

import java.util.Arrays;
public class BinaryRecursiveSearch implements Practice03Search{
	public int search(int[] arr,int target){
		int f=0;
		int l=arr.length-1;
		int g=Bsearch(arr,target,f,l);
		return g;

		
	}	
	
	public int Bsearch(int arr[],int target,int f,int e){
		if(e>=f){
			int m=f+(e-f)/2;
			if(arr[m]==target)
				return m;
			if(arr[m]>target)
				return Bsearch(arr,target,f,m-1);
			return Bsearch(arr,target,m+1,e);
		}
		return -1;

	}

}
