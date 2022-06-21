package br.com.example.emprelteste.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="other_complaint")
public class OtherComplaint extends Complaint{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Integer idade;
	
	private String formacaoEscolar;
	
	private Endereco enderecoOcorrencia;
	
	private String telefone;

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getFormacaoEscolar() {
		return formacaoEscolar;
	}

	public void setFormacaoEscolar(String formacaoEscolar) {
		this.formacaoEscolar = formacaoEscolar;
	}

	public Endereco getEnderecoOcorrencia() {
		return enderecoOcorrencia;
	}

	public void setEnderecoOcorrencia(Endereco enderecoOcorrencia) {
		this.enderecoOcorrencia = enderecoOcorrencia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	

}
