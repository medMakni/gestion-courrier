package biz.picosoft.entity;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Courrier implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCourrier")
	long idCourrier;
	@Column(name = "idSource")
	long idSource;
	@Column(name = "idD�partement")
	long idD�partement;
	@OneToOne
	private Contacte contacte;
	// long[] listePi�ceJointe;

	/*
	 * public Courrier(long idSource, long idD�partement, long idContct, long[]
	 * listePi�ceJointe) { super(); this.idSource = idSource; this.idD�partement
	 * = idD�partement; this.idContact = idContct; this.listePi�ceJointe =
	 * listePi�ceJointe; }
	 */

	public long getIdSource() {
		return idSource;
	}

	public Courrier(long idSource, long idD�partement, Contacte contacte) {
		super();
		this.idSource = idSource;
		this.idD�partement = idD�partement;
		this.contacte = contacte;
	}

	 

	public void setIdSource(long idSource) {
		this.idSource = idSource;
	}

	public long getIdD�partement() {
		return idD�partement;
	}

	public void setIdD�partement(long idD�partement) {
		this.idD�partement = idD�partement;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idCourrier ^ (idCourrier >>> 32));
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
		Courrier other = (Courrier) obj;
		if (idCourrier != other.idCourrier)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Courrier [idCourrier=" + idCourrier + ", idSource=" + idSource + ", idD�partement=" + idD�partement
				+ "]";
	}

}
