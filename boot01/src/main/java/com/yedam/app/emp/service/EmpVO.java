package com.yedam.app.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;


@Data
public class EmpVO {
	private Integer empid;
	private String empname;
	private int mgr;
	private double sal;
	private int deptid;
	@DateTimeFormat(pattern="yyyy-mkm-dd")
	private Date hiredate; 
}
