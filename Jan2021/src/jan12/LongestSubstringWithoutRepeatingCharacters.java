package jan12;

import java.util.ArrayList;
import java.util.Scanner;

public class LongestSubstringWithoutRepeatingCharacters {
		public static void main(String[] args) {
		ArrayList<String> chr=new ArrayList<String>();
		String s=new String();
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		for(int i=0;i<s.length();i++) {
			for(int j=s.length();j>i;j--) {
				chr.add(s.substring(i,j));
			}
		}
		int c=0;
		for(int i=0;i<chr.size();i++) {
			char[] ch=new char[chr.get(i).length()];
			ch=chr.get(i).toCharArray();
			in:
			for(int j=0;j<ch.length;j++) {
				for(int k=ch.length-1;k>0;k--) {
						if(ch[j]==ch[k]) {
							
							break in;
						}
						else {
							c++;
						}
					}
					
				}
				
			System.out.println(chr.get(i)+" "+c);
			c=0;
		}
		sc.close();
	}
	
}
