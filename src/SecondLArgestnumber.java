
public class SecondLArgestnumber {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr1= {7,5,6,1,4,2,45,8,43,0,93,67};
int Secondhighest=FindthesecondHIghest(arr1);
System.out.println("The Second Highest of the Array is "+Secondhighest);
	}

	public static int FindthesecondHIghest(int arr[]) {
		// TODO Auto-generated method stub
		int high=Integer.MIN_VALUE;
		int SecHigh=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>high) {
				//Assign Second Highest to Highest
				SecHigh=high;
				//Assign Highest to Array[i]
				high=arr[i];
			}else if(arr[i]>SecHigh) {
				SecHigh=arr[i];
			}
			
		}
		
		
		return SecHigh;
	}

}
