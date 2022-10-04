package jb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jb.model.OffreEmploi;
import jb.repository.OffreEmploiRepository;
@Service
public class OffreEmploiServiceImpl implements OffreEmploiService {
	@Autowired
	private OffreEmploiRepository offreEmploiRepository;

	@Override
	public void saveOffreEmploi(OffreEmploi offreEmploi) {
		offreEmploiRepository.save(offreEmploi);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOffreEmploi(Long id) {
		offreEmploiRepository.deleteById(id);;
		// TODO Auto-generated method stub
		
	}

	@Override
	public OffreEmploi updateOffreEmploi(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OffreEmploi> getAllOffresEmploi() {
		// TODO Auto-generated method stub
		return offreEmploiRepository.findAll() ;
	}


}
