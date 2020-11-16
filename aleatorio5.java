import java.util.Random;
import java.util.Scanner;
public class Aleatorio5 {
	public static void main (String agr []){
		int n1=0;
		int n2=0;
		int n3=0;
		int n4=0;
		int n5=0;
		int n6=0;
		int p1=0;
		int p2=0;
		int p3=0;
		int p4=0;
		int p5=0;
		int p6=0;
		int i=0;
		
		
		Random rt =new Random();
		n1=rt.nextInt(49)+1;
		n2=rt.nextInt(49)+1;
		n3=rt.nextInt(49)+1;
		n4=rt.nextInt(49)+1;
		n5=rt.nextInt(49)+1;
		n6=rt.nextInt(49)+1;	
		
		Scanner sc =new Scanner (System.in);
		System.out.println("Introduce un entre 1-49 número");
		p1=sc.nextInt();
		System.out.println("Introduce un entre 1-49 número");
		p2=sc.nextInt();
		System.out.println("Introduce un entre 1-49 número");
		p3=sc.nextInt();
		System.out.println("Introduce un entre 1-49 número");
		p4=sc.nextInt();
		System.out.println("Introduce un entre 1-49 número");
		p5=sc.nextInt();
		System.out.println("Introduce un entre 1-49 número");
		p6=sc.nextInt();
		while (i¡=0){
			if((p1==n1)||(p2==n2)||(p3==n3)||(p4==n4)||(p5==n5)||(p6==n6)){
			i++;
		}
	}
	System.out.println("El número ganador es "+n1+","+n2+","+n3+","+n4+","+n5+","+n6);
	System.out.println("acertaste"+i+"Números");
}
}
