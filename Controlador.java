package es.studium.Historico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Controlador extends WindowAdapter implements ActionListener
{
	Modelo modelo;
	Vista vista;

	public Controlador(Modelo m, Vista v)
	{
		this.modelo = m;
		this.vista = v;

		this.vista.ventana.addWindowListener(this);
		this.vista.btnAgregar.addActionListener(this);
	}

	@Override
	public void windowClosing(WindowEvent evento)
	{
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String texto = vista.txtTexto.getText();
		vista.txtTexto.setText("");
		vista.txtTexto.requestFocus();
		if(!texto.isEmpty())
		{
			String textoFormateado = modelo.formatear(texto);
			modelo.guardar(textoFormateado);
			vista.txtHistorico.append(textoFormateado + "\n");
		}
	}
}