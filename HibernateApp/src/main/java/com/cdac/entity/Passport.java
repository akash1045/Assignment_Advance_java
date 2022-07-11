package com.cdac.entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "tbl_passport")
public class Passport {
   public int getPassportNO() {
		return passportNO;
	}
	public void setPassportNO(int passportNO) {
		this.passportNO = passportNO;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  private int passportNO;
  private LocalDate issueDate;
  private LocalDate expiryDate;
  private String issuedBy;
  @OneToOne
  @JoinColumn(name = "pers_id")
  private Person person;
}
