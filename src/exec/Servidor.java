package exec;

import java.net.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Servidor {
	
	public final static int PORTA = 7001;
	public final static int TAM_BUFFER = 1024;
	private DatagramSocket socket;
	private List<InetAddress> enderecos;
	private List<Integer> portas;
	private List<String> nomes;
	//private Map<InetAddress, Integer> clnts; #HasMap com InetAddress e Porta do Cliente
	//private List<String> idClnts; #ArrayList com os nomes de clientes
	
	public Servidor() {
		try {
			this.socket = new DatagramSocket(Servidor.PORTA);
			this.enderecos = new ArrayList<InetAddress>();
			this.portas = new ArrayList<Integer>();
			this.nomes = new ArrayList<String>();
		} catch (Exception e) { e.printStackTrace(); }
	}
	
	public void addCliente(DatagramPacket info, String nome) {
		if(this.nomes.contains(nome))
			JOptionPane.showMessageDialog(null, "Nome de cliente já existe, ecolha outro!", "ERROR", JOptionPane.ERROR_MESSAGE);
		else {
			this.enderecos.add(info.getAddress());
			this.portas.add(info.getPort());
			this.nomes.add(nome);
		}
	}
	
	public void remCliente(DatagramPacket info, String nome) {
		for(int i = 0; i < this.nomes.size(); i++) {
			if((this.nomes.get(i).compareTo(nome)) == 0) {
				this.enderecos.remove(i);
				this.portas.remove(i);
				this.nomes.remove(i);
			}
		}
	}
	
	public DatagramSocket obtemSocket() {
		return this.socket;
	}
	
	public boolean conectarCliente(DatagramPacket info, String nome, String msg) {
		if((msg.compareTo("CMD|CNNT")) == 0)
			this.addCliente(info, nome);
	}
	
	public static void main(String[] args) {
		(new Thread(new ReceberMsgs())).start();
		(new Thread(new EnviarMsgs())).start();
	}
}
