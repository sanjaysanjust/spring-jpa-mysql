package com.example.mysql.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//It's a many to one unidirectional relationship with Teacher class(Many courses can be thought by a single teacher. 
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseWithManyToOneRealtionship {

	@Id
	@SequenceGenerator(name = "course_sequence", sequenceName = "course_sequence", allocationSize = 1)
	@GeneratedValue(generator = "course_sequence", strategy = GenerationType.SEQUENCE)
	private Long courseId;
	private String title;
	private Integer credit;
	//@OneToOne(mappedBy = "course")
	//private CourseMaterial courseMaterial;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="teacher_id",referencedColumnName = "teacherId")
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	@Override
	public String toString() {
		return "courseId ===>" + getCourseId() + "title ===> " + getTitle() + "credit ===>" + getTitle()
				+ "Teacher ==>"+getTeacher();
	}
}
