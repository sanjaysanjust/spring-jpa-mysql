package com.example.mysql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tbl_student", uniqueConstraints = @UniqueConstraint(name = "email_id_unique", columnNames = "email_address"))
public class Student {
	@Id
	@SequenceGenerator(name = "student_sequence", allocationSize = 1, sequenceName = "student_sequence")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
	private Long studentId;
	private String firstName;
	private String lastName;
	@Column(name = "email_address", nullable = false)
	private String emailId;
	@Embedded
	private Guardian guardian;

	public Guardian getGuardian() {
		return guardian;
	}

	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {

		return " Stuedent Details : FirstName ->" + getFirstName() + " :: EmailId ->" + getEmailId() + " :: LastName ->"
				+ getLastName() + " :: GuardianName ->" + getGuardian().getName() + " :: GuardianMobile ->"
				+ getGuardian().getMobile();
	}

}
