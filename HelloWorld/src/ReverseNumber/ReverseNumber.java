package ReverseNumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number:");
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int reverse=0;
		while(num>0) {
			int last_digit=num%10;
			reverse=reverse*10+last_digit;
			num=num/10;
		}
		System.out.println("Reverse Of Number:"+reverse);

	}

}
