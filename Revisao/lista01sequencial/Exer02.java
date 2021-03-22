package lista01;

import java.util.Scanner;

public class Exer02 {
	
	public static void main(String[] args) {
		/*Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. */
		
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int numero = entrada.nextInt();
		
		System.out.println("O número informado foi "+numero+".");
	}

}
