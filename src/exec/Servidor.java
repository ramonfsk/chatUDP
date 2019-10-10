package exec;

import java.io.*;
import java.net.*;
import java.util.*;

public class Servidor implements Runnable {
	public final static int PORTA = 7001;
	private final static int BUFFER = 1024;
	
	private DatagramSocket socket;
	private ArrayList<InetAddress> enderecoClientes;
	private ArrayList<Integer> portaClientes;
	private HashSet<String> clientesExistentes; //HashSet garante que não haja repetição de clientes.
	
	public Servidor() throws IOException {
		socket = new DatagramSocket(PORTA);
		enderecoClientes = new ArrayList<InetAddress>();
		portaClientes = new ArrayList<Integer>();
		clientesExistentes = new HashSet<String>();
	}
	
	@Override
	public void run() {
		byte[] buffer = new byte[BUFFER];
		while(true) {
			try {
				Arrays.fill(buffer, (byte)0);
				DatagramPacket pacote = new DatagramPacket(buffer, buffer.length);
				socket.receive(pacote);
				
				String tmpMsg = new String(buffer);//Pegou o conteúdo da msg
				InetAddress tmpEndereco = pacote.getAddress();//Pegou o endereco IP
				int tmpPorta = pacote.getPort();//Pegou a porta
				String id = tmpEndereco.toString() + ":"+tmpPorta;//Criou um id único para o cliente
				
				//Adiciona as informacoes dos clientes em arrays
				if(!clientesExistentes.contains(id)) {
					clientesExistentes.add(id);
					enderecoClientes.add(tmpEndereco);
					portaClientes.add(tmpPorta);
				}
				
				System.out.println(id+" : "+tmpMsg);
				byte[] data = (id+" : "+tmpMsg).getBytes();
				for(int i=0; i < enderecoClientes.size(); i++) {
					
				}
				
			} catch (Exception e) { e.printStackTrace(); }
		}
	}
	
	public static void main(String[] args) {
		try {
			(new Servidor()).run();
		} catch (IOException e) { e.printStackTrace(); }
	}
}
