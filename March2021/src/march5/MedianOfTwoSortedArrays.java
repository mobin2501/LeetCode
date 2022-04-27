package march5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		int a[]= {1,3};
		int b[]= {2};
		findMedianSortedArrays(a,b);
	}
    public static void findMedianSortedArrays(int[] n1, int[] n2) {
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	for(int i=0;i<n1.length;i++) {
    		al.add(n1[i]);
    	}
    	for(int i=0;i<n2.length;i++) {
    		al.add(n2[i]);
    	}
    	Collections.sort(al);
    	System.out.println(al);
    	if(al.size()%2==0) {
    		double median=(double)al.get((al.size()/2)-1)/2+(double)al.get((al.size()/2))/2;
    		System.out.print(median);
    	}
    	else {
    		double median=(double)al.get(al.size()/2);
    		System.out.print(median);
    	}
        
        
    }

}
