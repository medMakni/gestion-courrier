package biz.picosoft.mains;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import biz.picosoft.daoImpl.ContacteDaoImpl;
import biz.picosoft.entity.Contacte;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contacte contacte = new Contacte("fatma", "test222222", "test", "test");

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ContacteDaoImpl contacteDaoImpl = (ContacteDaoImpl) context.getBean("d");
		//contacteDaoImpl.insert(contacte);
		
	List<Contacte> lst =contacteDaoImpl.findAll();
		for (Contacte contacte2 : lst) {
			System.err.println(contacte2.getIdContact());
			contacte2.setAdresse("222222222222666666666");
			contacteDaoImpl.update(contacte2);
				//contacteDaoImpl.delete(contacte2);
		}
		
 
	 contacteDaoImpl.insert(contacte);
	 System.out.println(contacteDaoImpl.getDaoType()  );
	
	}

}
