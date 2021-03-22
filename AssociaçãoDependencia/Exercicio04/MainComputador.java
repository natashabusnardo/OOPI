package Exercicio04;

public class MainComputador {

	public static void main(String[] args) {

		Computador computador = new Computador();
		computador.setMarca("Dell");
		computador.setModelo("Inspiron");
		computador.setTensao(230);
		computador.setConsumo(80);
		computador.mouse.setMarca("Fortrek");
		computador.mouse.setTipo("Gamer");
		computador.teclado.setMarca("Fortrek");
		computador.teclado.setTipo("Teclado Mecânico - Gamer");
		computador.monitor.setMarca("HyperX");
		computador.monitor.setTipo("Gamer");
		computador.monitor.setResolucao("4k");
		computador.gabinete.setModelo("HyperX");
		computador.gabinete.setTipo("Gamer");
		computador.gabinete.setBaias(2);
		computador.gabinete.placamae.setMarca("Razer");
		computador.gabinete.placamae.setModelo("dell-3151");
		computador.gabinete.placamae.hd.setCapacidade(500);
		computador.gabinete.placamae.hd.setMarca("Samsung");
		computador.gabinete.placamae.hd.setModelo("sg-32");
		computador.gabinete.placamae.hd.setRpm(7200);
		computador.gabinete.placamae.memoria.setCapacidade(12);
		computador.gabinete.placamae.memoria.setMarca("SG");
		computador.gabinete.placamae.memoria.setModelo("sg-88");
		computador.gabinete.placamae.memoria.setVelocidade(2000);
		computador.gabinete.placamae.processador.setMarca("Intel");
		computador.gabinete.placamae.processador.setModelo("i7");
		computador.gabinete.placamae.processador.setCache(12);
		computador.gabinete.placamae.processador.setClock(3);
		
		System.out.println(computador.toString());
		
		
	}

}
