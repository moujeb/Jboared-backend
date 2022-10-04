package jb.service;

import java.util.List;

import jb.model.Client;



public interface ClientService {
	
	public void saveClient(Client client);

	void deleteClient(Long id);

	Client updateClient(Long id);

	List<Client> getAllclients();

}
