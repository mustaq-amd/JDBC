package com.masai.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.app.entity.Employee;
import com.masai.app.utility.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> employees=null;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String query="from Employee";
		
		TypedQuery<Employee> tq=em.createQuery(query,Employee.class);
		
		employees=	tq.getResultList();
		
		return employees;
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		
		String address=null;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String query="select address from Employee where empId=:eid";
		
		Query q = em.createQuery(query);
		q.setParameter("eid", empId);
		
		address=(String)q.getSingleResult();
		
		
		return address;
		
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		
		String message=null;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String query="update Employee set salary=salary+:amount where empId=:eid";
		
		Query q = em.createQuery(query);
		
		q.setParameter("amount", bonus);
		q.setParameter("eid", empId);
		
		em.getTransaction().begin();
		
		int result=q.executeUpdate();
		
		em.getTransaction().commit();
		
		
		if(result>0) {
			message="Bonus Added Successfully";
			
		}
		return message;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		boolean flag=false;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		String query="delete from Employee where empId=:eid";
		
		Query q = em.createQuery(query);
		
		q.setParameter("eid", empId);
		
		em.getTransaction().begin();
		
		int result=q.executeUpdate();
		
		em.getTransaction().commit();
		
		
		if(result>0) {
			flag=true;
			
		}
			
		
		return flag;
	}

	@Override
	public String[] getNameAndAddress(int empId) {
		
		String[] list=new String[2];
		
		EntityManager em= EMUtil.provideEntityManager();
		
		Employee employee=em.find(Employee.class, empId);
		
		if(employee == null) {
			
			return null;
		
		}else {
			
			
			String query= "select name,address from Employee where empId=:eid";
			
			TypedQuery<Object[]> q=em.createQuery(query,Object[].class);
			
			q.setParameter("eid", empId);
			
			Object[] obj=q.getSingleResult();
				
			list[0]=(String) obj[0];
			list[1]=(String) obj[1];
			
		}
		
		
	
		
		return list;
	}

}
