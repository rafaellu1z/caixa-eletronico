package entities;

public class Nota {
	
	private Integer idDaNota;
	private Integer valor;
	private Integer quantidade;
	
	public Nota() {
	}
	
	public Nota(Integer idDaNota, Integer valor, Integer quantidade) {
		this.idDaNota = idDaNota;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Integer getIdDaNota() {
		return idDaNota;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Notas de " 
				+ valor
				+ " : "
				+ quantidade;
	}
}
