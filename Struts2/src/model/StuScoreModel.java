package model;

public class StuScoreModel {
	private int sc_stuID;
	private int sc_courseID;
	private String sc_score; //成绩分数
	private String sc_credit;// 已获学分

	public int getSc_stuID() {
		return sc_stuID;
	}

	public void setSc_stuID(int sc_stuID) {
		this.sc_stuID = sc_stuID;
	}

	public int getSc_courseID() {
		return sc_courseID;
	}

	public void setSc_courseID(int sc_courseID) {
		this.sc_courseID = sc_courseID;
	}

	public String getSc_score() {
		return sc_score;
	}

	public void setSc_score(String sc_score) {
		this.sc_score = sc_score;
	}

	public String getSc_credit() {
		return sc_credit;
	}

	public void setSc_credit(String sc_credit) {
		this.sc_credit = sc_credit;
	}

}
