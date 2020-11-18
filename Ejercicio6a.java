import java.util.Scanner;
import java.util.Random;
public class Ejercicio6a {
	public static void main (String agr []){
		int opcion=0;
		int suma=0;
		int carta=0;
		
		Random rt =new Random();
		Scanner sc =new Scanner (System.in);
		
		System.out.println("pulsa 1 para xogar contra a máquina");
		System.out.println("pulsa 2 para xogar contra o xogador");
		System.out.println("pulsa 3 para sair");
		opcion=sc.nextInt();
		switch(opcion){
			case 1:{
					while(suma<21){
						carta=rt.nextInt(9)+1;
						suma=suma+carta;
					}
				System.out.println("Tus cartas suman "+suma);
			}		
				break;
			case 2:{
				
				break;
			}
			case 3:{
				System.out.println("O usuario deixa de xogar");
				break;
			}
		}
	}
}
