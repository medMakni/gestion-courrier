package biz.picosoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Soci�t� {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSoci�t�")
	int idSoci�t�;
	@Column(name = "nom")
	String nom;
	@Column(name = "email")
	String email;
	@Column(name = "t�l�phone")
	String t�l�phone;
	@Column(name = "adress")
	String adress;

	public Soci�t�(String nom, String email, String t�l�phone, String adress) {
		super();
		this.nom = nom;
		this.email = email;
		this.t�l�phone = t�l�phone;
		this.adress = adress;
	}

	public Soci�t�() {
		super();
	}

	public int getIdSoci�t�() {
		return idSoci�t�;
	}

	public void setIdSoci�t�(int idSoci�t�) {
		this.idSoci�t� = idSoci�t�;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getT�l�phone() {
		return t�l�phone;
	}

	public void setT�l�phone(String t�l�phone) {
		this.t�l�phone = t�l�phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
