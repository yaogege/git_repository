package action;

import model.CollegeModel;
import model.SpecialtyModel;
import servlet.AddInfoServlet;
import com.google.gson.*;

public class AddInfoAction {
	private AddInfoServlet servlet;
	private CollegeModel college;
	private SpecialtyModel specialty;

	public SpecialtyModel getSpecialty() {
		return specialty;
	}

	public void setSpecialty(SpecialtyModel specialty) {
		this.specialty = specialty;
	}

	public CollegeModel getCollege() {
		return college;
	}

	public void setCollege(CollegeModel college) {
		this.college = college;
	}

	/**
	 * 添加学院信息：\n 学院名称 学院简介
	 * 
	 * @return
	 * @throws Exception
	 */
	public String addCollegeInfo() throws Exception {

		servlet = new AddInfoServlet();
		String result = servlet.addCollegeInfo(college.getCollegeName(), college.getCollegeSummarize());
		if (result.equals("1"))
			return "addsuccess";
		else
			return "adderror";

	}

	/**
	 * 添加专业信息:专业名称 专业简介
	 *
	 * @return
	 * @throws Exception
	 */
	public String addSpecialtyInfo() throws Exception {

		System.out.println(specialty.getSpecialtyName());
		System.out.println(specialty.getBelongToCollege());
		System.out.println(specialty.getSpecialtySummarize());
		servlet = new AddInfoServlet();
		String result = servlet.addSpecialtyInfo(specialty.getSpecialtyName(), specialty.getBelongToCollege(),
				specialty.getSpecialtySummarize());

		if (result.equals("1"))
			return "addsuccess";
		else
			return "adderror";
	}
}
