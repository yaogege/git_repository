package action;

import java.util.ArrayList;

import model.*;
import servlet.*;

public class QueryInfoAction {
	private QueryInfoServlet getinfo;
	private ArrayList<CollegeModel> collegeEntitys;
	private ArrayList<SpecialtyModel> specialtyEntitys;

	public ArrayList<CollegeModel> getCollegeEntitys() {
		return collegeEntitys;
	}
	public ArrayList<SpecialtyModel> getSpecialtyEntitys() {
		return specialtyEntitys;
	}
	
    /**
     * 获取全部学院信息
     * @return
     */
	public String queryCollegeInfo() {
		getinfo = new QueryInfoServlet();
		collegeEntitys = getinfo.getCollegeInfo();
		System.out.println(collegeEntitys.toArray());
		return "query_college_info";
	}
	/**
	 * 获取全部专业信息
	 * @return
	 */
	public String querySpecialtyInfo() {
		getinfo = new QueryInfoServlet();
		specialtyEntitys = getinfo.getSpecialtyInfo();
		System.out.println(specialtyEntitys.toArray());
		return "query_specialty_info";
	}

}
