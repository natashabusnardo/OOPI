package lista01;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		/*Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o raio do c�rculo: ");
		double raio = entrada.nextDouble();
		
		entrada.close();
		
		double area = Math.PI*Math.pow(raio,2);
		
		System.out.printf("A �rea do circulo �: %.2f",area);
		
	}
}
