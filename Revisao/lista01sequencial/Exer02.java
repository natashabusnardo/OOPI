package lista01;

import java.util.Scanner;

public class Exer02 {
	
	public static void main(String[] args) {
		/*Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero]. */
		
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		int numero = entrada.nextInt();
		
		System.out.println("O n�mero informado foi "+numero+".");
	}

}
