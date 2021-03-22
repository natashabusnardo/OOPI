package lista03;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Insira o nome ");
		String usuario = entrada.nextLine();
		int count = usuario.length();

		while (count < 3) {
			System.out.print("Insira um nome com mais de 3 caracteres: ");
			usuario = entrada.nextLine();
			count = usuario.length();
		}

		System.out.print("Insira a idade ");
		int idade = entrada.nextInt();
		while ((idade < 0) && (idade > 150)) {
			System.out.println("Insira uma idade válida.");
			idade = entrada.nextInt();
		}

		System.out.print("Insira o salário ");
		float salario = entrada.nextFloat();
		while (salario < 0) {
			System.out.println("Insira um salário positivo.");
			salario = entrada.nextInt();
		}

		System.out.print("Insira o sexo ");
		char sexo = entrada.next().charAt(0);
		while ((sexo != 'F') && (sexo != 'M')) {
			System.out.print("Insira um sexo válido. ");
			sexo = entrada.next().charAt(0);
		}

		System.out.print("Insira o estado civil ");
		char ecivil = entrada.next().charAt(0);
		while ((ecivil != 'S') && (ecivil != 'C') && (ecivil != 'V') && (ecivil != 'D')) {
			System.out.print("Insira um estado civil válido. ");
			ecivil = entrada.next().charAt(0);
		}
		entrada.close();
	}
}
