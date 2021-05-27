package dao;

import java.util.List;

public interface CurdDao {
	void saveStudent(Object o);
	void updateStudent(Object o);
	List findStudents();
	void SaveOrUpdateStudent(Object o);

}
