package com.employee.dao.implement;

import java.sql.*;
import com.employee.model.*;
import com.employee.dao.interf.*;
import com.employee.db.DBUtil;
import java.util.*;

public class DaoImplementation implements DaoInterf {
	
	Pojo p = new Pojo();
	private static PreparedStatement pst = null;
	public static Connection con = DBUtil.createConnection();
	public static int rs;

	public int addEmployee(Pojo p) {
		System.out.println("Inside Dao Implementation con value " + con);
		int employeeAdded = 0;
		String query = "insert into employee (name) values(?)";
		String last_id = "SET @last_id = LAST_INSERT_ID()";
		String query2 = "insert into salary (id , salary) values(@last_id, ?)";
		try {
			System.out.println("Heloo");
			pst = con.prepareStatement(query);
			pst.setString(1, p.getEmployeeName());
			System.out.println(p.getEmployeeName());
			employeeAdded = pst.executeUpdate();
			// pst=con.prepareStatement(last_id);
			// employeeAdded =pst.executeUpdate();
			pst = con.prepareStatement(query2);
			pst.setFloat(1, p.getEmployeeSalary());
			employeeAdded = pst.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
		}
		return employeeAdded;

	}

	public List<Pojo> showEmployee(Pojo p) {
		List<Pojo> list = new ArrayList<Pojo>();

		try {
			String q1 = "select employee.id , employee.name , salary.salary from employee INNER JOIN salary ON employee.id = salary.id WHERE employee.id="
					+ p.getEmployeeId();

			pst = con.prepareStatement(q1);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				p.setEmployeeId(rs.getInt("id"));
				p.setEmployeeName(rs.getString("name"));
				p.setEmployeeSalary(rs.getFloat("salary"));

				list.add(p);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public boolean deleteEmployee(Pojo p) {
		boolean employeedeleted = false;
		try {
			// String q1 = "delete employee, salary from employee INNER JOIN salary ON
			// employee.id = salary.id WHERE employee.id="+p.getEmployeeId();
			pst = con.prepareStatement("delete from salary WHERE id=" + p.getEmployeeId());
			pst.executeUpdate();
			pst = con.prepareStatement("delete from project WHERE id=" + p.getEmployeeId());
			pst.executeUpdate();
			pst = con.prepareStatement("delete from employee WHERE id=" + p.getEmployeeId());
			employeedeleted = pst.execute();
		} catch (Exception e) {
			System.out.println(e);
		}
		return employeedeleted;

	}

	public int updateEmployee(Pojo p) {
		int updateemployee = 0;
		try {
			pst = con.prepareStatement("update employee set name=?" + " where id=?");

			pst.setString(1, p.getEmployeeName());
			pst.setInt(2, p.getEmployeeId());
			updateemployee = pst.executeUpdate();
			pst = con.prepareStatement("update salary set salary=?" + " where id=?");
			pst.setFloat(1, p.getEmployeeSalary());
			pst.setInt(2, p.getEmployeeId());
			updateemployee = pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return updateemployee;
	}

	public int addProject(Pojo p) {
		int addproject = 0;
		try {
			pst = con.prepareStatement("INSERT INTO project (description,emp_id) VALUES (?,?)");

			pst.setString(1, p.getProjectName());
			pst.setInt(2, p.getAssignTo());
			addproject = pst.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return addproject;
	}

	public List<Pojo> showAllEmployee() {
		List<Pojo> list = new ArrayList<Pojo>();

		try {
			String q1 = "select employee.id , employee.name , salary.salary , project.description from employeet LEFT JOIN salary ON employee.id = salary.id LEFT JOIN project ON salary.id = project.emp_id";
			pst = con.prepareStatement(q1);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				p.setEmployeeId(rs.getInt("id"));
				p.setEmployeeName(rs.getString("name"));
				p.setEmployeeSalary(rs.getFloat("salary"));
				p.setProjectName(rs.getString("description"));
				list.add(p);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

	public List<Pojo> showEmployeeProject(Pojo p) {
		List<Pojo> list = new ArrayList<Pojo>();

		try {
			String q1 = "select * from project where project.emp_id=" + p.getEmployeeId();

			pst = con.prepareStatement(q1);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				p.setProjectId(rs.getInt("id"));
				p.setProjectName((rs.getString("description")));
				System.out.println(rs.getString("description"));
				p.setEmployeeId(rs.getInt("emp_id"));

				list.add(p);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return list;
	}

}
