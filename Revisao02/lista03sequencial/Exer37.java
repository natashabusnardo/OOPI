package lista03;

import java.util.Scanner;

public class Exer37 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int maior = 0, menor = 0, cont = 0, soma = 0, nota = 0;
		char[] perguntas = new char[10];
		char[] respostas = new char[10];
		boolean primeiro = true;

		System.out.print("Insira o código de acesso: ");
		int n = entrada.nextInt();

		while (n > 0) {
			if (n == 1) {
				System.out.println("Digite o gabarito da prova:");
				for (int i = 0; i < respostas.length; i++) {

					System.out.println("Pergunta " + (i + 1) + ":");
					perguntas[i] = entrada.next().charAt(0);
				}

			}
			if (n == 2) {
				nota = 0;
				cont++;
				System.out.println("Digite a resposta da prova:");
				for (int j = 0; j < respostas.length; j++) {
					System.out.println("Pergunta " + (j + 1) + ":");
					respostas[j] = entrada.next().charAt(0);

					if (respostas[j] == perguntas[j]) {
						nota++;
					}

				}
				soma = soma + nota;

				if (primeiro) {
					maior = nota;
					menor = nota;
					primeiro = false;
				} else if (nota > maior) {
					maior = nota;
				} else if (nota < menor) {
					menor = nota;
				}
			} else {
				System.out.println("Insira um código válido.");
			}

			System.out.print("Insira 2 para uma nova prova e 0 para sair: ");
			n = entrada.nextInt();
		}
		entrada.close();

		System.out.println("Maior acerto: " + maior);
		System.out.println("Menor acerto: " + menor);
		System.out.println("Média das notas da turma: " + (soma / cont));

	}
}
