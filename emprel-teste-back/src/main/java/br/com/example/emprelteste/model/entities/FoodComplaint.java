package br.com.example.emprelteste.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="food_complaint")
public class FoodComplaint extends Complaint{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private VictinInfo victinInformacao;
	
	private EventInfo eventoInformacao;
	
	
	

	public VictinInfo getVictinInformacao() {
		return victinInformacao;
	}

	public void setVictinInformacao(VictinInfo victinInformacao) {
		this.victinInformacao = victinInformacao;
	}

	public EventInfo getEventoInformacao() {
		return eventoInformacao;
	}

	public void setEventoInformacao(EventInfo eventoInformacao) {
		this.eventoInformacao = eventoInformacao;
	}	

}
