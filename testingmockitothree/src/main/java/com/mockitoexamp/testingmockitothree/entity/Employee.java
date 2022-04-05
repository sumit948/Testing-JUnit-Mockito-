package com.mockitoexamp.testingmockitothree.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 10000000L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long employeeId;
	
	@Column
	private String employeeName;
	
	private Boolean isAvailbale;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Boolean getIsAvailbale() {
		return isAvailbale;
	}

	public void setIsAvailbale(Boolean isAvailbale) {
		this.isAvailbale = isAvailbale;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeName, isAvailbale);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeId, other.employeeId) && Objects.equals(employeeName, other.employeeName)
				&& Objects.equals(isAvailbale, other.isAvailbale);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", isAvailbale=" + isAvailbale
				+ "]";
	}

	
		
	
	
}
