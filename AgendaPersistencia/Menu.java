import java.util.Scanner;

public class Menu {
	public static int menu() {
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("\n ----------Agenda------------");
		builder.append("\n1 - Inser��o");
		builder.append("\n2 - Altera��o ");
		builder.append("\n3 - Exclus�o");
		builder.append("\n4 - Listar");
		builder.append("\n5 - Pesquisa por nome");
		builder.append("\n6 - Aniversariantes do m�s");
		builder.append("\n7 - Consulta por dom�nio de e-mail");
		builder.append("\n8 - Consulta por dom�nio de e-mail");
		builder.append("\n9 - Deseja importar dados?");
		builder.append("\n5 - Sair");
                
                System.out.println(builder.toString());
                
		opcao = Integer.parseInt(entrada.nextLine());
		
		return opcao;
	}
}