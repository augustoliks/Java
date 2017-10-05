

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Janela extends JFrame{
	public Janela(){
		Rabisco rab1 = new Rabisco(Color.RED);
		Rabisco rab2 = new Rabisco(Color.BLUE);
		rab1.setBorder(BorderFactory.createLineBorder(Color.RED));
		rab2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		getContentPane().setLayout(new GridLayout(1,2));
		getContentPane().add(rab1);
		getContentPane().add(rab2);
		pack();
		setVisible(true);
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
//	public static void main(String[] args){
//		new Janela();
//	}
}

