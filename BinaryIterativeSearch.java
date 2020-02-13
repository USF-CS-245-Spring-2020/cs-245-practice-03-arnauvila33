/* Java Binary Search implementation in iterative */

import java.util.Arrays;
public class BinaryIterativeSearch implements Practice03Search{

	public int search(int[] arr,int target){
		int s=arr.length-1;
		int f=0;
		while(f<=s){
			int mid=f+(s-f)/2;
			if(arr[mid]==target){
				return mid;
			}
			if(arr[mid]<target){
				f=mid+1;
			}
			else
				s=mid-1;
			
		}
		return -1;
	}

}
