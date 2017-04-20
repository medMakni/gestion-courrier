package biz.picosoft.mains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import biz.picosoft.daoImpl.ContacteDaoImpl;
import biz.picosoft.entity.Contacte;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Contacte contacte=new Contacte("fatma", "test2",  "test",  "test");

ApplicationContext context =
new ClassPathXmlApplicationContext("applicationContext.xml");
 contacte.setIdContact (4);
ContacteDaoImpl contacteDaoImpl=(ContacteDaoImpl) context.getBean("d");
 contacteDaoImpl.deleteContacte(contacte) ;

	}

}
