package exer03;

public class MainConta {
	public static void main(String[] args) {

		ContaSimples cs = new ContaSimples();
		ContaEspecial ce = new ContaEspecial();

		cs.setBanco("Banco do Brasil");
		cs.setAgencia(1);
		cs.setNumeroconta(345);
		cs.setSaldo(9000);
		cs.setSaldoPoupanca(4500);

		System.out.println(cs.saque(150));
		System.out.println(cs.deposito(790));
		System.out.println(cs.saquePoupanca(100));
		System.out.println(cs.depositoPoupanca(2500));

		ce.setBanco("Bradesco");
		ce.setAgencia(2);
		ce.setNumeroconta(678);
		ce.setSaldo(50000);
		ce.setDiasSemJuros(7);
		ce.setLimite(790000);

		System.out.println(ce.saque(3000));
		System.out.println(ce.deposito(400));

		System.out.println(cs);
		System.out.println(ce);

	}

}
