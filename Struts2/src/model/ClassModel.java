package model;

public class ClassModel {
	private int classID; // 班级编号
	private String className;// 班级姓名
	private int classNumber;// 班级人数
	private String belongToCollege;// 所属院系
	private String belongToSpecialty;// 所属专业
	private String belongToCounsellor;// 所属辅导员
	private int specialtyID;// 专业编号
	private int counsellorID;// 辅导员编号

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
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

	public String getBelongToCounsellor() {
		return belongToCounsellor;
	}

	public void setBelongToCounsellor(String belongToCounsellor) {
		this.belongToCounsellor = belongToCounsellor;
	}

	public int getSpecialtyID() {
		return specialtyID;
	}

	public void setSpecialtyID(int specialtyID) {
		this.specialtyID = specialtyID;
	}

	public int getCounsellorID() {
		return counsellorID;
	}

	public void setCounsellorID(int counsellorID) {
		this.counsellorID = counsellorID;
	}

}
