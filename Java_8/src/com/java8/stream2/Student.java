package com.java8.stream2;

public class Student {

	private int sid;
	private String name;
	private long phone;
	private String courseName;
	private double feepaid;
	private double feebal;
	
	public Student() {}
	
	public Student(int sid, String name, long phone, String courseName, double feepaid, double feebal) {
		super();
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.courseName = courseName;
		this.feepaid = feepaid;
		this.feebal = feebal;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFeepaid() {
		return feepaid;
	}
	public void setFeepaid(double feepaid) {
		this.feepaid = feepaid;
	}
	public double getFeebal() {
		return feebal;
	}
	public void setFeebal(double feebal) {
		this.feebal = feebal;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", phone=" + phone + ", courseName=" + courseName
				+ ", feepaid=" + feepaid + ", feebal=" + feebal + "]";
	}
	
	
}
