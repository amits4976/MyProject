package com.employee.model;
//This pojo class comprises of getter and setter methods; to get and set values
public class Pojo {

	private int employeeId;
	private String employeeName;
	private float employeeSalary;
	private int projectId;
	private String projectName;
	private int assign_to;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public float getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setAssignTo(int assign_to) {
		this.assign_to = assign_to;
	}

	public int getAssignTo() {
		return assign_to;
	}
}
