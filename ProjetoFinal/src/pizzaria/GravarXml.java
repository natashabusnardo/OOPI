package pizzaria;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class GravarXml implements Gravacao {

	public List<Pedido> ler() throws ParseException {
		try {
			List<Pedido> lista = new ArrayList<Pedido>();
			FileInputStream fis = new FileInputStream("pedidos.xml");
			BufferedInputStream buff = new BufferedInputStream(fis);
			XMLDecoder xml = new XMLDecoder(buff);
			lista = (List<Pedido>) xml.readObject();
			xml.close();
			return lista;
		} catch (IOException e) {
			System.err.printf("Erro na Abertura do Arquivo: %s. \n", e.getMessage());
			return null;
		}
	}

	public boolean gravar(List<Pedido> lista) {
		try {
			FileOutputStream fos = new FileOutputStream("pedidos.xml", true);
			BufferedOutputStream buff = new BufferedOutputStream(fos);
			XMLEncoder xml = new XMLEncoder(buff);
			xml.writeObject(lista);
			xml.close();

			return true;
		} catch (IOException e) {
			return false;
		}
	}
}