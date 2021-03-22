package lista01;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Faça um Programa que peça dois números e imprima a soma. */
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe dois números: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		int soma = num1+num2;
		
		System.out.println("A soma de "+num1+" + "+num2+" é: "+soma);
	}

}
