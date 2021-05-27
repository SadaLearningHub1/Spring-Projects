package service;

import java.util.List;

import dao.CurdDao;
import model.Student;

public class DemoBean {
	
	private CurdDao curdDao;
	
	public void setCurdDao(CurdDao curdDao) {
		this.curdDao = curdDao;
	}
	
	public void addStudent(int sId, String sName, int marks) {
		Student s = new Student();
		s.setStudentId(sId);
		s.setStudentName(sName);
		s.setMarks(marks);
		curdDao.saveStudent(s);
		System.out.println("Student inserted Successfully");
	}
	
	public void updateStudent(int sId, String sName, int marks) {
		Student s = new Student();
		s.setStudentId(sId);
		s.setStudentName(sName);
		s.setMarks(marks);
		curdDao.updateStudent(s);
		System.out.println("Student updated Successfully");
	}
	
	public void selectStudents() {
		List<Object> l = curdDao.findStudents();
		System.out.println(l.size()+ " Student found");
		for(Object o: l) {
			Student s = (Student)o;
			System.out.println("SID : "+s.getStudentId()+" SNAME: "+s.getStudentName()+" MARKS: "+s.getMarks());					
		}
	}
	
	public void saveOrUpdateStudent(int sId, String sName, int marks) {
		Student s = new Student();
		s.setStudentId(sId);
		s.setStudentName(sName);
		s.setMarks(marks);
		curdDao.SaveOrUpdateStudent(s);
		System.out.println("Student save or update Successfully");
	}
	
}
