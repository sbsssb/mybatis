package com.emp.model.vo;

import java.util.List;

import lombok.Data;

@Data
public class Department {
	
	private String deptId;
	private String deptTitle;
	private String locationId;
	private List<Employee> employess;

}
