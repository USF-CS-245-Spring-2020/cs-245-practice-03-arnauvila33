/* Java implementation of Selection Sort */

import java.util.Arrays;
public class SelectionSort implements Practice03Sort{
	public void sort(int[] a){
		for(int i=0;i<a.length-1;i++){
			int min=i;
			for(int k=i+1;k<a.length;k++){
				if(a[k]<a[min])
					min=k;
			}
			int t=a[min];
			a[min]=a[i];  /* Swap */
			a[i]=t;

		}

	}


}
