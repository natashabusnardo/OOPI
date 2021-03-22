package lista03;

import java.util.Scanner;

public class Exer38 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira um número: ");
		Integer num = entrada.nextInt();
		entrada.close();
		String conv = num.toString();
		String inv = "";
		for (int i = conv.length(); i > 0; i--) {
			inv += conv.substring(i - 1, i);
		}
		System.out.println("numero invertido: " + inv);
	}
}
