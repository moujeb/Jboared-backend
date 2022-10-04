package jb.service;

import java.util.List;

import jb.model.OffreEmploi;



public interface OffreEmploiService {

	public void saveOffreEmploi(OffreEmploi offreEmploi);

	void deleteOffreEmploi(Long id);

	OffreEmploi updateOffreEmploi(Long id);

	List<OffreEmploi> getAllOffresEmploi();

}
