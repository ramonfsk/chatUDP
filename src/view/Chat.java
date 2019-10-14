package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Chat extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfServidor;
	private JTextField txtfCliente;
	private JTextField txtfMensagem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat frame = new Chat();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Chat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 51, 564, 294);
		contentPane.add(textArea_1);
		
		JLabel lblServidor = new JLabel("Servidor");
		lblServidor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblServidor.setBounds(10, 23, 48, 14);
		contentPane.add(lblServidor);
		
		txtfServidor = new JTextField();
		txtfServidor.setBounds(68, 20, 170, 20);
		contentPane.add(txtfServidor);
		txtfServidor.setColumns(10);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCliente.setBounds(248, 23, 48, 14);
		contentPane.add(lblCliente);
		
		txtfCliente = new JTextField();
		txtfCliente.setColumns(10);
		txtfCliente.setBounds(306, 20, 170, 20);
		contentPane.add(txtfCliente);
		
		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnConectar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnConectar.setBounds(486, 17, 89, 23);
		contentPane.add(btnConectar);
		
		JLabel lblMensagem = new JLabel("Mensagem");
		lblMensagem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMensagem.setBounds(10, 359, 62, 17);
		contentPane.add(lblMensagem);
		
		txtfMensagem = new JTextField();
		txtfMensagem.setColumns(10);
		txtfMensagem.setBounds(82, 358, 394, 20);
		contentPane.add(txtfMensagem);
		
		JButton btnEnviarMsg = new JButton("Enviar");
		btnEnviarMsg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnEnviarMsg.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEnviarMsg.setBounds(485, 356, 89, 23);
		contentPane.add(btnEnviarMsg);
		
		TextArea textArea = new TextArea();
	}
}
