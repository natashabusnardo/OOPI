package lista03;
import java.util.Scanner;
public class Exer02 {

	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digita o nome de usuário ");
		String nome = entrada.nextLine();
		
		System.out.println("Digita a seha do usuário ");
		String senha = entrada.nextLine();
		
		
		while (senha.contentEquals(nome)) {
			System.out.println("Senha igual ao usuário, insira a senha novamente: ");
			senha = entrada.nextLine();
		}
		entrada.close();
		
	}
}
