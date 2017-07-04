package guvibeginner1;

import java.util.Scanner;

public class largest {
	public static void main(String[] args){
		int a;
		System.out.println(" value of a");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		int b;
		System.out.println(" value of b");
		b=input.nextInt();
		int c;
		System.out.println(" value of c");
		c=input.nextInt();
		input.close();
		if(a>b && a>c){
			System.out.println(" a");
			
		}
		else if (b>a && b>c){
			System.out.println(" b");
		}
		else{
			System.out.println(" c");
		}

}
}