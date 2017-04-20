package biz.picosoft.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import dao.GenericDao;
@Transactional(readOnly=false)
public class GenericDaoImp<T> implements GenericDao<T> {
	HibernateTemplate template;

	public void insert(T t) {
		// TODO Auto-generated method stub
		template.save(t);
		
	}

	public void update(T t) {
		// TODO Auto-generated method stub
		template.update(t);
	}

	public void delete(T t) {
		// TODO Auto-generated method stub
		template.delete(t);
	}

	public T findById(Class<T> t, String id) {
		// TODO Auto-generated method stub
		return template.get(t, id);
	}

	public List<T> findAll(Class<T> t) {
		// TODO Auto-generated method stub
		return template.loadAll(t);
	} 
	 


	 
}
