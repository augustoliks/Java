package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.SwingUtilities;

@SuppressWarnings("serial")
public class Rabisco extends JComponent implements MouseListener, MouseMotionListener {
	private ArrayList<Point> pontos;
	private ArrayList<Point> removerAux;
	private int tamanho = 10;
	private Color cor;

	public Rabisco(Color cor) {
		
		this.cor = cor; // Recebe a cor
		removerAux = new ArrayList<Point>();  
		pontos = new ArrayList<Point>(1024); /*
												 * Ele pré aloca 1024 elementos desse tipo na memória, caso precise de
												 * mais ele aloca mais.. Isso torna o código mais rápido ja que ele nao
												 * precisa ficar alocando memória pra cada ponto na tela
												 */
		addMouseListener(this); // Adiciona eventos de mouse
		addMouseMotionListener(this); // Adiciona evento de MOVIMENTO do mouse
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE); // Seta o fundo da screen
		g2d.fillRect(0, 0, getWidth(), getHeight()); // Seta o fundo e branco
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); // Aumenta a resolucao
																									// da escrita da
																									// caneta
		g2d.setColor(cor); // Insere a cor na caneta
		for (Point ponto : pontos) { // Adiciona o ponto clicado no arraylist do botao

			g2d.fillOval(ponto.x - (tamanho / 2), ponto.y - (tamanho / 2), tamanho,
					tamanho); /*
								 * "ponto.x", representa o eixo X, no movimento do mouse "ponto.y", representa o
								 * eixo Y, no movimento do mouse "tamanho", representa o tamanho do eixo X, do
								 * caneta "tamanho", representa o tamanho do eixo X, do caneta
								 */
		}
	}

	// Hbilita o evento de arrastar o mouse
	@Override
	public void mouseDragged(MouseEvent e) {

		if (SwingUtilities.isLeftMouseButton(e)) {
			System.out.println("Esquerdo - WRITTER");

			pontos.add(e.getPoint());
		}

		if (SwingUtilities.isRightMouseButton(e)) {
			System.out.println("Direito - ERASE");

			if (pontos.isEmpty()) {
				return;
			}

			for (int k = 0; k < pontos.size(); k++) {

				if (e.getPoint().distance(pontos.get(k)) < tamanho / 2) {
					removerAux.add(pontos.get(k));

				}
				
			}
			pontos.removeAll(removerAux);
			removerAux.clear();
		}
		repaint();
	}

	// Hbilita o evento de click do mouse
	@Override
	public void mousePressed(MouseEvent e) {

		if (SwingUtilities.isLeftMouseButton(e)) {
			System.out.println("Esquerdo - WRITTER");

			pontos.add(e.getPoint());
		}

		if (SwingUtilities.isRightMouseButton(e)) {
			System.out.println("Direito - ERASE");

			if (pontos.isEmpty()) {
				return;
			}

			for (int k = 0; k < pontos.size(); k++) {

				if (e.getPoint().distance(pontos.get(k)) < tamanho / 2) {
					removerAux.add(pontos.get(k));

				}
				
			}
			pontos.removeAll(removerAux);
			removerAux.clear();
		}
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}