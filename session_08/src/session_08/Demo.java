package session_08;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args)
	{
		String str="JSPM";
		System.out.println(str);
		str=str.concat(" Wagholi");
		System.out.println(str);
		System.out.println(str.length());
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Character:");
		char ch=s.next().charAt(0);
		System.out.println("ch="+ch);
		
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(4));
	}

}
