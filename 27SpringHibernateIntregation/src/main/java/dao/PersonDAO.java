package dao;

import java.util.List;
import model.Person;
public interface PersonDAO {
	public void save(Person p);
	public List<Person> list();
}