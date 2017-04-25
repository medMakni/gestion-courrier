package biz.picosoft.daoImpl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import biz.picosoft.entity.Contacte;
import dao.ContacteDao;
@Component
public class ContacteDaoImpl extends GenericDaoImp<Contacte> implements ContacteDao {

}
