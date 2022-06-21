package br.com.example.emprelteste.model.entities;

import javax.persistence.Embeddable;

@Embeddable
public class EventInfo {
	
	private Integer qtdPessoasComeramRefeicao;
	
	private Integer qtdPessoasDoentes;
	
	private Integer qtdMortes;

	public Integer getQtdPessoasComeramRefeicao() {
		return qtdPessoasComeramRefeicao;
	}

	public void setQtdPessoasComeramRefeicao(Integer qtdPessoasComeramRefeicao) {
		this.qtdPessoasComeramRefeicao = qtdPessoasComeramRefeicao;
	}

	public Integer getQtdPessoasDoentes() {
		return qtdPessoasDoentes;
	}

	public void setQtdPessoasDoentes(Integer qtdPessoasDoentes) {
		this.qtdPessoasDoentes = qtdPessoasDoentes;
	}

	public Integer getQtdMortes() {
		return qtdMortes;
	}

	public void setQtdMortes(Integer qtdMortes) {
		this.qtdMortes = qtdMortes;
	}
	
	
	
	

}
