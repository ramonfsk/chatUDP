package exec;

import java.net.*;

public class ReceberMsgs extends Servidor implements Runnable {
	
	private byte[] buffer;
	private DatagramSocket socket;
	
	public ReceberMsgs() {
		this.buffer = new byte[Servidor.TAM_BUFFER];
		this.socket = this.obtemSocket();
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				DatagramPacket pacote = new DatagramPacket(buffer, buffer.length);
				this.socket.receive(pacote);
				this.addCliente(pacote, "Clt1");
				
			} catch (Exception e) { e.printStackTrace(); }
		}
	}		
}
