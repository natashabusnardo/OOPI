package Exercicio08;

import java.util.Scanner;

public class MainPessoa {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		Pessoa pes = new Pessoa();
		String nome;
		int idade;
		float peso;
		float altura;
		
		do {
		System.out.print("Informe o nome: ");
		nome = entrada.nextLine();
		}while (nome.length() == 0);
		do {
		System.out.print("Informe a idade: ");
		idade = entrada.nextInt();
		}while (idade < 0);
		do {
		System.out.print("Informe o peso: ");
		peso = entrada.nextFloat();
		}while (peso <= 0);
		do {
		System.out.print("Informe a altura: ");
		altura = entrada.nextFloat();
		}while (altura <= 0);
		
		pes.setNome(nome);
		pes.setIdade(idade);
		pes.setPeso(peso);
		pes.setAltura(altura);

		pes.emagrecer();
		System.out.println(pes);
		pes.engordar();
		System.out.println(pes);
		pes.envelhecer();
		System.out.println(pes);
		
		
		entrada.close();
	}

}
