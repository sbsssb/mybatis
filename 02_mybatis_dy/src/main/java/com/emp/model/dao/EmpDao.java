package com.emp.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.emp.model.vo.Department;
import com.emp.model.vo.Employee;

public class EmpDao {
	
	public List<Map> selectEmpAll(SqlSession session, int cPage, int numPerpage) {
		
		return session.selectList("emp.selectEmpAll", null, new RowBounds((cPage-1)*numPerpage,numPerpage));
		
	}
	
	public List<Employee> searchEmp(SqlSession session, Map<String, Object> param) {
		
		return session.selectList("emp.searchEmp", param);
		
	}
	
	public Department selectDept(SqlSession session, String deptId) {
		
		return session.selectOne("emp.selectDept", deptId);
		
	}

}
