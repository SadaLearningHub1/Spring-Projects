package model;

import java.util.Iterator;
import java.util.List;

import dao.EmployeeDao;

public class DemoBean {
	
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void findAllEmployes() {
		List list = employeeDao.selectAllEmployees();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Employee e = (Employee)it.next();
			System.out.println("Empno : "+e.getEmpno());
			System.out.println("Ename : "+e.getEname());
			System.out.println("Sal : "+e.getSal());
			System.out.println("Deptno : "+e.getDeptno());
			System.out.println("=========================");
		}
	}

}
