package com.employee.dao.interf;

import java.util.*;

import com.employee.model.Pojo;

public interface DaoInterf {
	public int addEmployee(Pojo p);

	public List<Pojo> showEmployee(Pojo p);

	public boolean deleteEmployee(Pojo p);

	public int updateEmployee(Pojo p);

	public int addProject(Pojo p);

	public List<Pojo> showAllEmployee();

	public List<Pojo> showEmployeeProject(Pojo p);
}
