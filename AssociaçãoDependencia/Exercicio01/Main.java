package Exercicio01;

public class Main {

	public static void main(String[] args) {

		HomeTheater h = new HomeTheater();
		
		h.som.setConsumo(1500);
		h.som.setMarca("P123");
		h.som.setModelo("Philco");
		h.som.setPotencia("144W");
		h.som.setTensao(220);
		
		h.video.setConsumo(456);
		h.video.setMarca("S123");
		h.video.setModelo("Samsung");
		h.video.setTensao(110);
		h.video.setResolução("4k");
		h.video.setTipo("4k");
		
		System.out.println(h.toString());
		System.out.println(h.video);
		System.out.println(h.som);
		
	}

}
