package biz.picosoft.daoImpl;

import org.springframework.transaction.annotation.Transactional;

import biz.picosoft.entity.Contacte;
import dao.ContacteDao;
@Transactional(readOnly=false)
public class ContacteDaoImpl extends GenericDaoImp<Contacte> implements ContacteDao{
	 
}
