package jb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jb.model.TypeMission;
import jb.repository.TypeMissionRepository;
@Service
public class TypeMissionServiceImpl implements TypeMissionService {

	
	@Autowired
	private TypeMissionRepository typeMissionRepository;
	@Override
	public void saveTypeMission(TypeMission typeMission) {
		typeMissionRepository.save(typeMission);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTypeMission(Long id) {
		typeMissionRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public TypeMission updateTypeMission(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TypeMission> getAllTypeMission() {
		// TODO Auto-generated method stub
		return typeMissionRepository.findAll();
	}

}
