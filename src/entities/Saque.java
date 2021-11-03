package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Saque {

	private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Integer idDoSaque;
	private Date dataDoSaque;
	private Integer valorDoSaque;
	
	private List<Nota> notas = new ArrayList<>();
	
	public Saque() {
	}
	
	public Saque(Integer idDoSaque, Date dataDoSaque, Integer valorDoSaque) {
		this.idDoSaque = idDoSaque;
		this.dataDoSaque = dataDoSaque;
		this.valorDoSaque = valorDoSaque;
	}

	public Integer getIdDoSaque() {
		return idDoSaque;
	}

	public Date getDataDoSaque() {
		return dataDoSaque;
	}

	public Integer getValorDoSaque() {
		return valorDoSaque;
	}

	public void setValorDoSaque(Integer valorDoSaque) {
		this.valorDoSaque = valorDoSaque;
	}

	public List<Nota> getNotas() {
		return notas;
	}
	
	public void adicionarNota(Nota notas) {
		this.notas.add(notas);
	}
	
	public void removerNota(Nota notas) {
		this.notas.remove(notas);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data da Transação: ");
		sb.append(SDF.format(dataDoSaque) + "\n");
		sb.append("Valor do Saque: R$ ");
		sb.append(String.format("%.2f", (double) valorDoSaque));
		sb.append("\n" + getNotas());
		return sb.toString();
	}

}
