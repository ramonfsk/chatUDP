package exec;

import java.net.*;
import java.util.ArrayList;

public class Servidor {
	public static void main(String[] args) {
		
		ArrayList<Cliente> clnts = new ArrayList<Cliente>();
		
		try {
			DatagramSocket socket = new DatagramSocket(3000);
			//DatagramPacket dgEntrada = new DatagramPacket(clnts, );
			
		} catch (Exception e) { e.printStackTrace(); }
		
	}
}
