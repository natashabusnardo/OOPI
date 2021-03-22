package Exercicio11;

public class BombaCombustivelMain {

	public static void main(String[] args) {

		BombaCombustivel bomba = new BombaCombustivel();
		bomba.setQuantidadeCombustivel(1000);
		bomba.setTipoCombustivel("Gasolina");
		bomba.setValorLitro(2);
		System.out.println(bomba.toString());
		
		System.out.println(bomba.abastecerPorValor(400));
		System.out.println(bomba.toString());
		
		System.out.println(bomba.abastecerPorLitro(100));
		System.out.println(bomba.toString());
		
		bomba.alterarValor((float)3.50);
		System.out.println(bomba.toString());
		
		bomba.alterarCombustivel("Diesel");
		System.out.println(bomba.toString());
		
		bomba.alterarQuantidadeCombustivel(2000);
		System.out.println(bomba.toString());
		
		
		
		
		
	}
}
