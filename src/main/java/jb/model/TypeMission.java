package jb.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class TypeMission {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_typeMission;
	
	@Column(name = "nom")
	private String nom;
	

	

	public TypeMission(Long id_typeMission, String nom) {
		super();
		this.id_typeMission = id_typeMission;
		this.nom = nom;
	}

	
	public TypeMission() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId_typeMission() {
		return id_typeMission;
	}

	public void setId_typeMission(Long id_typeMission) {
		this.id_typeMission = id_typeMission;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
