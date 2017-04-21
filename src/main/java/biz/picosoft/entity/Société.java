package biz.picosoft.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Société {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSociété")
	int idSociété;
	@Column(name = "nom")
	String nom;
	@Column(name = "email")
	String email;
	@Column(name = "télèphone")
	String télèphone;
	@Column(name = "adress")
	String adress;

	public Société(String nom, String email, String télèphone, String adress) {
		super();
		this.nom = nom;
		this.email = email;
		this.télèphone = télèphone;
		this.adress = adress;
	}

	public Société() {
		super();
	}

	public int getIdSociété() {
		return idSociété;
	}

	public void setIdSociété(int idSociété) {
		this.idSociété = idSociété;
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

	public String getTélèphone() {
		return télèphone;
	}

	public void setTélèphone(String télèphone) {
		this.télèphone = télèphone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
