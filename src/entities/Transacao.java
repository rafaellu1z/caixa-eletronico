package entities;

public class Transacao {

	public Transacao() {
	}
	
	public boolean verificaValorDoSaque(Integer valorDoSaque) {
		if(valorDoSaque < 5) {
			return false;
	 	} else {
	 		return true;
	 	}
	}

}
