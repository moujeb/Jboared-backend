package jb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jb.model.OrdreMission;

import jb.service.OrdreMissionService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrdreMissionController {
	
	@Autowired
	private OrdreMissionService ordreMissionService;


	@GetMapping("/ordreMissions")
	public List<OrdreMission> getUsers() {
		return (List<OrdreMission>) ordreMissionService.getAllOrdreMissions();
	}

	@PostMapping("/ordreMissions")
	void addUser(@RequestBody OrdreMission ordreMission) {
		
		ordreMissionService.saveOrdreMission(ordreMission);
	}
	
	

}
