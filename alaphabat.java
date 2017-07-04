package guvibeginner1;

import java.util.Scanner;

public class alaphabat {
	public static void main(String[] args){
	
		System.out.println(" value of c");
		Scanner input=new Scanner(System.in);
char c=input.next().charAt(0);
		input.close();
		if(c>='a' && c<='z'|| c>='A'&& c<='Z'){
			System.out.println(" alphabet");
			
		}
		else{
			System.out.println("not alphabet");
		}
	}
}
