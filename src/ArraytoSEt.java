import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArraytoSEt {

	

	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		ArrayList Alist=new ArrayList();
		
		Alist.add(12);
		Alist.add(23);
		Alist.add(35);
		Alist.add(12);
		Alist.add(87);
		Alist.add(23);
		Alist.add(34);
		Alist.add(35);
		System.out.println("Element in the Array");
		System.out.println(Alist);
		Set yuvi=new HashSet(Alist);
		System.out.println("Array without Duplicate Element");
		System.out.println(yuvi);
		Collections.sort(Alist);
		
		System.out.println("Sorted ArrayList : "+Alist);
		

		
		List list = new ArrayList(yuvi);

;
		System.out.println("Sorted Set to List : "+yuvi);
		//Remove Duplicate & Sort
				TreeSet tset = new TreeSet(Alist);
				System.out.println("Sorted and Uniques : " + tset);
	}
}
