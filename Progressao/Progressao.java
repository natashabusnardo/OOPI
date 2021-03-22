package atividade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.channels.Channels;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Progressao {
	private double a1;
	private double razao;
	private int quantidade;
	private GravarJSON grava = new GravarJSON();
	private TipoProgressao tipo;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getA1() {
		return a1;
	}

	public void setA1(double a1) {
		this.a1 = a1;
	}

	public double getRazao() {
		return razao;
	}

	public void setRazao(double razao) {
		this.razao = razao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public TipoProgressao getTipo() {
		return tipo;
	}

	public void setTipo(TipoProgressao tipo) {
		this.tipo = tipo;
	}

	public void gerarProg() {
		if (tipo == TipoProgressao.PA) {
			grava.gravar(pa());
		} else if (tipo == 	TipoProgressao.PG) {
			grava.gravar(pg());
		}

	}

	public ArrayList<Double> pa() {
		ArrayList<Double> pa = new ArrayList<Double>();
		Double valorinicia = a1;
		pa.add(a1);
		if (razao >= 1) {
			for (int i = 0; i < quantidade; i++) {
				valorinicia += razao;
				pa.add(valorinicia);
			}
			return pa;
		} else {
			return null;

		}
	}

	public ArrayList<Double> pg() {
		ArrayList<Double> pg = new ArrayList<Double>();
		Double valorinicia = a1;
		pg.add(a1);
		if (razao >= 1) {
			for (int i = 0; i < quantidade; i++) {
				valorinicia += razao;
				pg.add(valorinicia);
			}
			return pg;
		} else {
			return null;

		}
	}
	
	public void geragrafico() {

		String html = "<html>\r\n" + "  <head>\r\n"
				+ "    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n"
				+ "    <script type=\"text/javascript\">\r\n"
				+ "      google.charts.load('current', {'packages':['corechart']});\r\n"
				+ "      google.charts.setOnLoadCallback(drawChart);\r\n" + "\r\n" + "      function drawChart() {\r\n"
				+ "        var data = google.visualization.arrayToDataTable([" + "          ['Values', 'Values'],\n";

		for (int i = 0; i < grava.ler().size(); i++) {

			html += String.format("['%s', %s], \n", i, grava.ler().get(i));
		}

		html += "]);\r\n" + "\r\n" + "        var options = {\r\n" + "          title: 'Company Performance',\r\n"
				+ "          hAxis: {title: 'Year',  titleTextStyle: {color: '#333'}},\r\n"
				+ "          vAxis: {minValue: 0}\r\n" + "        };\r\n" + "\r\n"
				+ "        var chart = new google.visualization.AreaChart(document.getElementById('chart_div'));\r\n"
				+ "        chart.draw(data, options);\r\n" + "      }\r\n" + "    </script>\r\n" + "  </head>\r\n"
				+ "  <body>\r\n" + "    <div id=\"chart_div\" style=\"width: 100%; height: 500px;\"></div>\r\n"
				+ "  </body>\r\n" + "</html>";
		File file = new File("pizza.html");
		PrintWriter writer;
		try {
			writer = new PrintWriter(file);
			writer.write(html);
			writer.close();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Channels.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Progressao [a1=");
		builder.append(a1);
		builder.append(", razao=");
		builder.append(razao);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append("]");
		return builder.toString();
	}

}
