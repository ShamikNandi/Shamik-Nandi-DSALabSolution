package com.gl.model;

public class Employee {

	private String sFname;
	private String sLname;
	private String sDepartmentName;

	public Employee(String sFname, String sLname, String sDepartment) {
		super();
		this.sFname = sFname;
		this.sLname = sLname;
		this.sDepartmentName = sDepartment;
	}

	public String getsFname() {
		return sFname;
	}

	public void setsFname(String sFname) {
		this.sFname = sFname;
	}

	public String getsLname() {
		return sLname;
	}

	public void setsLname(String sLname) {
		this.sLname = sLname;
	}

	public String getsDepartmentName() {
		return sDepartmentName;
	}

	public void setsDepartmentName(String sDepartmentName) {
		this.sDepartmentName = sDepartmentName;
	}

}
