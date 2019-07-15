package service;

import java.util.ArrayList;
import java.util.List;

import presentation.EmployeeDao;
import day7.Employee;





public class EmployeeService {
	public List<Employee> getEmployeesByCity(String city)
	{
         EmployeeDao dao=new EmployeeDao();
         
         List<Employee> daoList=new ArrayList();
         List<Employee> newList=new ArrayList();
         daoList=dao.getEmployees();
         for(Employee employee:daoList)
         {
        	 if(employee.getEmpCity().equals(city))
        	 {
        		 newList.add(employee);
        	 }
         }
         return newList;
	}
}
