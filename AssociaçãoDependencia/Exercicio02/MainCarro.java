package Exercicio02;

public class MainCarro {

	public static void main(String[] args) {

		Carro carro = new Carro();
		carro.setModelo("Modelo1");
		carro.setFabricante("Fiat");
		carro.setAno(2017);
		carro.setCor("Preto");
		
		carro.dono.setEndereco("Rua Bulc�o");
		carro.dono.setNome("Jos�");
		carro.motor.setMarca("vVv");
		carro.motor.setCilindros(250);
		carro.motor.setCombustivel("Gasolina");
		carro.motor.setPotencia(200);
		
		System.out.println(carro.toString());
	}
}
