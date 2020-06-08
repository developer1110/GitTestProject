package com.vn.cj;

import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.*;


public class ReadJsonFiles {
	public static void main(String[] args)
			throws JsonParseException, JsonMappingException, IOException, ClassNotFoundException, SQLException {

		DeptManager dm = new DeptManager(new File("data/dept.json"));
		List<Dept> dept = dm.LoadDeptListJson();
		System.out.println("Following Departments Will be Loaded :");
		dept.forEach(e -> System.out.println(e));
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dev", "root", "admin");
		Statement stmt = con.createStatement();  
		boolean result = stmt.execute("Insert into dept (deptno, dname, loc) Values ( 10, 'Accounting', 'New York' )");
		con.close();
		System.out.println("Result = " + result);
		
		//now let's use generic version to load employee
		JsonManager jm = new JsonManager();
		Employee[] empList;
		empList = 	jm.LoadGenericJson(Employee[].class, "data/employee.json");
		for (Employee employee : empList) {
			System.out.println(employee.toString());
		}
	}
}
