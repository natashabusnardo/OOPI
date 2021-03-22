package atividade;

public class Main {
	public static void main(String[] args) {
		
			Progressao p = new Progressao();
			
			p.setA1(1.4);
			p.setRazao(3);
			p.setQuantidade(10);
			p.setTipo(TipoProgressao.PA);
			p.setNome("teste");
			p.gerarProg();
			p.geragrafico();
			System.out.println(p);
	}
}
