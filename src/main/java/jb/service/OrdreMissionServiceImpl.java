package jb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jb.model.OrdreMission;
import jb.repository.OrdreMissionRepository;
@Service
public class OrdreMissionServiceImpl implements OrdreMissionService {

	@Autowired
	private OrdreMissionRepository ordreMissionRepository;
	
	@Override
	public void saveOrdreMission(OrdreMission ordreMission) {
		ordreMissionRepository.save(ordreMission);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrdreMission(Long id) {
		ordreMissionRepository.deleteById(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public OrdreMission updateOrdreMission(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrdreMission> getAllOrdreMissions() {
		// TODO Auto-generated method stub
		return ordreMissionRepository.findAll();
	}


}
