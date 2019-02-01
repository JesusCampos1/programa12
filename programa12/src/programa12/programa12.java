package programa12;

import java.util.Scanner;

public class programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double noCali=0,prom=0, cali=0, suma=0;
		int i=1;
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese el numero de calificaciones: ");
		i = leer.nextInt();
		do {
			System.out.print("Ingrese la calificacion "+i+":" );
			cali=leer.nextDouble();
			
			i++;
		}while(i<=noCali);
		prom=(cali/noCali);
		if(prom>=0 && prom<=49) {
			System.out.println("Suspenso");
		if (prom>=50 && prom<69) {
			System.out.println("Aprobado");
		if (prom>=70 && prom<89) {
			System.out.println("Notable");
		if (prom>=90 && prom<=99) {
			System.out.println("Sobresaliante");
		if (prom==100) {
			System.out.println("Matricula de honor");
		}
		}
		}
		}
		}
		
		

	}

}
