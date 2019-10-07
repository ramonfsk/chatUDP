package exec;

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
		return nome;
	}
}
