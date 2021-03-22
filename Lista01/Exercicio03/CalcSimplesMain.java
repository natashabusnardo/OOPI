package Exercicio03;

import java.util.Scanner;

public class CalcSimplesMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		CalculadoraSimples c = new CalculadoraSimples();
		
		System.out.println("Primeiro número: ");
		c.setUm(entrada.nextInt());
		System.out.println("Segundo número: ");
		c.setDois(entrada.nextInt());
		
		entrada.close();
		
		System.out.println("Adição:  "+c.Adicao());
		System.out.println("Subração:  "+c.Subtracao());
		System.out.println("Multiplicação:  "+c.Multiplicacao());
		System.out.println("Divisão:  "+c.Divisao());
		
	}
}
