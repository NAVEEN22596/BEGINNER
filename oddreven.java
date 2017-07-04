package guvibeginner1;

import java.util.Scanner;

public class oddreven {
	public static void main(String[] args){
		int a;
		System.out.println(" value of a");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		input.close();
		if(a%2==0){
			System.out.println(" even");
			
		}
		else {
			System.out.println(" odd");
		}
	}
}
