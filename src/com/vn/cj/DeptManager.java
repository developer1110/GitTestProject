package com.vn.cj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeptManager {
	
	private ObjectMapper dept_om ;
	private List<Dept> dept = new ArrayList<Dept>();
	private File fs;
	
	{
		this.dept_om = new ObjectMapper();
	}
	
	public DeptManager(File fs) {
		super();
		this.fs = fs;
	}
	
	public List<Dept> getDept() {
		return dept;
	}
	public void setDept(List<Dept> dept) {
		this.dept = dept;
	}
	public File getFs() {
		return fs;
	}
	public void setFs(File fs) {
		this.fs = fs;
	}
	public DeptManager() {
		super();
	}
	
	
	
	public List<Dept> LoadDeptListJson() throws FileNotFoundException {
		if ( fs == null) {
			return null;
		} else {
			try {
				dept =	Arrays.asList(dept_om.readValue(fs, Dept[].class));
			} catch (JsonParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (JsonMappingException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		return dept;
	}
	
	
	


}
