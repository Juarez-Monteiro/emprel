package br.com.example.emprelteste.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.example.emprelteste.model.entities.Complaint;
import br.com.example.emprelteste.model.repositorys.ComplaintRepository;

public class ComplaintService<T extends Complaint>{
	
	@Autowired
	private ComplaintRepository repository;
	
	
	public T salvar(T complaint) {
		return repository.save(complaint);
	}
	
	public List<Complaint> listarTodos() {
		return repository.findAll();
	}

}
