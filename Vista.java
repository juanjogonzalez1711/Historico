package es.studium.Historico;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class Vista
{
	Frame ventana = new Frame("Histórico de Operaciones");
	TextField txtTexto = new TextField(30);
	Button btnAgregar = new Button("Agregar");
	TextArea txtHistorico = new TextArea(12, 40);

	public Vista()
	{
		ventana.setSize(440, 300);
		ventana.setBackground(Color.CYAN);
		ventana.setLayout(new FlowLayout());

		txtTexto.setBounds(20, 20, 200, 30);
		btnAgregar.setBounds(230, 20, 100, 30);
		txtHistorico.setBounds(20, 60, 360, 200);

		ventana.add(txtTexto);
		ventana.add(btnAgregar);
		ventana.add(txtHistorico);

		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}
