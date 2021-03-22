import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExtratorURL {

	private static final String URL_API = "http://www.curvello.com/gerador/Contato/30";

	public static List<Contato> extrairUrl() {
		List<Contato> ContatoLista = new ArrayList<Contato>();
		HttpURLConnection con = null;
		try {
			System.out.println("teste");
			URL url = new URL(URL_API);
			con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();

			switch (con.getResponseCode()) {
			case 200:

				System.out.println("JSON recebido!");
				String json = getJson(url);
				String[] Contato = json.split("}");

				for (int i = 0; i < Contato.length - 1; i++) {
					Contato ContatoP = new Contato();
					Contato[i] = Contato[i].substring(1, Contato[i].length());
					String[] atributosContato = Contato[i].split(",");
					for (int j = 0; j < atributosContato.length; j++) {
						atributosContato[j] = atributosContato[j].replace("\"", "");
						atributosContato[j] = atributosContato[j].replace("{", "");
						atributosContato[j] = atributosContato[j].replace("\\", "");
						atributosContato[j] = atributosContato[j].replace("/", "-");

					}

					String[] ContatoS = atributosContato[0].split(":");
					ContatoP.setCodigo(Integer.parseInt(ContatoS[1]));
					ContatoS = atributosContato[1].split(":");
					ContatoP.setNome(ContatoS[1]);
					ContatoS = atributosContato[2].split(":");
					ContatoP.setEmail(ContatoS[1]);
					ContatoS = atributosContato[3].split(":");
					ContatoP.setTelefone(ContatoS[1]);
					ContatoS = atributosContato[4].split(":");
					ContatoS = ContatoS[1].split("-");
					Calendar calendario = Calendar.getInstance();
					calendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(ContatoS[0]));
					calendario.set(Calendar.MONTH, Integer.parseInt(ContatoS[1]) - 1);
					calendario.set(Calendar.YEAR, Integer.parseInt(ContatoS[2]));
					Date data = calendario.getTime();
					ContatoP.setDataNasc(data);
					ContatoLista.add(ContatoP);

				}

				break;
			case 500:
				System.out.println("Status 500");
				break;
			default:
				System.out.println("teste1");
				break;

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				con.disconnect();
		}
		return ContatoLista;
	}

	public static String getJson(URL url) {
		if (url == null)
			throw new RuntimeException("URL é null");

		String html = null;
		StringBuilder sB = new StringBuilder();
		try (BufferedReader bR = new BufferedReader(new InputStreamReader(url.openStream()))) {
			while ((html = bR.readLine()) != null)
				sB.append(html);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sB.toString();

	}
}