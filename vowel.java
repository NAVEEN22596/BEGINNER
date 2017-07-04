package guvibeginner1;

import java.util.Scanner;

public class vowel {
	public static void main(String[] args){
		
		System.out.println(" value of c");
		Scanner input=new Scanner(System.in);
char c=input.next().charAt(0);
		input.close();
		if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
			System.out.println("vowel");
			
		}
		else{
			System.out.println("consonant");
		}
	}

}
