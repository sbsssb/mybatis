package com.emp.model.service;

import static com.emp.common.SessionTemplate.getSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.emp.model.dao.EmpDao;
import com.emp.model.vo.Department;
import com.emp.model.vo.Employee;

public class EmpService {
	
	private EmpDao dao = new EmpDao(); 
	
	public List<Map> selectEmpAll(int cPage, int numPerpage) {
		
		SqlSession session=getSession();
		
		List<Map> emps = dao.selectEmpAll(session, cPage, numPerpage);
		
		session.close();
		return emps;
		
	}
	
	
	public List<Employee> searchEmp(Map<String, Object> param){
		
		SqlSession session=getSession();
		
		List<Employee> result=dao.searchEmp(session,param);
		
		session.close();
		return result;
	}
	
	public Department selectDept(String deptId) {
		
		SqlSession session=getSession();
		Department d=dao.selectDept(session, deptId);
		
		session.close();
		return d;
		
	}

}
