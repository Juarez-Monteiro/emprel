package br.com.example.emprelteste.model.entities;

public abstract class Complaint {
		
	private String descricao;
	
	private String observacoes;
	
	private Complainer reclamante;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Complainer getReclamante() {
		return reclamante;
	}

	public void setReclamante(Complainer reclamante) {
		this.reclamante = reclamante;
	}
}
