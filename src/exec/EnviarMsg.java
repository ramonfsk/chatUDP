package exec;

import java.net.*;

public class EnviarMsg implements Runnable {
	private final static int PORTA = Servidor.PORTA;
	
	private DatagramSocket socket;
	private String hostname;
	
	public EnviarMsg(DatagramSocket socket, String hostname) {
		this.socket = socket;
		this.hostname = hostname;
	}

	private void enviarMsg(String msg) throws Exception {
		byte buffer[] = msg.getBytes();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
