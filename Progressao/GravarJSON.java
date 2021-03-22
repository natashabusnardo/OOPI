package atividade;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GravarJSON implements Gravacao {

	private GsonBuilder builder;
	@SuppressWarnings("unused")
	private Gson gson;
	private ArrayList<Double> lista = new ArrayList<Double>();

	public boolean gravar(ArrayList<Double> lista) {
		builder = new GsonBuilder();
		Gson gson = builder.create();
		try {

			System.out.println(lista);

			FileWriter writer = new FileWriter("dados.json", true);
			writer.write(gson.toJson(lista));
			writer.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public ArrayList<Double> ler(){
		builder = new GsonBuilder();
		@SuppressWarnings("unused")
		Gson gson = builder.create();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("dados.json"));
			Type listType = new TypeToken<ArrayList<Double>>() {
			}.getType();
			lista = new Gson().fromJson(bufferedReader, listType);
			return lista;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}