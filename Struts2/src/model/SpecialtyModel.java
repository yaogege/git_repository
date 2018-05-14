package model;

public class SpecialtyModel {
	private int specialtyID;// 专业编号
	private int specialtyNumber;// 专业人数
	private String specialtyName;// 专业名称
	private String belongToCollege;// 所属院系
	private String specialtySummarize;// 专业简介
	private int collegeID;// 学院编号

	public int getSpecialtyID() {
		return specialtyID;
	}

	public void setSpecialtyID(int specialtyID) {
		this.specialtyID = specialtyID;
	}

	public int getSpecialtyNumber() {
		return specialtyNumber;
	}

	public void setSpecialtyNumber(int specialtyNumber) {
		this.specialtyNumber = specialtyNumber;
	}

	public String getSpecialtyName() {
		return specialtyName;
	}

	public void setSpecialtyName(String specialtyName) {
		this.specialtyName = specialtyName;
	}

	public String getBelongToCollege() {
		return belongToCollege;
	}

	public void setBelongToCollege(String belongToCollege) {
		this.belongToCollege = belongToCollege;
	}

	public String getSpecialtySummarize() {
		return specialtySummarize;
	}

	public void setSpecialtySummarize(String specialtySummarize) {
		this.specialtySummarize = specialtySummarize;
	}

	public int getCollegeID() {
		return collegeID;
	}

	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}

}
