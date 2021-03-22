
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		ListaContatos lista = new ListaContatos();
		Scanner entrada = new Scanner(System.in);
		GravarCSV csv = new GravarCSV();
		JSON json = new JSON();
		GravarXml xml = new GravarXml();
		Persistencia pers = new Persistencia(csv);
		Persistencia pers2 = new Persistencia(xml);
		Persistencia pers3 = new Persistencia(json);

		int opcao = 0;
		while (opcao != 5) {

			opcao = Menu.menu();

			switch (opcao) {
			case 1:
				Contato c = new Contato();
				System.out.println("Insira o código: ");
				c.setCodigo(Integer.parseInt(entrada.nextLine()));
				System.out.println("Insira o nome: ");
				c.setNome(entrada.nextLine());
				System.out.println("Insira o e-mail: ");
				c.setEmail(entrada.nextLine());
				System.out.println("Insira o telefone: ");
				c.setTelefone(entrada.nextLine());
				System.out.println("Insira seu aniversário (dd/mm/aaaa): ");
				String aniver = entrada.nextLine();
				Calendar calendario = Calendar.getInstance();
				calendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(aniver.substring(0, 2)));
				calendario.set(Calendar.MONTH, Integer.parseInt(aniver.substring(3, 5)));
				calendario.set(Calendar.YEAR, Integer.parseInt(aniver.substring(6)));
				Date data2 = calendario.getTime();
				c.setDataNasc(data2);
				//Date data2 = ListaContatos.retornaData(entrada.nextLine());


				lista.inserir(c);
				pers.gravar(lista.getLista());
				break;

			case 2:
				System.out.println("Informe o código do cliente: ");
				Contato cn = new Contato();
				System.out.println("Insira o código: ");
				cn.setCodigo(Integer.parseInt(entrada.nextLine()));
				System.out.println("Insira o nome: ");
				cn.setNome(entrada.nextLine());
				System.out.println("Insira o e-mail: ");
				cn.setEmail(entrada.nextLine());
				System.out.println("Insira o telefone: ");
				cn.setTelefone(entrada.nextLine());
				System.out.println("Insira seu aniversário (dd/mm/aaaa): ");
				String anivern = entrada.nextLine();
				Calendar calendarion = Calendar.getInstance();
				calendarion.set(Calendar.DAY_OF_MONTH, Integer.parseInt(anivern.substring(0, 2)));
				calendarion.set(Calendar.MONTH, Integer.parseInt(anivern.substring(3, 5)));
				calendarion.set(Calendar.YEAR, Integer.parseInt(anivern.substring(6)));
				Date datan = calendarion.getTime();
				cn.setDataNasc(datan);
				lista.alterar(cn, Integer.parseInt(entrada.nextLine()));
				break;
			case 3:
				/*System.out.println("Informe o código do cliente: ");
				ListaContatos.excluir(entrada.nextInt());
				break;*/
			case 4:
				// listar
				break;
			case 5:
				System.out.println("Obrigada. Volte Sempre!");
				break;
			case 9:
				System.out.println(ExtratorURL.extrairUrl());
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;

			}
		}
	}

}
