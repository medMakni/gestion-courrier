package biz.picosoft.entity;

import java.util.Arrays;

public class Courrier {
long idSource;
long idD�partement;
long idContct;
long[] listePi�ceJointe;
public Courrier(long idSource, long idD�partement, long idContct, long[] listePi�ceJointe) {
	super();
	this.idSource = idSource;
	this.idD�partement = idD�partement;
	this.idContct = idContct;
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
	return idContct;
}
public void setIdContct(long idContct) {
	this.idContct = idContct;
}
public long[] getListePi�ceJointe() {
	return listePi�ceJointe;
}
public void setListePi�ceJointe(long[] listePi�ceJointe) {
	this.listePi�ceJointe = listePi�ceJointe;
}
@Override
public String toString() {
	return "Courrier [idSource=" + idSource + ", idD�partement=" + idD�partement + ", idContct=" + idContct
			+ ", listePi�ceJointe=" + Arrays.toString(listePi�ceJointe) + "]";
} 

}
