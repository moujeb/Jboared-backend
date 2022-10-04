package jb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import jb.model.TypeMission;

import jb.service.TypeMissionService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TypeMissionController {
	
	@Autowired
	private TypeMissionService typeMissionService;


	@GetMapping("/typeMissions")
	public List<TypeMission> getallTypeMissionS() {
		return (List<TypeMission>) typeMissionService.getAllTypeMission();
	}

	@PostMapping("/typeMissionAdd")
	void addUser(@RequestBody TypeMission typeMission) {
		
		typeMissionService.saveTypeMission(typeMission);;
	}

}
