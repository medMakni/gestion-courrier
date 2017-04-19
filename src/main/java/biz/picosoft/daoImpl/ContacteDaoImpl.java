package biz.picosoft.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import biz.picosoft.entity.Contacte;

public class ContacteDaoImpl implements ContacteDao{
	HibernateTemplate template;  
	public void setTemplate(HibernateTemplate template) {  
	    this.template = template;  
	}  
	public void inserteContacte(Contacte contacte) {
		// TODO Auto-generated method stub
		template.save(contacte);
	}

	public void updateContacte(Contacte contacte) {
		// TODO Auto-generated method stub
		template.update( contacte );
	}

	public void deleteContacte(Contacte contacte) {
		// TODO Auto-generated method stub
		template.delete(contacte);
	}

	public Contacte getContacteById(int id) {
		// TODO Auto-generated method stub
	 
		return template.get(Contacte.class, id);
	}

	public List<Contacte> getAll() {
		// TODO Auto-generated method stub
		return template.loadAll(Contacte.class);
	}
	public HibernateTemplate getTemplate() {
		return template;
	}

}
