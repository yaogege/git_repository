package model;

public class CourseModel {
	private int courseID;
	private String courseNum;
	private String courseName;
	private String courseTime;
	private int courseCredit;
	private String belongToCollege;
	private String belongToSpecialty;
	private String belongToTeacher;
	private String classPlace;
	private String courseSummarize;
	private String electivePeople;
	private int classType;

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public int getCourseCredit() {
		return courseCredit;
	}

	public void setCourseCredit(int courseCredit) {
		this.courseCredit = courseCredit;
	}

	public String getBelongToCollege() {
		return belongToCollege;
	}

	public void setBelongToCollege(String belongToCollege) {
		this.belongToCollege = belongToCollege;
	}

	public String getBelongToSpecialty() {
		return belongToSpecialty;
	}

	public void setBelongToSpecialty(String belongToSpecialty) {
		this.belongToSpecialty = belongToSpecialty;
	}

	public String getBelongToTeacher() {
		return belongToTeacher;
	}

	public void setBelongToTeacher(String belongToTeacher) {
		this.belongToTeacher = belongToTeacher;
	}

	public String getClassPlace() {
		return classPlace;
	}

	public void setClassPlace(String classPlace) {
		this.classPlace = classPlace;
	}

	public String getCourseSummarize() {
		return courseSummarize;
	}

	public void setCourseSummarize(String courseSummarize) {
		this.courseSummarize = courseSummarize;
	}

	public String getElectivePeople() {
		return electivePeople;
	}

	public void setElectivePeople(String electivePeople) {
		this.electivePeople = electivePeople;
	}

	public int getClassType() {
		return classType;
	}

	public void setClassType(int classType) {
		this.classType = classType;
	}

}
