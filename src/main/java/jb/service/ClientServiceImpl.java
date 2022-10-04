package jb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jb.model.Client;
import jb.repository.ClientRepository;

public class ClientServiceImpl implements ClientService {

	
	@Autowired
	private ClientRepository clientRepository ;
	
	
	@Override
	public void saveClient(Client client) {
		clientRepository.save(client);
		
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		 clientRepository.deleteById(id);
		 
	}

	@Override
	public Client updateClient(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> getAllclients() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

}
