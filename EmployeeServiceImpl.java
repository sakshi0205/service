package services;

import java.util.List;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import bean.Employee;


public class EmployeeServiceImpl implements EmployeeService{
	
           EmployeeDao dao=new EmployeeDaoImpl();
	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dao.addEmployee(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return dao.getEmployees();
	}

	@Override
	public void updateEmployee(Integer empId, String city) {
		// TODO Auto-generated method stub
		dao.updateEmployee(empId,city);
	}

	@Override
	public void deleteEmployee(Integer empId) {
		// TODO Auto-generated method stu1b
		dao.deleteEmployee(empId);
	}

}
