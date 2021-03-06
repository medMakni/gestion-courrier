package biz.picosoft.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Contacte")
public class Contacte implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idContact")
	int idContact;
	@Column(name = "nom")
	String nom;
	@Column(name = "mail")
	String mail;
	@Column(name = "t�l�phone")
	String t�l�phone;
	@Column(name = "adresse")
	String adresse;
	@ManyToOne
	   private Soci�t� soci�t�;
	public Contacte() {
		super();
	}

	/*public Contacte(String nom, String mail, String t�l�phone, String adresse) {
		super();

		this.nom = nom;
		this.mail = mail;
		this.t�l�phone = t�l�phone;
		this.adresse = adresse;
	}
*/
	
	public long getIdContact() {
		return idContact;
	}

	 

	public Contacte(String nom, String mail, String t�l�phone, String adresse, Soci�t� soci�t�) {
		super();
		this.nom = nom;
		this.mail = mail;
		this.t�l�phone = t�l�phone;
		this.adresse = adresse;
		this.soci�t� = soci�t�;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getT�l�phone() {
		return t�l�phone;
	}

	public void setT�l�phone(String t�l�phone) {
		this.t�l�phone = t�l�phone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idContact ^ (idContact >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacte other = (Contacte) obj;
		if (idContact != other.idContact)
			return false;
		return true;
	}

}
