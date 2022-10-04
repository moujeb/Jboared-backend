package jb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jb.model.Conditature;
import jb.repository.ConditatureRepository;
@Service
public class ConditatureServiceImpl implements ConditatureService {
	@Autowired
	private ConditatureRepository conditatureRepository;

	@Override
	public void saveConditature(Conditature Conditature) {
		conditatureRepository.save(Conditature);
		
	}

	@Override
	public void deleteConditature(Long id) {
		conditatureRepository.deleteById(id);
		
	}

	@Override
	public Conditature updateConditature(Long id) {
		
		return null;
	}

	@Override
	public List<Conditature> getAllConditature() {
		// TODO Auto-generated method stub
		return null;
	}


}
