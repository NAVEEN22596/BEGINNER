package guvibeginner1;

import java.util.Scanner;

public class hello {
	public static void main(String[] args){
		
		System.out.println(" value of a");
		Scanner input=new Scanner(System.in);
		char a=input.next().charAt(0);
		input.close();
		for(a=0;a<5;a++){
			System.out.println("Hello");
		}
	}
}
