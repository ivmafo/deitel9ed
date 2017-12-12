package chapter2;

import java.util.Scanner;

// calcula el producto de tres numeros
public class SelfReview2_5 {
	//comentario
	public static void main (String[] args) {
		int x,y,z,result ; 
		Scanner _x = new Scanner(System.in) ; 
		Scanner _y = new Scanner(System.in) ;
		Scanner _z = new Scanner(System.in) ;
		System.out.println("ingrese primer multiplo:");
		x = _x.nextInt() ; 
		System.out.println("ingrese segundo multiplo:");
		y = _y.nextInt() ; 
		System.out.println("ingrese tercer multiplo:");
		z = _z.nextInt() ; 
		result = x * y * z ; 
		System.out.println("Product is :"+result);
	}

}
