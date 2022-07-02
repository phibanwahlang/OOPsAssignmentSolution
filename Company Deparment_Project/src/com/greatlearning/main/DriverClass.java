package com.greatlearning.main;

import com.greatlearning.department.AdminDepartment;
import com.greatlearning.department.HrDepartment;
import com.greatlearning.department.TechDepartment;

public class DriverClass {
	
	public static void main(String[] args) {
		
		AdminDepartment admin = new AdminDepartment();
		System.out.println(admin.deparmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.print("\n");
		
		HrDepartment hr = new HrDepartment();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.print("\n");
		
		TechDepartment tech = new TechDepartment();
		System.out.println(tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}
}
