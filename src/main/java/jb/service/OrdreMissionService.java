package jb.service;

import java.util.List;

import jb.model.OrdreMission;

public interface OrdreMissionService {

	public void saveOrdreMission(OrdreMission ordreMission);

	void deleteOrdreMission(Long id);

	OrdreMission updateOrdreMission(Long id);

	List<OrdreMission> getAllOrdreMissions();

}
