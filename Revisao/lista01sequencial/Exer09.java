package lista01;
import java.util.Scanner;
public class Exer09 {
	public static void main(String[] args) {
		/*Faça um Programa que peça a temperatura em graus Farenheit, 
		 * transforme e mostre a temperatura em graus Celsius.*/

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Fº.");
		double farenheit = entrada.nextDouble();
		entrada.close();
		
		double celsius = (5 * (farenheit-32) / 9);
		
		System.out.printf("Celsius: %.1f ºC",celsius);
		
	}
}
