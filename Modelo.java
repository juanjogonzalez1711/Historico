package es.studium.Historico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Modelo {
	public String formatear(String texto) {
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String cadenaFormateada = "[" + ahora.format(formato) + "]" + texto;
		return cadenaFormateada;
	}

	public void guardar(String textoFormateado) {
		try {
			FileWriter fichero = new FileWriter("historico.txt", true);
			BufferedWriter buffer = new BufferedWriter(fichero);
			PrintWriter pw = new PrintWriter(buffer);
			pw.println(textoFormateado);
			pw.close();
			buffer.close();
			fichero.close();
		}
		catch(IOException e){
			System.out.println("Error al escribir el fichero");
		}
	}
}
