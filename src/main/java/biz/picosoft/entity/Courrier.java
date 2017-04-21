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
	@Column(name = "idDépartement")
long idDépartement;
	@Column(name = "idContct")
long idContact;
	
long[] listePiéceJointe;
public Courrier(long idSource, long idDépartement, long idContct, long[] listePiéceJointe) {
	super();
	this.idSource = idSource;
	this.idDépartement = idDépartement;
	this.idContact = idContct;
	this.listePiéceJointe = listePiéceJointe;
}
public long getIdSource() {
	return idSource;
}
public void setIdSource(long idSource) {
	this.idSource = idSource;
}
public long getIdDépartement() {
	return idDépartement;
}
public void setIdDépartement(long idDépartement) {
	this.idDépartement = idDépartement;
}
public long getIdContct() {
	return idContact;
}
public void setIdContct(long idContct) {
	this.idContact = idContct;
}
public long[] getListePiéceJointe() {
	return listePiéceJointe;
}
public void setListePiéceJointe(long[] listePiéceJointe) {
	this.listePiéceJointe = listePiéceJointe;
}
@Override
public String toString() {
	return "Courrier [idSource=" + idSource + ", idDépartement=" + idDépartement + ", idContct=" + idContact
			+ ", listePiéceJointe=" + Arrays.toString(listePiéceJointe) + "]";
} 

}
