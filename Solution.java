package co.anbu;

import java.util.Scanner;

class Prime{
	Prime(int first, int last, int add, int count){
		boolean n=true;
		while(n == true) {
			System.out.println(first);
			System.out.println(count);
			for(int i=2; i<first; i++) {
				if(first % i == 0) {
					count++;
				}
			}
			if(count == 1) {
				add += first;
				first += 1;
				count=1;
			}
			else {
				first += 1;
				count = 1;
			}
			if(first>last) {
				n = false;
			}
		}System.out.println("The Addition of Prime Number is : " + add);
	}
}
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Start Number : ");
		int s = sc.nextInt();
		System.out.print("Enter The End Number : ");
		int e = sc.nextInt();
		int add = 0, count = 1;
		if( s < 3 || s > e || e>1000 ) {
			System.out.println("INVALID INPUT");
		}
		else {
			
			Prime n1 = new Prime(s, e, add, count);
		}
		
	}


}
