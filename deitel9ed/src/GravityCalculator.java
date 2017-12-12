
import java.util.Scanner;
import java.lang.Math;

public class GravityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//v(t) = 0.5	 * at2 + vit + xi
		double gravedad 		= -9.8 ; //a 
		double velInicial 	= 0 ;    //vi
		double tiempo 		= 0;    //tiempo de caida
		double posInicial   	= 0 ;
		
		Scanner input = new Scanner(System.in) ;
		System.out.println("Ingrese el tiempo de caida");
		tiempo = input.nextDouble();
		
		// posicion final
		double posFinal = (.5 * gravedad * java.lang.Math.pow(tiempo,2.0) ) 
				+ (velInicial*tiempo ) + (posInicial) ; 
		
		posFinal = gravedad % 10.0 ; 
		System.out.println("La posicion del objeto en caida libre despues de "+tiempo+" segundos es : "+ posFinal+" m");
	}

}
