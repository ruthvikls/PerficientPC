package com.BasicPrograms;

class EmployeeDetails {

	private String name;
	private int age;
	private String gender;
	private String dept;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept + "]";
	}

	public static void main(String[] args) {

		EmployeeDetails emp = new EmployeeDetails();
		emp.setName("Varun");
		emp.setAge(24);
		emp.setGender("Male");
		emp.setDept("IT");
		System.out.println(emp.toString());

	}

}
