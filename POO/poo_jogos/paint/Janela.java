package paint;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Janela extends JFrame {
	public Janela() {

		setTitle("GIMP do Carlinhos");

		Rabisco rab1 = new Rabisco(Color.black); // Seta o constructor com a cor da caneta
		Rabisco rab2 = new Rabisco(Color.BLUE); // Seta o constructor com a cor da caneta

		rab1.setBorder(BorderFactory.createLineBorder(Color.GREEN)); // Seta a cor da borda do objeto rabisco "rab1"
		rab2.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Seta a cor da borda do objeto rabisco "rab1"
		getContentPane().setLayout(new GridLayout(2, 1)); // Linhas e colunas (rowspan/colspan), divide a tela para ter
															// mais objeto "Rabisco"
		getContentPane().add(rab1); // Adiciona o objeto "rab1", na coluna primeira coluna/linha (depende como o
									// layout foi declarado)
		getContentPane().add(rab2); // Adiciona o objeto "rab2", na coluna/linha seguinte (depende como o layout foi
									// declarado)

		pack();
		setVisible(true); // Deixar a janela visivel
		setSize(500, 500); // Inicia o tamanho da screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Quando o usuário clicar no "X - fexhar" na moldura, executurá
														// a função passada no parametro
	}

	public static void main(String[] args) {
		new Janela(); // Executa o método Janela()
	}
}
