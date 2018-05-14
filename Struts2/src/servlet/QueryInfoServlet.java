package servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.*;

public class QueryInfoServlet {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private CollegeModel college_item;
	private SpecialtyModel specialty_item;

	public ArrayList<CollegeModel> getCollegeInfo() {
		ArrayList<CollegeModel> collegeInfo = new ArrayList<CollegeModel>();
		String sql = "select * from college_info";
		int i = 0;
		try {
			con = DBConn.getConn();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				college_item = new CollegeModel();
				college_item.setCollegeID(rs.getInt("collegeID"));
				college_item.setCollegeName(rs.getString("collegeName"));
				college_item.setCollegeNumber(rs.getInt("collegeNumber"));
				i = rs.getInt("collegeNumber");
				college_item.setCollegeSummarize(rs.getString("collegeSummarize"));
				collegeInfo.add(college_item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.dbClose(con, ps, rs);
		}
		System.out.println(i);
		return collegeInfo;
	}

	public ArrayList<SpecialtyModel> getSpecialtyInfo() {
		ArrayList<SpecialtyModel> specialtyInfo = new ArrayList<SpecialtyModel>();
		String sql = "select * from specialty_info";
		int i = 0;
		try {
			con = DBConn.getConn();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				specialty_item = new SpecialtyModel();
				specialty_item.setCollegeID(rs.getInt("specialtyID"));
				specialty_item.setSpecialtyName(rs.getString("specialtyName"));
				specialty_item.setSpecialtyNumber(rs.getInt("specialtyNumber"));
				specialty_item.setBelongToCollege(rs.getString("belongToCollege"));
				specialty_item.setSpecialtySummarize(rs.getString("specialtySummarize"));
				i = rs.getInt("specialtyNumber");
				specialtyInfo.add(specialty_item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.dbClose(con, ps, rs);
		}
		System.out.println("专业人数" + i);
		return specialtyInfo;
	}

}
