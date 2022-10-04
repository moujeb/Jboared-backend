package jb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jb.model.OffreEmploi;
import jb.model.OrdreMission;
import jb.service.OffreEmploiService;
import jb.service.OrdreMissionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OffreEmploiController {
	
	@Autowired
	private OffreEmploiService offreEmploiService;


	@GetMapping("/offreEmplois")
	public List<OffreEmploi> getOffreEmplois() {
		return (List<OffreEmploi>) offreEmploiService.getAllOffresEmploi();
	}

	@PostMapping("/offreEmploi")
	void addUser(@RequestBody OffreEmploi offreEmploi) {
		
		offreEmploiService.saveOffreEmploi(offreEmploi);;
	}
	

}
