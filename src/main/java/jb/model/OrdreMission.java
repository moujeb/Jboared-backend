package jb.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
@Entity
public class OrdreMission {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_ordre;
	
	@Column(name = "descreption")
	private String descreption;
	
	@ManyToMany
	@JoinTable(
	  name = "ordreMission_typeMission", 
	  joinColumns = @JoinColumn(name = "id_ordre"), 
	  inverseJoinColumns = @JoinColumn(name = "id_typeMission"))
	private Set<TypeMission> Missions_ordreMissions;

	public OrdreMission(Long id_ordre, String descreption, Set<TypeMission> typeMission) {
		super();
		this.id_ordre = id_ordre;
		this.descreption = descreption;
		
	}
	
	

	public OrdreMission() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId_ordre() {
		return id_ordre;
	}

	public void setId_ordre(Long id_ordre) {
		this.id_ordre = id_ordre;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}


	
	
	

}
