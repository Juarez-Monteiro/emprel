package br.com.example.emprelteste.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.example.emprelteste.model.entities.Complaint;
import br.com.example.emprelteste.model.services.ComplaintService;

@RestController
public class ComplaintController {

	
	@Autowired
	private ComplaintService<Complaint> service;
	
	
	@GetMapping("/complaints")
	public List<Complaint> buscarTodos() {		
		return service.listarTodos();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)	
	public Complaint salvar(@RequestBody Complaint complaint){
		
		return service.salvar(complaint);
	}
	
}
