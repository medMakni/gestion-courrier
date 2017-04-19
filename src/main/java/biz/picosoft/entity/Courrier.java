package biz.picosoft.entity;

import java.util.Arrays;

public class Courrier {
long idSource;
long idDépartement;
long idContct;
long[] listePiéceJointe;
public Courrier(long idSource, long idDépartement, long idContct, long[] listePiéceJointe) {
	super();
	this.idSource = idSource;
	this.idDépartement = idDépartement;
	this.idContct = idContct;
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
	return idContct;
}
public void setIdContct(long idContct) {
	this.idContct = idContct;
}
public long[] getListePiéceJointe() {
	return listePiéceJointe;
}
public void setListePiéceJointe(long[] listePiéceJointe) {
	this.listePiéceJointe = listePiéceJointe;
}
@Override
public String toString() {
	return "Courrier [idSource=" + idSource + ", idDépartement=" + idDépartement + ", idContct=" + idContct
			+ ", listePiéceJointe=" + Arrays.toString(listePiéceJointe) + "]";
} 

}
