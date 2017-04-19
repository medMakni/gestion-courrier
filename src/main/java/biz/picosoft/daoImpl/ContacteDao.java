package biz.picosoft.daoImpl;

import java.util.List;

import biz.picosoft.entity.Contacte;

public interface ContacteDao {
void inserteContacte(Contacte contacte);
void updateContacte(Contacte contacte);
void deleteContacte(Contacte contacte);
Contacte getContacteById(int id);
List<Contacte> getAll();

}
