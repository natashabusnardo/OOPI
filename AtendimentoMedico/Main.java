import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		 Menu menu = new Menu();

		int opcao = 0;

		do {
			opcao = menu.buildMainMenu();
			menu.selecionarOpcao(opcao);
		} while (opcao != 7);
		
	}
}
