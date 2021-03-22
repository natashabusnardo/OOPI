package lista01;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Faça um Programa que converta metros para centímetros. */
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor em metros: ");
		double metros = entrada.nextDouble();
		
		entrada.close();
		
		double centimetros = metros*100;
		
		System.out.println(metros+" metros são "+centimetros+" centímetros.");
		
	}

}
