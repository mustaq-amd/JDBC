package com.masai.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.masai.EMUtil.EMUtil;
import com.masai.beans.Employee;


@Repository
public class EmployeeRepoImpl implements EmployeeRepo {

	@Override
	public boolean insertEmployeeDetails(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		
		List<Employee> employees=null;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String query="from Employee";
		
		TypedQuery<Employee> tq=em.createQuery(query,Employee.class);
		
		employees=	tq.getResultList();
		
		return employees;
	}

	@Override
	public Employee findEmployee(int empId) {
		
		Employee employee=null;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		employee=em.find(Employee.class, empId);
		
		if(employee == null) {
			
			return null;
		
		}else {
			
			
			String query= "select * from Employee where empId=:eid";
			
			TypedQuery<Employee> q=em.createQuery(query,Employee.class);
			
			q.setParameter("eid", empId);
			
			employee=q.getSingleResult();
				
			
			
		}
		
		
		return employee;
	}

	@Override
	public String deleteEmployeeDetailsById(int empId) {
		
		String flag="employee not deleted";
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String query="delete from Employee where empId=:eid";
		
		Query q = em.createQuery(query);
		
		q.setParameter("eid", empId);
		
		em.getTransaction().begin();
		
		int result=q.executeUpdate();
		
		em.getTransaction().commit();
		
		
		if(result>0) {
			flag="employee deleted successfully...";
			
		}
			
		
		return flag;
	}

}
