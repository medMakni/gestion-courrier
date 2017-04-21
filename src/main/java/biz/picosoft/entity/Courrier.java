package biz.picosoft.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Courrier 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCourrier")
long idCourrier;
	@Column(name = "idSource")
long idSource;
	@Column(name = "idD�partement")
long idD�partement;
	@Column(name = "idContct")
long idContact;
	
long[] listePi�ceJointe;
public Courrier(long idSource, long idD�partement, long idContct, long[] listePi�ceJointe) {
	super();
	this.idSource = idSource;
	this.idD�partement = idD�partement;
	this.idContact = idContct;
	this.listePi�ceJointe = listePi�ceJointe;
}
public long getIdSource() {
	return idSource;
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
public long getIdContct() {
	return idContact;
}
public void setIdContct(long idContct) {
	this.idContact = idContct;
}
public long[] getListePi�ceJointe() {
	return listePi�ceJointe;
}
public void setListePi�ceJointe(long[] listePi�ceJointe) {
	this.listePi�ceJointe = listePi�ceJointe;
}
@Override
public String toString() {
	return "Courrier [idSource=" + idSource + ", idD�partement=" + idD�partement + ", idContct=" + idContact
			+ ", listePi�ceJointe=" + Arrays.toString(listePi�ceJointe) + "]";
} 

}
