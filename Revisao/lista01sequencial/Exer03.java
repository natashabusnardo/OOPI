package lista01;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fa�a um Programa que pe�a dois n�meros e imprima a soma. */
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe dois n�meros: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		int soma = num1+num2;
		
		System.out.println("A soma de "+num1+" + "+num2+" �: "+soma);
	}

}
