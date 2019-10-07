package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JanelaChat extends JFrame {
	
	private JList<?> txtMsgs;//ciar classe msg
    private JLabel lblServidor;
    private JTextField txtServidor;
    private JLabel lblNome;
    private JTextField txtNome;
    private JButton btnConectarServidor;
    private JLabel lblMensagem;
    private JTextField txtMsg;
    private JButton btnEnviarMsg;
    
	public JanelaChat() {
        this.getContentPane().setLayout(null);
        this.getContentPane().setBackground(new Color(238, 238, 238));
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(new java.awt.Dimension(668, 412));
        this.setLocation((screenSize.width-668)/2,(screenSize.height-412)/2);
        this.setTitle("Cafeteira - Versão 1.11 - Java");
        this.setResizable(false);
		
        txtMsgs = new JList<Object>();//classe msg
        txtMsgs.setBounds(new Rectangle(10, 41, 632, 284));
        this.getContentPane().add(txtMsgs, null);
        lblServidor = new JLabel("Servidor");
        lblServidor.setBounds(new Rectangle(13, 15, 57, 13));
        this.getContentPane().add(lblServidor, null);
        txtServidor = new JTextField();
        txtServidor.setBounds(new Rectangle(73, 11, 197, 22));
        this.getContentPane().add(txtServidor, null);
        lblNome = new JLabel("Nome");
        lblNome.setBounds(new Rectangle(283, 16, 57, 13));
        this.getContentPane().add(lblNome, null);
        txtNome = new JTextField();
        txtNome.setBounds(new Rectangle(330, 11, 183, 22));
        this.getContentPane().add(txtNome, null);
        btnConectarServidor = new JButton("Conectar");
        btnConectarServidor.setBounds(new Rectangle(535, 9, 100, 24));
        this.getContentPane().add(btnConectarServidor, null);
        btnConectarServidor.addMouseListener (new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Chamada a um método
            }
        });
        lblMensagem = new JLabel("Mensagem");
        lblMensagem.setBounds(new Rectangle(17, 341, 73, 13));
        this.getContentPane().add(lblMensagem, null);
        txtMsg = new JTextField();
        txtMsg.setBounds(new Rectangle(93, 336, 441, 24));
        this.getContentPane().add(txtMsg, null);
        btnEnviarMsg = new JButton("Enviar");
        btnEnviarMsg.setBounds(new Rectangle(541, 335, 100, 26));
        this.getContentPane().add(btnEnviarMsg, null);
        btnEnviarMsg.addMouseListener (new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Chamada a um método
            }
        });
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                aoFechar();
            }
        });
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
	}
	
    private void aoFechar() {
        System.exit(0);
    }
	
    //Métodos de conectar ao servidor e mandar mensagem
}
