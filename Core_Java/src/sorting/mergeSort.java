package sorting;

public class mergeSort {
	int arr[];
	int tarr[];
	int len;
	public static void main(String[] args) {
		int inarr[]= {9,1,4,7,3,8,3,2,1,5};
		mergeSort ms=new mergeSort();
		ms.sort(inarr);
		for (int i : inarr) {
			System.out.print(i+" ");
		}
	}

	public void sort(int inarr[]) {
		this.arr=inarr;
		this.len=inarr.length;
		this.tarr=new int[len];
		divideArray(0,len-1);
	}

	public void divideArray(int l,int h) {
		if (l<h) {
			int m=(l+h)/2;
			divideArray(l,m);
			divideArray(m+1,l);
			margeArray(l,m,h);
		}		
	}

	public void margeArray(int l,int m,int h) {
		for (int i = l; i < h; i++) {
			tarr[i]=arr[i];
		}
		int i=l;
		int j=m+1;
		int k=l;
		while (i<=m && j<=h) {
			if (tarr[i]<=tarr[j]) {
				arr[k]=tarr[i];
				i++;
			}
			else {
				arr[k]=tarr[j];
				j++;
			}
			k++;
		}
		while (i<=m) {
			arr[k]=tarr[i];
			k++;
			i++;
		}
	}
}
