package atividade;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public interface Gravacao {
	
	public boolean gravar(ArrayList<Double> list);
	public ArrayList<Double> ler() throws ParseException;

}