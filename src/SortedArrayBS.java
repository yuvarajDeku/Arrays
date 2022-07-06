
public class SortedArrayBS {

	int[] array= {1,2,3,4,5,34,233,455};
	
	
	public void sort(int value) {
		int as=0;
		boolean flag=false;
		int arraysize=array.length;
		System.out.println(arraysize);
		System.out.println(array.length);
		for(int i=0;i<array.length;i++) {
			if(array[i]==value) {
				as=i;
				flag=true;
			}
		}
		if(flag) {
			System.out.println("Value is present  index  at : "+ as);
		}
		else System.out.println("Value is not Present in the Array");
	}
	
	public static int BSArray(int value,int [] array) {
		int len=array.length-1;
		int Start=0;
		int mid=0;
		while(Start<len) {
			
			mid=mid+(len-Start/2);
			System.out.println(mid);
			if(array[mid]==value) {
				return mid;
			}
			else if(value<array[mid]) {
				return len=mid-1;
			}else Start =mid +1;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		SortedArrayBS search=new SortedArrayBS();
		search.sort(3);
		//search.BSArray(5,array[]);
		
	}
}
