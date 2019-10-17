package capturadoc;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.IOException;

public class Captura {
	public static void main(String[] args) throws IOException, ParseException {
		String texto = null;
		Date data = null;
		int valor = 0;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		File file = new File("C:\\Users\\ander\\Desktop\\processig\\data.txt");
		List<valor> lista = new ArrayList<>();
		Scanner sc = null;
		valor valores;
		int contadorImpressao = 0;
		boolean verImpressao = false;
		for (int i = 0; i < (i + 1); i++) {
			int cont = 0;
			try {
				sc = new Scanner(file);
				while (sc.hasNextLine()) {
					int aux = lista.size();
					texto = sc.nextLine();
					String split[] = texto.split("-");
					data = formato.parse(split[0]);
					valor = Integer.parseInt(split[1]);
					valores = new valor(data, valor);
					if (cont >= aux) {
						lista.add(valores);
						verImpressao = true;
					}
					cont = cont + 1;
				}
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			} finally {
				if (sc != null) {
					sc.close();
				}
			}
			if (verImpressao == true) {
				int contAux = 0;
				for (valor c : lista) {
					if (contadorImpressao == contAux) {
						contadorImpressao = contadorImpressao + 1;
						System.out.println(c.toString());
					}
					contAux = contAux + 1;

				}
			}
			verImpressao = false;
		}

	}
}