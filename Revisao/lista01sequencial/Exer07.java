package lista01;
import java.util.Scanner;
/*Faça um Programa que calcule e mostre a área de um quadrado. */
public class Exer07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o lado do quadrado: ");
		int lado = entrada.nextInt();
		entrada.close();
		
		int area = lado * lado;
		
		
		System.out.println("A área do quadrado é "+area+".");
		
	}
}
