
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ListaContatos lista = new ListaContatos();
		Scanner entrada = new Scanner(System.in);

		int opcao = 0;
		while (opcao != 5) {

			opcao = Menu.menu();

			switch (opcao) {
			case 1:
				Contato c = new Contato();
				System.out.println("Insira o código: ");
				c.setCodigo(entrada.nextInt());
				System.out.println("Insira o nome: ");
				c.setNome(entrada.nextLine());
				System.out.println("Insira o e-mail: ");
				c.setEmail(entrada.nextLine());
				System.out.println("Insira o telefone: ");
				c.setTelefone(entrada.nextLine());
				System.out.println("Insira seu aniversário: ");
				Date data2 = ListaContatos.retornaData(entrada.nextLine());

				if (data2 != null)
					c.setDataNasc(data2);
				else
					System.out.println("kkkbozonaro");

				lista.inserir(c);
				break;

			case 2:
				/*System.out.println("Informe o código do cliente: ");
				ListaContatos.alterar(entrada.nextInt());
				break;*/

			case 3:
				/*System.out.println("Informe o código do cliente: ");
				ListaContatos.excluir(entrada.nextInt());*/
				break;
			case 4:
				// listar
				break;
			case 5:
				System.out.println("Obrigada. Volte Sempre!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;

			}
		}
	}

}
