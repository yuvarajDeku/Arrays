import java.util.Arrays;

public class MissingNUmber {

	public static int Missing(int[] arr	) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		System.out.println(sum);
		int resum=0;
		for(int i=0;i<n-1;i++){
			resum=resum+arr[i];
		}
		int missing=sum-resum;
		System.out.println(resum);
		return missing;
		
	}
	
		
	
	
	
	
	public static void main(String args[]) {
		//array 1
		int [] arr1= {1,2,3,4,5,6,7,8,9,10,11,12,13,15,16};
		//array 2
		
		String stringArr = Arrays.toString(arr1); 
		  
        // print the String representation 
       System.out.println("Array of Element: " + stringArr); 
		
		System.out.println("Missing Element is : "+Missing(arr1));
		
		int [] arr2= {1,2,3,4,5,6,7,8,9,10,12,13,14};
		String stringArr2 = Arrays.toString(arr2); 
		System.out.println("Array of element "+stringArr2);
		
		System.out.println("Missing Element is : "+Missing(arr2));
		
	}
}
