package lista01;
import java.util.Scanner;
/*Fa�a um Programa que calcule e mostre a �rea de um quadrado. */
public class Exer07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o lado do quadrado: ");
		int lado = entrada.nextInt();
		entrada.close();
		
		int area = lado * lado;
		
		
		System.out.println("A �rea do quadrado � "+area+".");
		
	}
}
