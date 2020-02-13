/* Java Bubble Sort Implementation */

import java.util.Arrays;
public class BubbleSort implements Practice03Sort{
	
	public void sort(int[] a){
		boolean s=true;
		for(int k=0;k<a.length-1;k++){
			s=false;
			for(int i=0;i<a.length-k-1;i++){
				if(a[i]>a[i+1]){
					int t=a[i];
					a[i]=a[i+1];
					a[i+1]=t;
					s=true;
				}
			}
			if(s==false)
				break;


		}

	}

}
