package src.br.edu.iftm.calculadora.views;

import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import src.br.edu.iftm.calculadora.classes.Calculadora;

public class PainelCalculadora extends JPanel{

    private JTextPane visorCalculadora;
	private String valor;
    private JButton botaoCE;
    private JButton botaoMulplicacao;
    private JButton botao7;
    private JButton botao8;
    private JButton botao9;
    private JButton botaoDivisao;
    private JButton botao4;
    private JButton botao5;
    private JButton botao6;
    private JButton botaoSubtrair;
    private JButton botao1;
    private JButton botao2;
    private JButton botao3;
    private JButton botaoSoma;
    private JButton botao0;
    private JButton botaoIgual;


    public PainelCalculadora(){

        this.setBounds(0, 0, 368, 467);		
		this.setLayout(null);
		
		visorCalculadora = new JTextPane();
		visorCalculadora.setBounds(10, 11, 348, 66);
		this.add(visorCalculadora);
		
		botaoCE = new JButton("CE");
		botaoCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botaoCEMouseClicked();
			}			
		});
		botaoCE.setBounds(10, 100, 172, 28);
		this.add(botaoCE);
		
		botaoMulplicacao = new JButton("*");
		botaoMulplicacao.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botaoMulplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botaoMulplicacaoMouseClicked();
			}
		});
		botaoMulplicacao.setBounds(192, 98, 166, 28);
		this.add(botaoMulplicacao);
		
		botao7 = new JButton("7");
		botao7.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao7MouseClicked();
			}
		});
		botao7.setBounds(10, 139, 63, 38);
		this.add(botao7);
		
		botao8 = new JButton("8");
		botao8.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botao8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao8MouseClicked();
			}
		});
		botao8.setBounds(83, 139, 63, 38);
		this.add(botao8);
		
		botao9 = new JButton("9");
		botao9.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botao9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao9MouseClicked();
			}
		});
		botao9.setBounds(156, 139, 63, 38);
		this.add(botao9);
		
		botaoDivisao = new JButton("/");
		botaoDivisao.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botaoDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botaoDivisaoMouseClicked();
			}
		});
		botaoDivisao.setBounds(229, 139, 63, 38);
		this.add(botaoDivisao);
		
		botao4 = new JButton("4");
		botao4.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao4MouseClicked();
			}
		});
		botao4.setBounds(10, 188, 63, 38);
		this.add(botao4);
		
		botao5 = new JButton("5");
		botao5.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao5MouseClicked();
			}
		});
		botao5.setBounds(83, 188, 63, 38);
		this.add(botao5);
		
		botao6 = new JButton("6");
		botao6.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao6MouseClicked();
			}
		});
		botao6.setBounds(156, 188, 63, 38);
		this.add(botao6);
		
		botaoSubtrair = new JButton("-");
		botaoSubtrair.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botaoSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botaoSubtrairMouseClicked();
			}
		});
		botaoSubtrair.setBounds(229, 188, 63, 38);
		this.add(botaoSubtrair);
		
		botao1 = new JButton("1");
		botao1.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao1MouseClicked();
			}
		});
		botao1.setBounds(10, 237, 63, 38);
		this.add(botao1);
		
		botao2 = new JButton("2");
		botao2.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao2MouseClicked();
			}
		});
		botao2.setBounds(83, 237, 63, 38);
		this.add(botao2);
		
		botao3 = new JButton("3");
		botao3.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao3MouseClicked();
			}
		});
		botao3.setBounds(156, 237, 63, 38);
		this.add(botao3);
		
		botaoSoma = new JButton("+");
		botaoSoma.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botaoSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botaoSomaMouseClicked();
			}
		});
		botaoSoma.setBounds(229, 237, 63, 38);
		this.add(botaoSoma);
		
		botao0 = new JButton("0");
		botao0.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botao0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botao0MouseClicked();
			}
		});
		botao0.setBounds(40, 286, 106, 38);
		this.add(botao0);
		
		botaoIgual = new JButton("=");
		botaoIgual.setFont(new Font("Ubuntu", Font.PLAIN ,24));
		botaoIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				botaoIgualMouseClicked();
			}
		});
		botaoIgual.setBounds(156, 286, 136, 38);
		this.add(botaoIgual);
	}

	protected void botaoIgualMouseClicked() {
		this.valor = visorCalculadora.getText();
		Calculadora calculadora = new Calculadora();
		String resultado = calculadora.Calcula(this.valor);
		visorCalculadora.setText(resultado);
	}

	protected void botao0MouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "0");
	}

	protected void botaoSomaMouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "+");
	}

	protected void botao3MouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "3");
	}

	protected void botao2MouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "2");
	}

	protected void botao1MouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "1");
	}

	protected void botaoSubtrairMouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "-");
	}

	protected void botao6MouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "6");
	}

	protected void botao5MouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "5");
	}

	protected void botao4MouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "4");
	}

	protected void botaoDivisaoMouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "/");
	}

	protected void botao9MouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "9");
	}

	protected void botao8MouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "8");
	}

	protected void botao7MouseClicked() {
		this.valor = visorCalculadora.getText();
		visorCalculadora.setText(valor + "7");
	}

	protected void botaoMulplicacaoMouseClicked() {
		this.valor = visorCalculadora.getText();
		this.visorCalculadora.setText(valor + "*");
	}

	private void botaoCEMouseClicked() {
		this.visorCalculadora.setText("");
	}

    
    
}
