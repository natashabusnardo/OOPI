package Exercicio06;

public class MainInstrumentoMusical {

	public static void main(String[] args) {

		Fagote fagote  = new Fagote();
		fagote.setPalhetaDupla(true);
		fagote.setTuboConico((float)2.5);
		fagote.setPalheta("Palheta Dupla");
		fagote.setVibracaoPalhetasDeMadeira(true);
		fagote.setCor("Vermelho");
		fagote.setRegistro("Grave");
		fagote.setTessitura("D�2 � D�4");
		fagote.setTimbre(144);
		
		System.out.println(fagote.produzirSom("si, si, l�, d�, d�, mi"));
		System.out.println(fagote);
		
		Saxofone saxofone = new Saxofone();
		saxofone.setChaves(23);
		saxofone.setLatao(true);
		saxofone.setBocal(true);
		saxofone.setCampanula(true);
		saxofone.setTuboConico(true);
		saxofone.setCor("Dourado");
		saxofone.setRegistro("Grave");
		saxofone.setTessitura("D�2 � D�4");
		saxofone.setTimbre(144);
		
		System.out.println(saxofone.ativacao(true));
		System.out.println(saxofone.produzirSom("d�, d�, d�, f�, si, si"));
		System.out.println(saxofone);
		
		Trompete trompete = new Trompete();
		trompete.setNotas(true);
		trompete.setPistoes(3);
		trompete.setBocal(true);
		trompete.setCampanula(true);
		trompete.setTuboConico(true);
		trompete.setCor("Dourado");
		trompete.setRegistro("Agudo");
		trompete.setTessitura("D�2 � D�4");
		trompete.setTimbre(144);
		
		System.out.println(trompete.ativacao(true));
		System.out.println(trompete.produzirSom("d�, r�, mi"));
		System.out.println(trompete);
		
		Tuba tuba = new Tuba();
		tuba.setPistoes(4);
		tuba.setValvula(true);
		tuba.setBocal(true);
		tuba.setCampanula(true);
		tuba.setTuboConico(true);
		tuba.setCor("Dourado");
		tuba.setRegistro("Agudo");
		tuba.setTessitura("D�-1 - F�3");
		tuba.setTimbre(144);
		
		System.out.println(tuba.ativacao(true));
		System.out.println(tuba.produzirSom("r�, r�, mi, f�, sol"));
		System.out.println(tuba);
		
		Violao violao = new Violao();
		violao.setBraco(true);
		violao.setPestana(true);
		violao.setCavalete(true);
		violao.setCordas(6);
		violao.setTensaoCorda(true);
		violao.setCor("Azul");
		violao.setRegistro("Agudo");
		violao.setTessitura("Mi - Mi");
		violao.setTimbre(144);
		
		System.out.println(violao.ativacao(true));
		System.out.println(violao.produzirSom("d�, d�, r�, r�, mi, f�, sol"));
		System.out.println(violao);
		
		Piano piano = new Piano();
		piano.setMartelo(true);
		piano.setPedais(2);
		piano.setTeclas(88);
		piano.setCavalete(true);
		piano.setCordas(88);
		piano.setTensaoCorda(true);
		piano.setCor("Marron");
		piano.setRegistro("Agudo");
		piano.setTessitura("Mi - Mi");
		piano.setTimbre(144);
		
		System.out.println(piano.ativacao(true));
		System.out.println(piano.produzirSom("d�, d�, r�, r�, mi, mi, f�, f�"));
		System.out.println(piano);
		
		Tambor tambor = new Tambor();
		tambor.setCorpo(true);
		tambor.setMembrana(true);
		tambor.setAltura(true);
		tambor.setCor("Branco");
		tambor.setRegistro("Grave");
		tambor.setTessitura("D�");
		tambor.setTimbre(144);
		
		System.out.println(tambor.ativacao(true));
		System.out.println(tambor.produzirSom("mi, mi, f�, f�, sol, sol"));
		System.out.println(piano);
		
		Prato prato = new Prato();
		prato.setCategoria("Prato de Choque");
		prato.setLigaDeMetal(true);
		prato.setAltura(true);
		prato.setCor("Prata");
		prato.setRegistro("Grave");
		prato.setTessitura("R�");
		prato.setTimbre(144);
		
		System.out.println(prato.ativacao(true));
		System.out.println(prato.produzirSom("r�, r�, d�, d�"));
		System.out.println(prato);
		
	}
}
