package jb.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jb.model.CabinetExpertise;
import jb.repository.CabinetExpertiseRepository;
@Service
public class CabinetExpertiseServiceImpl implements CabinetExpertiseService {

	@Autowired
	private CabinetExpertiseRepository cabinetExpertiseRepository;
	@Override
	public void saveCabinetExpertise(CabinetExpertise cabinetExpertise) {
		cabinetExpertiseRepository.save(cabinetExpertise);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCabinetExpertise(Long id) {
		cabinetExpertiseRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public CabinetExpertise updateCabinetExpertise(Long id, CabinetExpertise cabinetExpertise) {
	
		
		return null;
	}

	@Override
	public List<CabinetExpertise> getAllCabinetsExpertise() {
		
		return cabinetExpertiseRepository.findAll();
	}


}
