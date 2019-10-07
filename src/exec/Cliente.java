package exec;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class Cliente {
	
	private String nome;
	private Map<Date, String> msgs;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.msgs = new HashMap<Date, String>();
	}

	public void addMsg(Date timeStamp, String msg) {
		this.msgs.put(timeStamp, msg);
	}
	
	public void listarMsgs() {
		for (Map.Entry<Date, String> pair : msgs.entrySet()) {
			System.out.println("TimeStamp: "+pair.getKey()+"| Msg: "+ pair.getValue());
		}
	}

	public String getNome() {
		return this.nome;
	}
	
	public static void main(String[] args) {
		byte[] msg1 = "MSG1".getBytes(), msg2 = "MSG2".getBytes(), msg3 = "CMD|DSCNNT".getBytes();
		
		try {
			DatagramSocket socket = new DatagramSocket();
			socket.setSoTimeout(3000);
			DatagramPacket dgSaida = new DatagramPacket(msg1, msg1.length, InetAddress.getByName("localhost"), 12345);
			socket.send(dgSaida);
			System.out.println("Msg1 enviada!");
			dgSaida = new DatagramPacket(msg2, msg2.length, InetAddress.getByName("localhost"), 12345);
			socket.send(dgSaida);
			System.out.println("Msg2 enviada!");
			dgSaida = new DatagramPacket(msg3, msg3.length, InetAddress.getByName("localhost"), 12345);
			socket.send(dgSaida);
			System.out.println("Msg3 enviada!");
			socket.close();
		} catch (SocketException e) {
			System.out.println("Timeout!");
		} catch (IOException e) { e.printStackTrace(); }
	}
}
