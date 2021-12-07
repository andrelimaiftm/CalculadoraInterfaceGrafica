package src.br.edu.iftm.calculadora.views;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Janela extends JFrame{	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela window = new Janela();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Janela() {
		inicializar();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void inicializar() {
		
		this.setBounds(100, 100, 384, 506);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		PainelCalculadora panel = new PainelCalculadora();
		getContentPane().add(panel);
		
	}
		
}
