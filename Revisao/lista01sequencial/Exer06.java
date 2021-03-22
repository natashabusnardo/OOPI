package lista01;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		/*Faça um Programa que peça o raio de um círculo, calcule e mostre sua área. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo: ");
		double raio = entrada.nextDouble();
		
		entrada.close();
		
		double area = Math.PI*Math.pow(raio,2);
		
		System.out.printf("A área do circulo é: %.2f",area);
		
	}
}
