package client;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonDAO;
import model.Person;

public class TestClient {
	public static void main(String args[]) throws Exception {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applocationContext.xml");
		PersonDAO personDAO = context.getBean(PersonDAO.class);

		Person person = new Person();
		person.setId(1);
		person.setName("sada"); 
		person.setCountry("India");
		personDAO.save(person);
		System.out.println("Person::"+person);

		List<Person> list = personDAO.list();
		for(Person p : list){
			System.out.println("Person List::"+p);
		}
		context.close();	
	}


}
//create table Person(id number(5), name varchar2(10), country varchar2(10), primary key(id));