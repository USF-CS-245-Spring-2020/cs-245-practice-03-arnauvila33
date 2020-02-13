import java.util.Arrays;
public class InsertionSort implements Practice03Sort{
	
	public void sort(int a[]){
		for(int i=1;i<a.length;i++){
			int t=a[i]; /*key*/
			int k=i-1;
			while(k>=0&&a[k]>t){
				a[k+1]=a[k];
				k=k-1;
			}
			a[k+1]=t;
		}

	}
}


