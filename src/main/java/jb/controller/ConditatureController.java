package jb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jb.model.Conditature;
import jb.model.OffreEmploi;
import jb.service.ConditatureService;
import jb.service.OffreEmploiService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ConditatureController {
	
	@Autowired
	private ConditatureService conditatureService;


	@GetMapping("/conditatures")
	public List<Conditature> getallConditatures() {
		return (List<Conditature>) conditatureService.getAllConditature();
	}

	@PostMapping("/conditatureAdd")
	void addUser(@RequestBody Conditature conditature) {
		
		conditatureService.saveConditature(conditature);
	}
	

}
