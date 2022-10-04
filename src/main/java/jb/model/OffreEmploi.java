package jb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class OffreEmploi {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_offre;
	
	@Column(name = "titre")
	private String titre;
	
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

	public OffreEmploi(Long id_offre, String titre, String descreption, String dateDebut, String dateFin, float salaire,
			TypeEmploi typeEmploi) {
		super();
		this.id_offre = id_offre;
		this.titre = titre;
		this.descreption = descreption;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.salaire = salaire;
		this.typeEmploi = typeEmploi;
	}

	
	public OffreEmploi() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId_offre() {
		return id_offre;
	}

	public void setId_offre(Long id_offre) {
		this.id_offre = id_offre;
	}

	public String getTitle() {
		return titre;
	}

	public void setTitle(String titre) {
		this.titre = titre;
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
