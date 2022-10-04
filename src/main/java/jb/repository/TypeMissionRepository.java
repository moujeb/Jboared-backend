package jb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jb.model.TypeEmploi;
import jb.model.TypeMission;

public interface TypeMissionRepository extends JpaRepository<TypeMission, Long> {

}
