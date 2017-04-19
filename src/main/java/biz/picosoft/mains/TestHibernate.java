package biz.picosoft.mains;

import biz.picosoft.daoImpl.ContacteDao;
import biz.picosoft.daoImpl.ContacteDaoImpl;
import biz.picosoft.entity.Contacte;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Contacte contacte=new Contacte("fatma", "test",  "test",  "test");
ContacteDaoImpl contacteDaoImpl=new ContacteDaoImpl();
System.out.println(contacteDaoImpl.getTemplate());
	}

}
