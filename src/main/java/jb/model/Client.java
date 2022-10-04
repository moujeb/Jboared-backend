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
public class Client {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_client;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "prenom")
	private String prenom;
	
	@Column(name = "matricule_fiscale")
	private String MatriculeFiscale;
	
	
	@Column(name = "typeClient")
	private TypeClient typeClient;
	

	
	@ManyToMany
	@JoinTable(
	  name = "ordreMissions_Clients", 
	  joinColumns = @JoinColumn(name = "id_client"), 
	  inverseJoinColumns = @JoinColumn(name = "id_o"))
	Set<CabinetExpertise> ordreMissions_Clients;



	public Client(Long id, String firstName, String lastName, TypeClient typeClient) {
		super();
		this.id_client = id;
		this.nom = firstName;
		this.prenom = lastName;
		this.typeClient = typeClient;
	}



	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id_client;
	}



	public void setId(Long id) {
		this.id_client = id;
	}



	public String getFirstName() {
		return nom;
	}



	public void setFirstName(String firstName) {
		this.nom = firstName;
	}



	public String getLastName() {
		return prenom;
	}



	public void setLastName(String lastName) {
		this.prenom = lastName;
	}



	public TypeClient getTypeClient() {
		return typeClient;
	}



	public void setTypeClient(TypeClient typeClient) {
		this.typeClient = typeClient;
	}
	
	
	

}
