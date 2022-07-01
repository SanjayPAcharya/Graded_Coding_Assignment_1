package com.departments;

public class Driver {

	public static void main(String[] args) {

		// Creating instance of 3 classes AdminDepartment, HrDepartment and TechDepartment
		
		AdminDepartment adminDept = new AdminDepartment();
		HrDepartment hrDept = new HrDepartment();
		TechDepartment techDept = new TechDepartment();
		
		// Information of Admin Department
		// The method "isTodayHoliday()" is accessible on all the above 3 instances because they extend SuperDepartment Class.
		
		System.out.println("\n Welcome to " + adminDept.getDepartmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayHoliday());

		// Information of HR Department Department

		System.out.println("\n Welcome to " + hrDept.getDepartmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayHoliday());

		// Information of Tech Department Department

		System.out.println("\n Welcome to " + techDept.getDepartmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(techDept.getTechStackInformation());
		System.out.println(techDept.isTodayHoliday());
	}

}
