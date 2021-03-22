package exer02;

public class MainItem {
	public static void main(String[] args) {
		Livro livro = new Livro();
		CD cd = new CD();
		VHS vhs = new VHS();
		
		livro.setCodigo(123);
		livro.setDescricao("A menina que roubava livros");
		livro.setAutor("Markus Zusak");

		cd.setCodigo(456);
		cd.setDescricao("Swish");
		cd.setDuracao(32);
		cd.setGravadora("Eletric Feel Music");
		cd.setAlbum("These Days");
		cd.setArtista("mike.");
		cd.setFaixas(10);

		vhs.setCodigo(789);
		vhs.setDescricao("Engenheiros do Hawaii");
		vhs.setDuracao(2);
		vhs.setGravadora("jkhgfsdkjg");
		vhs.setTitulo("Dois");

		System.out.println(livro);
		System.out.println(cd);
		System.out.println(vhs);

	}
}
