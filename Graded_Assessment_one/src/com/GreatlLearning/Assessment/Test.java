package com.GreatlLearning.Assessment;

public class Test {

	public static void main(String[] args) {
		SuperDepartment sup = new SuperDepartment();
		sup.departmentname();
		sup.getTodaysWork();
		sup.getWorkDeadline();
		sup.isTodayAHoliday();
		
		
		AdminDepartment adm = new AdminDepartment();
		adm.departmentname();
		adm.getTodaysWork();
		adm.isTodayAHoliday();
		
		
		HrDepartment hr = new HrDepartment();
		hr.departmentname();
		hr.getTodaysWork();
		hr.getWorkDeadline();
		hr.getWorkDeadline();
		
		TechDepartment tech = new TechDepartment();
		tech.departmentname();
		tech.getTodaysWork();
		tech.getWorkDeadline();
		tech.getTechStackInformation();


	}

}
