package dao;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;



public class CurdDaoImpl implements CurdDao {
	
	private HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	@Transactional(readOnly = false)
	public void saveStudent(Object o) {
		ht.save(o);
	}

	@Override
	@Transactional(readOnly = false)
	public void updateStudent(Object o) {
		ht.update(o);

	}

	@Override
	@Transactional(readOnly = false)
	public List findStudents() {
		List<Object> l = ht.find("from Student s");
		return l;
	}

	@Override
	@Transactional(readOnly = false)
	public void SaveOrUpdateStudent(Object o) {
		ht.saveOrUpdate(o);
		
	}

}
