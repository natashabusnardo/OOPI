package lista03;

import java.util.Scanner;

public class Exer23 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Insira o n�mero de turmas:");
		int numt = entrada.nextInt();

		int soma = 0;
		int cont = 0;
		int numa = 0;
		float media = 0;
		for (int i = 0; i < numt; i++) {

			System.out.print("Informe o n�mero de alunos: ");
			numa = entrada.nextInt();
			if ((numa < 0) && (numa > 40)) {
				System.out.println("Informe um n�mero positivo.");
				numa = entrada.nextInt();
			}
			soma = soma + numa;
			cont++;

		}
		entrada.close();
		media = soma / cont;

		System.out.println("M�dia de alunos da turma: " + media);

	}
}
