package jb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Conditature {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_condutature;
	
	@Column(name = "reponse")
	private Reponse reponse;
	
	@Column(name = "descreption")
	private String descreption;
	
	@Column(name = "dateDeb")
	private String dateDebut;
	
	@Column(name = "dateFin")
	private String dateFin;
	
	@Column(name = "salaire")
	private float salaire;
	
	@Column(name = "typeEmploi")
	private TypeEmploi typeEmploi;

	public Conditature(Long id_condutature, Reponse reponse, String descreption, String dateDebut, String dateFin,
			float salaire, TypeEmploi typeEmploi) {
		super();
		this.id_condutature = id_condutature;
		this.reponse = reponse;
		this.descreption = descreption;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.salaire = salaire;
		this.typeEmploi = typeEmploi;
	}

	public Conditature() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_condutature() {
		return id_condutature;
	}

	public void setId_condutature(Long id_condutature) {
		this.id_condutature = id_condutature;
	}

	public Reponse getReponse() {
		return reponse;
	}

	public void setReponse(Reponse reponse) {
		this.reponse = reponse;
	}

	public String getDescreption() {
		return descreption;
	}

	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public TypeEmploi getTypeEmploi() {
		return typeEmploi;
	}

	public void setTypeEmploi(TypeEmploi typeEmploi) {
		this.typeEmploi = typeEmploi;
	}
	
	

}
