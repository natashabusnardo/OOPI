package lista01;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Faça um Programa que peça as 4 notas bimestrais e mostre a média. */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe as quatro notas bimestrais");
		double nota1 = entrada.nextDouble();
		double nota2 = entrada.nextDouble();
		double nota3 = entrada.nextDouble();
		double nota4 = entrada.nextDouble();
		
		entrada.close();
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("A média bimestral é: %.2f",media); //%.2f imprime a variável com duas casas apos a virgula

	}

}
