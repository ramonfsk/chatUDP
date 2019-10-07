package exec;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;

public class Servidor {
	public static void main(String[] args) {
		
		ArrayList<Cliente> clnts = new ArrayList<Cliente>();
		byte[] buffer = new byte[1000];
		
		try {
			DatagramSocket socket = new DatagramSocket(12345);
			DatagramPacket dgEntrada = new DatagramPacket(buffer, buffer.length);
				socket.receive(dgEntrada);
				if ((new String(buffer)) == "CMD|DSCNNT") {
					System.out.println("O cliente "+dgEntrada.getAddress().getHostName()+" desconectou");
					socket.close();
				} else {
					System.out.println("Conexão com o cliente "+dgEntrada.getAddress().getHostName()+":"+dgEntrada.getPort());
					System.out.println("MSG: "+(new String(buffer)));
				}
		} catch (IOException e) { e.printStackTrace(); }
	}
}
