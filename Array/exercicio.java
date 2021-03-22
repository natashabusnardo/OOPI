import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		Random generator = new Random();

		char resposta = 'S';
		final int max = 100;
		boolean primo = true;
		int soma = 0;
		double media = 0;
		int vezes = 0;
		int moda = 0;
		double variancia = 0;
		double desvioPadrao = 0;

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		ArrayList<Integer> primos = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> impares = new ArrayList<Integer>();

		while (resposta == 'S') {
			System.out.println("Informe a quantidade de números desejada:");
			int qtd = entrada.nextInt();

			if (qtd > 0) {

				for (int i = 0; i < qtd; i++) {
					numeros.add(generator.nextInt(generator.nextInt(max)));
				}

				int menorNumero = numeros.get(0);
				int maiorNumero = numeros.get(0);

				Collections.sort(numeros);

				System.out.println("Lista de números:" +numeros);

				for (Integer numero : numeros) {

					if (numero > maiorNumero)
						maiorNumero = numero;

					if (numero < menorNumero)
						menorNumero = numero;

					if (numero % 2 == 0)
						pares.add(numero);
					else
						impares.add(numero);

					for (int i = 2; i < numero; i++) {
						if ((i != numero) && (numero % i == 0)) {
							primo = false;
							break;
						}
					}
					if (primo == true)
						primos.add(numero);

					primo = true;

					soma = soma + numero;
					double somaNumeros = 0.0f;

					for (int i = 0; i < numeros.size(); i++) {
						somaNumeros += Math.pow(numeros.get(i), 2);
					}

					variancia = (somaNumeros / numeros.size()) - (Math.pow(media, 2));
					desvioPadrao = Math.sqrt(variancia);

				}
				int esquerda = 0;
				int direita = numeros.size();
				int meio = (esquerda + direita) / 2;
				int mediana = numeros.get(meio);

				media = soma / qtd;

				System.out.println("Maior número: " + maiorNumero);
				System.out.println("Menor número: " + menorNumero);
				System.out.println("Pares: " + pares);
				System.out.println("Ímpares: " + impares);
				System.out.println("Primos: " + primos);
				System.out.println("Soma: " + soma);
				System.out.println("Média: " + media);
				System.out.println("Moda: " + moda);
				System.out.println("Mediana: " + mediana);
				System.out.println("Variância: " + variancia);
				System.out.println("Desvio Padrão: " + desvioPadrao);

				System.out.println("Deseja continuar?");
				resposta = entrada.next().charAt(0);
			}
			else {
				System.out.println("Informe um valor válido. (maior que zero)");
			}
		}
		System.out.println("Obrigado e volte sempre!");
	}

}
