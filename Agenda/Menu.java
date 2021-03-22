import java.util.Scanner;

public class Menu {
	public static int menu() {
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		
		StringBuilder builder = new StringBuilder();
		
		builder.append("\n ----------Agenda------------");
		builder.append("\n1 - Inserção");
		builder.append("\n2 - Alteração ");
		builder.append("\n3 - Exclusão");
		builder.append("\n4 - Listar");
		builder.append("\n5 - Sair");
                
                System.out.println(builder.toString());
                
		opcao = Integer.parseInt(entrada.nextLine());
		
		return opcao;
	}
}