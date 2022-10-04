package jb.service;

import java.util.List;

import jb.model.CabinetExpertise;

public interface CabinetExpertiseService  {
	
	public void saveCabinetExpertise(CabinetExpertise cabinetExpertise);

	public void deleteCabinetExpertise(Long id);

	CabinetExpertise updateCabinetExpertise(Long id, CabinetExpertise cabinetExpertise);

	List<CabinetExpertise> getAllCabinetsExpertise();

}
