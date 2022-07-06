
public class SortedArray {

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
	
	public static void main(String args[]) {
		SortedArray search=new SortedArray();
		search.sort(3);
		
	}
}
