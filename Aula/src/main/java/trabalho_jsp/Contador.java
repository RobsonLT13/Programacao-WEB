package trabalho_jsp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Contador {
	
	private static int contagem;
	static ArrayList<String> datas = new ArrayList<>();
	
	public static void novoAcesso() {
		contagem += 1;
	}
	
	public static int getQuantidadeAcessos() {
		return contagem;
	}
	
	public static void inserirData() {
		DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
		Date date = new Date();
		datas.add(dateformat.format(date));
	}
	
	public static String getDataInicial() {
		return datas.get(0);
	}
	
	public static String getDataFinal() {
		String data_final = datas.get(datas.size()-1);
		return data_final;
	} 

}
