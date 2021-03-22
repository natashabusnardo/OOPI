package Exercicio06;

import java.util.Scanner;

public class CardapioMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Cardapio cardapio = new Cardapio();
		ListCodigos list = new ListCodigos();

		int codigo = 0;
		float qtd = 0;
		char opcao = 0;

		System.out.println("Informe o pedido: ");
		do {
			do {
				System.out.print("Código: ");
				codigo = entrada.nextInt();
			} while (codigo < 100 || codigo > 105);
			System.out.println("Quantidade deste produto: ");
			qtd = entrada.nextFloat();
			cardapio.setCodigo(codigo);
			cardapio.setQtd(qtd);
			list.inserir(cardapio);
			cardapio = new Cardapio();
			do {
				System.out.println("Mais algum pedido? (s - Sim | n - Não)");
				opcao = entrada.next().charAt(0);
			} while (opcao != 's' && opcao != 'n');
		} while (opcao == 's');
		
		list.calcular();
		entrada.close();
	}
}
