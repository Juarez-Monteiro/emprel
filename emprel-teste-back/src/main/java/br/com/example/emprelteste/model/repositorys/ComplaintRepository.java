package br.com.example.emprelteste.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.emprelteste.model.entities.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {

}
