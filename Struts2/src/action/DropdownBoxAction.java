package action;

import java.util.ArrayList;

import model.CollegeModel;
import servlet.DropdownBoxQurey;

public class DropdownBoxAction {
	
	private ArrayList<CollegeModel> entitys;

	public ArrayList<CollegeModel> getEntitys() {
		return entitys;
	}

	public String queryCollegeName() {
		DropdownBoxQurey collegeInfo = new DropdownBoxQurey();
		entitys = collegeInfo.getCollegeInfo();
		
		//System.out.println("aaaaaaaaaaa");
		return "query_collegeName";
	}

}
