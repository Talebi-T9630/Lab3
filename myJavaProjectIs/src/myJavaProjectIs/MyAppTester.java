/**
 * 
 */
package myJavaProjectIs;

import java.util.Scanner;

/**
 * @author taran
 *
 */
public class MyAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Hello software Engineering world!");
		System.out.println("Enter and input a number ");
		int n=input.nextInt();
		System.out.println("The reverse of your input is:");
		ReverseMethod(n);
	}

	 //this is the stage where we are on branch b1
	//this is cool hahhahaha
	// the method to reversing a number in recursion 

	public static void ReverseMethod(int num) {
		if(num<10) {
			System.out.println(num);
			return;
		}
		else {
			System.out.println(num % 10);
			ReverseMethod(num/10);
		}
	}

}
