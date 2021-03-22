package lista03;

import java.util.Scanner;

public class Exer13 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira um número: ");
		int num = entrada.nextInt();

		entrada.close();

		int fat = 1;

		for (int i = num; i >= 1; i--) {
			fat = fat * i;
		}
		System.out.println(fat);
	}
}
