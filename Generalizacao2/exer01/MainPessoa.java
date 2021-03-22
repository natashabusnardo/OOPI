package exer01;

public class MainPessoa {
	public static void main(String[] args) {
		PessoaFisica pF = new PessoaFisica();
		PessoaJuridica pJ = new PessoaJuridica();

		pF.setNome("Natasha");
		pF.setEndereco("Rio do Oeste");
		pF.setCpf("108.860.199-58");
		pF.setEstadoCivil("Solteira");

		pJ.setNome("Empresa Laranja");
		pJ.setEndereco("Rio do Sul");
		pJ.setCnpj("12.345.678/0001-90");
		pJ.setTipoEmpresa("Micro Empresa");

		System.out.println(pF);
		System.out.println(pJ);
	}
}
