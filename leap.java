package guvibeginner1;

import java.util.Scanner;

public class leap {
	public static void main(String[] args){
		int a;
		System.out.println(" value of a");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		input.close();
		if(a%4==0){
			System.out.println(" leap");
			
		}
		else {
			System.out.println(" not leap");
		}
	}

}
