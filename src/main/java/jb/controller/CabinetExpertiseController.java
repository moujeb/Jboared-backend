package jb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jb.model.CabinetExpertise;
import jb.model.Conditature;
import jb.service.CabinetExpertiseService;
import jb.service.ConditatureService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CabinetExpertiseController {
	
	@Autowired
	private CabinetExpertiseService cabinetExpertiseService;


	@GetMapping("/cabinetExpertises")
	public List<CabinetExpertise> getallCabinetExpertises() {
		return (List<CabinetExpertise>) cabinetExpertiseService.getAllCabinetsExpertise();
	}

	@PostMapping("/cabinetExpertiseAdd")
	void addUser(@RequestBody CabinetExpertise cabinetExpertise) {
		
		cabinetExpertiseService.saveCabinetExpertise(cabinetExpertise);;
	}
	

}
