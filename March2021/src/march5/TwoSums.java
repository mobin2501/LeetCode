package march5;

import java.util.Scanner;

public class TwoSums {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.print(twoSum(nums,target).length);
		sc.close();
	}
	
	public static int[] twoSum(int[] nums,int target) {
		int i=0,j=0;
		for(i=0;i<nums.length-1;i++) {
			for(j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					System.out.println(i+" "+j);
					break;
				}
			}
		}
		return new int[] {i,j};
	}

}
