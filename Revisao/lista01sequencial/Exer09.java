package lista01;
import java.util.Scanner;
public class Exer09 {
	public static void main(String[] args) {
		/*Fa�a um Programa que pe�a a temperatura em graus Farenheit, 
		 * transforme e mostre a temperatura em graus Celsius.*/

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em F�.");
		double farenheit = entrada.nextDouble();
		entrada.close();
		
		double celsius = (5 * (farenheit-32) / 9);
		
		System.out.printf("Celsius: %.1f �C",celsius);
		
	}
}
