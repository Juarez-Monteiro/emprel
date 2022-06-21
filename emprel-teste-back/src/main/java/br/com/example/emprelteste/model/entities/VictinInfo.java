package br.com.example.emprelteste.model.entities;

import javax.persistence.Embeddable;

@Embeddable
public class VictinInfo {
	
	private String name;
	
	private Endereco enderecoVictin;
	
	private String telefone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Endereco getEnderecoVictin() {
		return enderecoVictin;
	}

	public void setEnderecoVictin(Endereco enderecoVictin) {
		this.enderecoVictin = enderecoVictin;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
