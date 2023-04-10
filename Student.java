package org.student;

import org.department.Department;

public class Student extends Department {
	
	protected void studentName()
	{
		System.out.println("Student Name is Santhya");
	}
	protected void studentDept()
	{
		System.out.println("Student department is Information Technology");
	}
	protected void studentId()
	{
		System.out.println("Student ID is 12F247");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Below are the College Details:");
		Student obj=new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentId();
		obj.studentDept();

	}

}
