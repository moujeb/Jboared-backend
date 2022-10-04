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
public class CabinetExpertise {
	
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id_cabinet;
	
	@Column(name = "nom")
	private String name;
	
	@Column(name = "telephone")
	private String telephone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "matricule_fiscale")
	private String MatriculeFiscale;
	
	@Column(name = "adresse")
	private String adresse;
	
	@ManyToMany
	@JoinTable(
	  name = "CabinetsExper_Clients", 
	  joinColumns = @JoinColumn(name = "id_cabinet"), 
	  inverseJoinColumns = @JoinColumn(name = "id_client"))
	Set<Client> CabinetsExper_Clients;

	public CabinetExpertise(Long id_cabinet, String name, String phone, String email, String adress,String MatriculeFiscale) {
		super();
		this.id_cabinet = id_cabinet;
		this.name = name;
		this.telephone = phone;
		this.email = email;
		this.adresse = adress;
		this.MatriculeFiscale =MatriculeFiscale;
	}
	

	public CabinetExpertise() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getMatriculeFiscale() {
		return MatriculeFiscale;
	}


	public void setMatriculeFiscale(String matriculeFiscale) {
		MatriculeFiscale = matriculeFiscale;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public Set<Client> getCabinetsExper_Clients() {
		return CabinetsExper_Clients;
	}


	public void setCabinetsExper_Clients(Set<Client> cabinetsExper_Clients) {
		CabinetsExper_Clients = cabinetsExper_Clients;
	}


	public Long getId_cabinet() {
		return id_cabinet;
	}

	public void setId_cabinet(Long id_cabinet) {
		this.id_cabinet = id_cabinet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return telephone;
	}

	public void setPhone(String phone) {
		this.telephone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adresse;
	}

	public void setAdress(String adress) {
		this.adresse = adress;
	}
	

	


}
