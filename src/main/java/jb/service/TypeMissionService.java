package jb.service;

import java.util.List;

import jb.model.TypeMission;

public interface TypeMissionService {

	public void saveTypeMission(TypeMission typeMission);

	void deleteTypeMission(Long id);

	TypeMission updateTypeMission(Long id);

	List<TypeMission> getAllTypeMission();

}
