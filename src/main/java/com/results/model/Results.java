package com.results.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Results {
	@Id
	private String hallticketno;
	private String studentName;
	private int    java;
	private int    se;
	private int    acd;
	private int    mefa;
	private int    R;
	public Results() {
		super();
	}
	public Results(String hallticketno, String studentName, int java, int se, int acd, int mefa, int r) {
		super();
		this.hallticketno = hallticketno;
		this.studentName = studentName;
		this.java = java;
		this.se = se;
		this.acd = acd;
		this.mefa = mefa;
		R = r;
	}
	public String getHallticketno() {
		return hallticketno;
	}
	public void setHallticketno(String hallticketno) {
		this.hallticketno = hallticketno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getSe() {
		return se;
	}
	public void setSe(int se) {
		this.se = se;
	}
	public int getAcd() {
		return acd;
	}
	public void setAcd(int acd) {
		this.acd = acd;
	}
	public int getMefa() {
		return mefa;
	}
	public void setMefa(int mefa) {
		this.mefa = mefa;
	}
	public int getR() {
		return R;
	}
	public void setR(int r) {
		R = r;
	}
	@Override
	public String toString() {
		return "Results [hallticketno=" + hallticketno + ", studentName=" + studentName + ", java=" + java + ", se="
				+ se + ", acd=" + acd + ", mefa=" + mefa + ", R=" + R + "]";
	}
	

}
