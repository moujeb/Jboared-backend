package jb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jb.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
