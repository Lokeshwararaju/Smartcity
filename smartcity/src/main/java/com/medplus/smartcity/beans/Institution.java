package com.medplus.smartcity.beans;

import org.springframework.stereotype.Component;

@Component
public class Institution {
	private int instituteId;
	private String instituteName;
	private String locatlion;
	private String institutionType;
	private double courseFee;
	private String coursesOffered;
	private String courseType;
	private String courseDuration;
	private String contactDetails;
	public int getInstituteId() {
		return instituteId;
	}
	public void setInstituteId(int instituteId) {
		this.instituteId = instituteId;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getLocatlion() {
		return locatlion;
	}
	public void setLocatlion(String locatlion) {
		this.locatlion = locatlion;
	}
	public String getInstitutionType() {
		return institutionType;
	}
	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}
	public String getCoursesOffered() {
		return coursesOffered;
	}
	public void setCoursesOffered(String coursesOffered) {
		this.coursesOffered = coursesOffered;
	}
	public String getCourseType() {
		return courseType;
	}
	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}
}