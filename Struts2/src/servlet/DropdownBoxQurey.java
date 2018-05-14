package servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.CollegeModel;

public class DropdownBoxQurey {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private CollegeModel college_item;

	public ArrayList<CollegeModel> getCollegeInfo() {
		ArrayList<CollegeModel> collegeInfo = new ArrayList<CollegeModel>();
		String sql = "select collegeID,collegeName from college_info";
		int i=0;
		try {
			con = DBConn.getConn();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				college_item = new CollegeModel();
				college_item.setCollegeID(rs.getInt("collegeID"));
				college_item.setCollegeName(rs.getString("collegeName"));
				//System.out.println(rs.getString("collegeName"));
				collegeInfo.add(college_item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConn.dbClose(con, ps, rs);
		}
		//System.out.println(i);
		return collegeInfo;
	}

}
